<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\ImportVenta;
use App\Models\Cliente;


class ImportacionController extends Controller {

    public function index() {
        // Obtener todos los clientes de la base de datos
        $clientes = Cliente::all();

        // Pasar los clientes a la vista
        return view('importacion', ['clientes' => $clientes]);
    }

    public function procesarImportacion(Request $request) {

        $request->validate([
            'archivoCSV' => 'required|mimes:csv,txt',
        ]);

        // Obtener el archivo CSV del formulario
        $archivoCSV = $request->file('archivoCSV');

        // Obtener el contenido del archivo CSV
        $contenido = file_get_contents($archivoCSV->getPathname());

        // Dividir el contenido por líneas
        $lineas = explode("\n", $contenido);

        $encabezados = str_getcsv($lineas[0], ';');

        $errores = [];

        // Recorrer cada fila del CSV (empezar desde 1 para omitir los encabezados)
        for ($i = 1; $i < count($lineas); $i++) {

            // Obtener los valores de la fila actual
            $valores = str_getcsv($lineas[$i], ';');

            if (isset($valores[0]) && !empty($valores[0])) {


                $fechaConvertida = date('Y-m-d', strtotime(str_replace('/', '-', $valores[0])));

                // Verificar si la fecha del comprobante es futura
                if (strtotime($fechaConvertida) > strtotime(now())) {
                    $errores[] = "La fecha del comprobante en la línea $i no puede ser futura.";
                    continue; // Saltar a la siguiente iteración del bucle
                }

                // Verificar si el comprobante ya existe en la base de datos
                $comprobanteExistente = ImportVenta::where('tipo_comprobante', $valores[1])
                        ->where('numero_comprobante', $valores[3])
                        ->exists();

                // Validar que el comprobante no existe y no tenga un valor de cero
                if (!$comprobanteExistente && $valores[4] != 0) {

                    // Verificar si el cliente existe por CUIT o Nro Cliente
                    $cliente = Cliente::where('cuit', $valores[5])->orWhere('nro_cliente', $valores[7])->first();

                    // Si el cliente no existe, créalo
                    if (!$cliente) {
                        $cliente = new Cliente([
                            'cuit' => $valores[5],
                            'razon_social' => $valores[6],
                            'nro_cliente' => $valores[7],
                            'ytd' => 0,
                            'tier' => 1,
                        ]);
                        $cliente->save();
                    }


                    // Crear un nuevo modelo de ImportVenta
                    $importVenta = new ImportVenta([
                        'fecha' => $fechaConvertida,
                        'tipo_comprobante' => isset($valores[1]) ? $valores[1] : null,
                        'punto_venta' => isset($valores[2]) ? $valores[2] : null,
                        'numero_comprobante' => isset($valores[3]) ? $valores[3] : null,
                        'importe_venta' => isset($valores[4]) ? $valores[4] : null,
                        'cuit_cliente' => isset($valores[5]) ? $valores[5] : null,
                        'razon_social' => isset($valores[6]) ? $valores[6] : null,
                        'nro_cliente' => isset($valores[7]) ? $valores[7] : null,
                    ]);

                    // Actualizar YTD Y Tier del cliente
                    $this->actualizarYTD($cliente, $valores[4]);

                    $importVenta->save();
                } else {
                    
                    $errores[] = "Comprobante repetido o con valor cero en la línea $i";
                }
            }
        }

        // Redireccionar con mensajes de éxito o errores
        if (count($errores) > 0) {
            return redirect()->route('importacion.index')->withErrors($errores);
        } else {
            return redirect()->route('importacion.index')->with('success', 'Importación exitosa');
        }
    }

    // Función para actualizar YTD del cliente
    private function actualizarYTD($cliente, $importeVenta) {

        $ytdActual = $cliente->ytd;

        $ytdActual += $importeVenta;

        
        $cliente->update(['ytd' => $ytdActual]);

        // Actualizar Tier del cliente
        $this->actualizarTierCliente($cliente);
    }

    // Función para actualizar Tier del cliente
    private function actualizarTierCliente($cliente) {
        // Obtener el YTD actualizado del cliente
        $ytdActualizado = $cliente->fresh()->ytd;

        // Actualizar el campo "tier" en función del YTD
        $tier = 1;
        if ($ytdActualizado > 0 && $ytdActualizado <= 1000) {
            $tier = 1;
        } elseif ($ytdActualizado > 1000 && $ytdActualizado <= 3000) {
            $tier = 2;
        } elseif ($ytdActualizado > 3000) {
            $tier = 3;
        }

        
        $cliente->update(['tier' => $tier]);
    }
}
