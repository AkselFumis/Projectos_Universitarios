<?php

function convertirArrayAMayusculas($array) {
    
    if (!is_array($array)) {
        return strtoupper($array);
    }

    
    $resultado = array();

    // Recorrer el array original y aplicar la función recursiva a cada elemento
    foreach ($array as $clave => $valor) {
        $resultado[$clave] = convertirArrayAMayusculas($valor);
    }

    return $resultado;
}


$miArray = array(
    "hola",
    array("mundo", "en", "php"),
    "esto",
    array("es", "un", "array", "multidimensional"),
);

echo "<h1>Ejercicio 3</h1>";

echo 'Matriz Muldimensional Original <br><br>';

echo "<pre>";
print_r($miArray);
echo "</pre>";

$miArrayMayusculas = convertirArrayAMayusculas($miArray);

echo 'Matriz Muldimensional Mayuscula <br><br>';

echo "<pre>";
print_r($miArrayMayusculas);
echo "</pre>";
