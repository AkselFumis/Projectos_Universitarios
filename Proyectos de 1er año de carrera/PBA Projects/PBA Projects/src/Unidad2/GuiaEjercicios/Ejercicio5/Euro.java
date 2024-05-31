
package Unidad2.GuiaEjercicios.Ejercicio5;


public class Euro extends Moneda {

    public Euro(double cantidad) {
        super(cantidad);
    }

    @Override
    public Moneda suma(Moneda unaMoneda) {
        unaMoneda.setCantidad((((unaMoneda.asDolar()).getCantidad())*1.07) + this.cantidad);
        return new Euro(unaMoneda.getCantidad());
    }

    @Override
    public Dolar asDolar() {
        return new Dolar(this.cantidad*1.07);
    }

    @Override
    public String toString() {
        return "Euro{" +"Cantidad =" + this.cantidad+ '}';
    }
    
}
