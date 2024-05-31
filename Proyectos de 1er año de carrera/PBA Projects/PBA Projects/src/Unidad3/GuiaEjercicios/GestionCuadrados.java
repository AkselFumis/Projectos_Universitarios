
package Unidad3.GuiaEjercicios;


public class GestionCuadrados {

    
    public static void main(String[] args) {
        Cuadrado a = new Cuadrado(40.4,50.5);
        Cuadrado b = new Cuadrado(40.4,50.5);
        
        System.out.println(a.esMayor(b));
        System.out.println(a.esMenor(b));
        System.out.println(a.esIgual(b));
    }
    
}
