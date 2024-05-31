/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Gerardo
 */
public class Locomotora {

    public double superficie() {
        double resultado = 0.0;

        Figura R1 = new Rectangulo(6, 4);
        resultado += R1.area();
        Figura R2 = new Rectangulo(3, 2);
        resultado += R2.area();
        Figura R3 = new Rectangulo(2, 2);
        resultado += R3.area();
        Figura C1 = new Circulo(1);
        resultado += C1.area();
        Figura C2 = new Circulo(1);
        resultado += C1.area();
        Figura T1 = new Triangulo(2, 2);
        resultado += T1.area();

        return resultado;
    }

}
