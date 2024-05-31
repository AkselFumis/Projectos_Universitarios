<?php

include_once 'Conexion.class.php';

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    if (isset($_FILES["archivoCSV"]) && $_FILES["archivoCSV"]["error"] == 0) {
        $nombreArchivo = $_FILES["archivoCSV"]["name"];
        $rutaTemporal = $_FILES["archivoCSV"]["tmp_name"];
        $extension = pathinfo($nombreArchivo, PATHINFO_EXTENSION);

        if ($extension != "csv") {
            echo "El archivo debe ser de tipo CSV.";
            exit;
        }

        $errores = array();

        $fechaActual = new DateTime();
        $fechaHaceUnAnio = $fechaActual->modify('-1 year')->format('Y-m-d');

        // Procesar el archivo CSV
        $lineas = file($rutaTemporal);
        $lineaNumero = 0;
        $primeraLinea = true;
        foreach ($lineas as $linea) {
            $lineaNumero++;

            if ($primeraLinea) {
                $primeraLinea = false;
                continue;
            }

            $datos = str_getcsv($linea, ";");
            if (count($datos) != 6) {
                echo "Error en la línea $lineaNumero: La línea no tiene 6 columnas.";
                continue;
            }

            $fecha_str = $datos[0];
            $formato = 'd/m/Y';
            $fecha_date = date_create_from_format($formato, $fecha_str);
            $fecha = $fecha_date->format('Y-m-d');

            $tipoComprobante = $datos[1];

            $puntoVent = $datos[2];
            $puntoVenta = ltrim($puntoVent, '0');

            $numeroComp = $datos[3];
            $numeroComprobante = ltrim($numeroComp, '0');

            $importeVent = $datos[4];
            $importeVenta = number_format($importeVent, 2, '.', '');
            $cuitCliente = $datos[5];

            $validaciones = "";

            // Validar la fecha
            if (!validateFecha($fecha)) {
                $validaciones .= "Error en los datos de la fecha en la línea $lineaNumero.";
                $errores[] = "Error en los datos de la fecha en el registro " . ($lineaNumero - 1) . " - La fecha es del futuro o esta mal escrita";
            }

            // Validar el tipo de comprobante
            if (!validateTipoComprobante($tipoComprobante)) {
                $validaciones .= "Error en los datos del tipo de comprobante en la línea $lineaNumero.";
                $errores[] = "Error en los datos del tipo de comprobante en el registro " . ($lineaNumero - 1) . " - El comprobante no es ni A ni B";
            }

            // Validar el número de punto de venta
            if (!validatePuntoVenta($puntoVenta)) {
                $validaciones .= "Error en los datos del punto de venta en la línea $lineaNumero.";
                $errores[] = "Error en los datos del punto de venta en el registro " . ($lineaNumero - 1) . " - El numero del punto de venta es demasiado grande o tiene alguna letra";
            }

            // Validar el número de comprobante
            if (!validateNumeroComprobante($numeroComprobante)) {
                $validaciones .= "Error en los datos del número de comprobante en la línea $lineaNumero.";
                $errores[] = "Error en los datos del número de comprobante en el registro " . ($lineaNumero - 1) . " - El numero del comprobante es demasiado grande o tiene alguna letra";
            }

            // Validar el importe de venta
            if (!validateImporteVenta($importeVenta)) {
                $validaciones .= "Error en los datos del importe de venta en la línea $lineaNumero.";
                $errores[] = "Error en los datos del importe de venta en el registro " . ($lineaNumero - 1) . " - El importe de la venta es demasiado grande o tiene alguna letra";
            }

            // Validar el CUIT del cliente
            if (!validateCuitCliente($cuitCliente)) {
                $validaciones .= "Error en los datos del CUIT del cliente en la línea $lineaNumero.";
                $errores[] = "Error en los datos del CUIT del cliente en el registro " . ($lineaNumero - 1) . " - La mayor cantidad de cifras permitidas en estos CUIT son de 11 o tiene alguna letra";
            }

            if (empty($validaciones)) {


                $conexionBD = new Conexion();
                $conexion = $conexionBD->obtenerConexion();

                // Iniciar una transacción
                $conexion->beginTransaction();

                try {
                    // Insercion de nuevo registro en la tabla import_venta
                    $sql = "INSERT INTO import_venta (fecha, tipo_comprobante, punto_venta, numero_comprobante, importe_venta, cuit_cliente) VALUES (?, ?, ?, ?, ?, ?)";
                    $stmt = $conexion->prepare($sql);

                    if ($stmt) {
                        $stmt->bindParam(1, $fecha, PDO::PARAM_STR);
                        $stmt->bindParam(2, $tipoComprobante, PDO::PARAM_STR);
                        $stmt->bindParam(3, $puntoVenta, PDO::PARAM_STR);
                        $stmt->bindParam(4, $numeroComprobante, PDO::PARAM_STR);
                        $stmt->bindParam(5, $importeVenta, PDO::PARAM_STR);
                        $stmt->bindParam(6, $cuitCliente, PDO::PARAM_INT);

                        
                        if ($stmt->execute()) {
                            
                            
                                // Obtener el CUIT del cliente de la línea actual
                                $datos = str_getcsv($linea, ";");
                                $cuitCliente = $datos[5];

                                // Verificar si el CUIT existe en stats_ventas
                                $stmt = $conexion->prepare("SELECT id FROM stats_ventas WHERE cuit_cliente = ?");
                                $stmt->bindParam(1, $cuitCliente, PDO::PARAM_INT);
                                $stmt->execute();

                                if ($stmt->rowCount() == 0) {
                                    // Si el CUIT no existe, lo insertamos
                                    $stmt = $conexion->prepare("INSERT INTO stats_ventas (cuit_cliente, ytd) VALUES (?, 0)");
                                    $stmt->bindParam(1, $cuitCliente, PDO::PARAM_INT);
                                    $stmt->execute();
                                }

                                // Actualizar el campo YTD
                                $stmt = $conexion->prepare("UPDATE stats_ventas SET ytd = (SELECT SUM(importe_venta) FROM import_venta WHERE cuit_cliente = ? AND fecha >= ?) WHERE cuit_cliente = ?");
                                $stmt->bindParam(1, $cuitCliente, PDO::PARAM_INT);
                                $stmt->bindParam(2, $fechaHaceUnAnio, PDO::PARAM_STR);
                                $stmt->bindParam(3, $cuitCliente, PDO::PARAM_INT);
                                $stmt->execute();
                            
                        } else {
                            $errores[] = "Error al insertar datos en la tabla import_ventas: " . $stmt->error;
                        }

                        
                        $conexion->commit();
                    } else {
                        $errores[] = "Error en la preparación de la consulta: " . $conexion->error;
                    }
                } catch (Exception $e) {
       
                    $conexion->rollBack();
                    $errores[] = "Error: " . $e->getMessage();
                }
                $conexionBD->cerrarConexion();
                
            } else {
                $validaciones = "";
            }
        }
        if (!empty($errores)) {
            $mensajeErrores = implode("<br>", $errores);
            header("Location: index.php?errores=$mensajeErrores");
            exit;
        }
        header("Location: ../TP2/index.php");
        exit;
    } else {
        $errores[] = "Se ha producido un error al cargar el archivo.";
    }
    if (!empty($errores)) {
            $mensajeErrores = implode("<br>", $errores);
            header("Location: index.php?errores=$mensajeErrores");
    exit;}
}

function validateFecha($fecha) {

    $fecha_actual = new DateTime();

    if ($fecha > $fecha_actual->format('Y-m-d')) {
        return false;
    }

    return true;
}

function validateTipoComprobante($tipoComprobante) {

    return in_array($tipoComprobante, ['A', 'B']);
}

function validatePuntoVenta($puntoVenta) {

    if (preg_match("/^\d{1,5}$/", $puntoVenta)) {
        return true;
    }

    return false;
}

function validateNumeroComprobante($numeroComprobante) {

    if (preg_match("/^\d{1,10}$/", $numeroComprobante)) {
        return true;
    }

    return false;
}

function validateImporteVenta($importeVenta) {

    if (!is_numeric($importeVenta)) {
        return false; // No es un número válido
    }


    if (preg_match("/^\d{1,13}(\.\d{2})?$/", $importeVenta)) {
        return true;
    }

    return false;
}

function validateCuitCliente($cuitCliente) {
    if (preg_match("/^\d{1,11}$/", $cuitCliente)) {
        return true;
    }

    return false;
}
