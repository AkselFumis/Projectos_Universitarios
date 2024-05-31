
package Unidad2.GuiaEjercicios.Ejercicio5;


public class GestionDivisas {

    
    public static void main(String[] args) {
        
        Moneda d = new Euro(100);
        Moneda p = new Dolar(100);
        
        d.setCantidad(d.suma(p).getCantidad());
        System.out.println(d);
    }
    
}
