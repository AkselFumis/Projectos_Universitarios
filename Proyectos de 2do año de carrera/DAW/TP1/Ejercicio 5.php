<?php

function generarContraseña($longitud = 8) {
    $caracteresEspeciales = "!@#$%^&*()_+=-{}[]|:;<>,.?";
    $letrasMayusculas = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    $letrasMinusculas = 'abcdefghijklmnopqrstuvwxyz';
    $numeros = '0123456789';

    $todosCaracteres = $caracteresEspeciales . $letrasMayusculas . $letrasMinusculas . $numeros;

    $contraseña = '';

    $contraseña .= $caracteresEspeciales[rand(0, strlen($caracteresEspeciales) - 1)];
    $contraseña .= $letrasMayusculas[rand(0, strlen($letrasMayusculas) - 1)];
    $contraseña .= $letrasMinusculas[rand(0, strlen($letrasMinusculas) - 1)];
    $contraseña .= $numeros[rand(0, strlen($numeros) - 1)];

    for ($i = 0; $i < $longitud - 4; $i++) {
        $contraseña .= $todosCaracteres[rand(0, strlen($todosCaracteres) - 1)];
    }

    
    $contraseña = str_shuffle($contraseña);

    return $contraseña;
}


$contraseñaGenerada = generarContraseña(12);

echo "<h1>Ejercicio 5</h1>";

echo $contraseñaGenerada;
