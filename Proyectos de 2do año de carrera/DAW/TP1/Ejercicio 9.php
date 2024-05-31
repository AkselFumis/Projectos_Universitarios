<?php
function floatToTextWithCurrency($numero) {
    $formatter = new NumberFormatter('es', NumberFormatter::SPELLOUT);

    try {
        // Dividimos el número en parte entera y parte decimal
        $parte_entera = floor($numero);
        $parte_decimal = $numero - $parte_entera;

        $numero_entero_texto = $formatter->format($parte_entera);
        
        // Convertimos la parte decimal a texto con mayor precisión
        $parte_decimal_texto = '';
        if ($parte_decimal > 0) {
            $centavos = intval(round($parte_decimal * 100, 0)); 
            $parte_decimal_texto = ' ' . $formatter->format($centavos) . ' centavos';
        }
        
        $moneda = "pesos";
        
        if ($parte_entera == 1) {
            $moneda = "peso";
        }

        $resultado = "$numero_entero_texto $moneda$parte_decimal_texto";
        return $resultado;
    } catch (Exception $e) {
        return "Error: No se pudo convertir el número a texto";
    }
}

echo "<h1>Ejercicio 9</h1>";

$numero = 1543.77;
$numeroEnTexto = floatToTextWithCurrency($numero);
echo $numero ." = ".$numeroEnTexto; 
