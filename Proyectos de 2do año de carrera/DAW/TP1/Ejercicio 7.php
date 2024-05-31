<?php

function cuentaRegresiva($fechaObjetivo) {
    
    $timestampObjetivo = strtotime($fechaObjetivo);

    if ($timestampObjetivo === false) {
        
        return "Fecha no válida";
    }

    
    $timestampActual = time();

    
    $diferenciaSegundos = $timestampObjetivo - $timestampActual;

    if ($diferenciaSegundos < 0) {
        
        return "La fecha ya paso";
    }

    
    $dias = floor($diferenciaSegundos / (60 * 60 * 24));
    $diferenciaSegundos -= $dias * (60 * 60 * 24);
    $horas = floor($diferenciaSegundos / (60 * 60));
    $diferenciaSegundos -= $horas * (60 * 60);
    $minutos = floor($diferenciaSegundos / 60);
    $segundos = $diferenciaSegundos % 60;

    
    return "Faltan $dias días, $horas horas, $minutos minutos y $segundos segundos.";
}

echo "<h1>Ejercicio 7</h1>";

$fechaObjetivo = "2023-09-30 12:00:00"; 
echo cuentaRegresiva($fechaObjetivo);


