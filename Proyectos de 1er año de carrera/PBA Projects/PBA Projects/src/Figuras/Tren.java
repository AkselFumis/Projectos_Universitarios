/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author Gerardo
 */
public class Tren {

    public double superficie() {
        double resultado = 0.0;
        Locomotora l = new Locomotora();
        resultado += l.superficie();
        Vagon v = new Vagon();
        resultado += v.superficie();

        return resultado;
    }
}
