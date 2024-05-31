<?php

ob_start();

include 'Ejercicio 1.php';

ob_clean();

function convertirMatrizAMayusculas($matriz) {
    
    if (!is_array($matriz) || empty($matriz)) {
        return "El argumento no es una matriz válida.";
    }

    foreach ($matriz as $fila => $elementos) {
        foreach ($elementos as $columna => $valor) {
            if (is_array($valor)) {
                $matriz[$fila][$columna] = convertirMatrizAMayusculas($valor); 
            } else {
                $matriz[$fila][$columna] = strtoupper($valor); 
            }
        }
    }

    return $matriz;
}


$miMatriz = array(
    array("hola", "mundo"),
    array("en", "php"),
    array(123, "axel 14.32"),
);

echo "<h1>Ejercicio 2</h1>";

echo 'Matriz Original <br><br>';

echo "<pre>";
print_r($miMatriz);
echo "</pre>";

$miMatrizMayusculas = convertirMatrizAMayusculas($miMatriz);

echo '<br>Matriz Mayusculas <br><br>';


echo "<pre>";
print_r($miMatrizMayusculas);
echo "</pre>";
