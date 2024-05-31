/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Gerardo
 */
public class Vagon {

    public double superficie() {
        double resultado = 0.0;

        Figura R1 = new Rectangulo(5, 4);
        resultado += R1.area();
        Figura C1 = new Circulo(1);
        resultado += (C1.area()) * 3;

        return resultado;

    }
}
