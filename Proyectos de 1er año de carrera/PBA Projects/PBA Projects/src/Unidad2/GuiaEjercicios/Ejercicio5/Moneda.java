
package Unidad2.GuiaEjercicios.Ejercicio5;


public abstract class Moneda {
    protected double cantidad;

    public Moneda(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public abstract Moneda suma(Moneda unaMoneda);
    public abstract Dolar asDolar();

    
}
