<?php

function convertirAMayusculas($array) {
    if (!is_array($array)) {
        return false;
    }

    $resultado = array(); // 

    foreach ($array as $elemento) {
        if (is_string($elemento)) {
            $elementoMayusculas = strtoupper($elemento);
            $resultado[] = $elementoMayusculas;
        } else {
            $resultado[] = $elemento;
        }
    }

    return $resultado;
}

echo "<h1>Ejercicio 1</h1>";
$arrayOriginal = array("Hola", "Mundo", 123, "PHP");
$arrayMayusculas = convertirAMayusculas($arrayOriginal);
echo 'Array de Original <br><br>';
foreach ($arrayOriginal as $elemento) {
    echo $elemento . "<br>";
}
echo '<br>Array de Mayusculas <br><br>';
foreach ($arrayMayusculas as $elemento) {
    echo $elemento . "<br>";
}



