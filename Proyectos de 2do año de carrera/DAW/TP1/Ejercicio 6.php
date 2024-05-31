<?php

function evaluarFortalezaContrasena($contrasena) {
    
    $longitud = strlen($contrasena);

    
    $contieneMayusculas = preg_match('/[A-Z]/', $contrasena);
    $contieneMinusculas = preg_match('/[a-z]/', $contrasena);
    $contieneNumeros = preg_match('/[0-9]/', $contrasena);
    $contieneEspeciales = preg_match('/[^A-Za-z0-9]/', $contrasena);

    //Letras y números no consecutivos
    $contieneConsecutivos = preg_match('/(.)\\1/', $contrasena);

    // Evaluar la fortaleza
    if ($longitud >= 12 && $contieneMayusculas && $contieneMinusculas && $contieneNumeros && $contieneEspeciales && !$contieneConsecutivos) {
        return "Muy Fuerte";
    } elseif ($longitud >= 8 && ($contieneMayusculas || $contieneMinusculas) && $contieneNumeros && !$contieneConsecutivos) {
        return "Fuerte";
    } elseif ($longitud >= 6 && ($contieneMayusculas || $contieneMinusculas) && $contieneNumeros) {
        return "Normal";
    } elseif ($longitud >= 6 && ($contieneMayusculas || $contieneMinusculas)) {
        return "Débil";
    } else {
        return "Muy Débil";
    }
}





echo "<h1>Ejercicio 6</h1>";

$contrasena = "Abcddsw";

$fortaleza = evaluarFortalezaContrasena($contrasena);
echo "La fortaleza de la contraseña ".$contrasena." es: $fortaleza <br><br>";


$contrasena = "Abc@1234"; 

$fortaleza = evaluarFortalezaContrasena($contrasena);

echo "La fortaleza de la contraseña ".$contrasena." es: $fortaleza <br><br>";

$contrasena = "Abc1234"; 

$fortaleza = evaluarFortalezaContrasena($contrasena);

echo "La fortaleza de la contraseña ".$contrasena." es: $fortaleza <br><br>";

$contrasena = "Abc@1234!·$%&"; 

$fortaleza = evaluarFortalezaContrasena($contrasena);

echo "La fortaleza de la contraseña ".$contrasena." es: $fortaleza <br><br>";
$contrasena = "Abcas"; 

$fortaleza = evaluarFortalezaContrasena($contrasena);

echo "La fortaleza de la contraseña ".$contrasena." es: $fortaleza ";


