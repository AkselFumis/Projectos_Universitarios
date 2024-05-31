<?php

function productoCartesianoMatrices($matriz1, $matriz2) {
    // Verificar si ambos argumentos son matrices de dos dimensiones
    if (!esMatriz2D($matriz1) || !esMatriz2D($matriz2)) {
        return "Ambos argumentos deben ser matrices de 2 dimensiones.";
    }

    
    $resultado = array();

    // Recorrer ambas matrices y calcular el producto cartesiano
    foreach ($matriz1 as $fila1) {
        foreach ($matriz2 as $fila2) {
            $resultado[] = array_merge($fila1, $fila2);
        }
    }

    return $resultado;
}

function esMatriz2D($matriz) {
    if (!is_array($matriz)) {
        return false;
    }

    // Verificar si todas las filas tienen la misma cantidad de elementos
    $numElementos = count($matriz[0]);
    foreach ($matriz as $fila) {
        if (!is_array($fila) || count($fila) !== $numElementos) {
            return false;
        }
    }

    return true;
}

echo "<h1>Ejercicio 4</h1>";

$matriz1 = array(
    array(1, 2),
    array(3, 4),
);


echo "<pre>";
print_r($matriz1);
echo "</pre>";

$matriz2 = array(
    array('a', 'b'),
    array('c', 'd'),
);


echo "<pre>";
print_r($matriz2);
echo "</pre>";

$resultado = productoCartesianoMatrices($matriz1, $matriz2);


echo "<pre>";
print_r($resultado);
echo "</pre>";

