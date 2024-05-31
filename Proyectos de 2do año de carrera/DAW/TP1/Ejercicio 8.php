<?php

function calcularSegundosTranscurridos($fechaInicio, $fechaFin) {
    
    $timestampInicio = strtotime($fechaInicio);
    $timestampFin = strtotime($fechaFin);

    if ($timestampInicio === false || $timestampFin === false) {
        
        return "Fechas no válidas";
    }

    // Calcula la diferencia en segundos
    $segundosTranscurridos = abs($timestampFin - $timestampInicio);

    return $segundosTranscurridos;
}

echo "<h1>Ejercicio 8</h1>";


$fechaInicio = "2023-09-18 12:00:00"; 
$fechaFin = "2023-09-19 14:30:00";   
$segundos = calcularSegundosTranscurridos($fechaInicio, $fechaFin);

echo "Segundos transcurridos: $segundos segundos.";


