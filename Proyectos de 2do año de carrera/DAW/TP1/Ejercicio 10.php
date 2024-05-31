<?php

function fibonacci($n) {
    $fibonacciArray = [];

    if ($n >= 1) {
        $fibonacciArray[] = 0;
    }
    if ($n >= 2) {
        $fibonacciArray[] = 1;
    }

    for ($i = 2; $i < $n; $i++) {
        $fibonacciArray[] = $fibonacciArray[$i - 1] + $fibonacciArray[$i - 2];
    }

    return $fibonacciArray;
}

echo "<h1>Ejercicio 10</h1>";
// Modifique el $n para obtener la cantidad de numeros deseada
$n = 17;
$resultado = fibonacci($n);


foreach ($resultado as $numero) {
    echo $numero . " ";
}


