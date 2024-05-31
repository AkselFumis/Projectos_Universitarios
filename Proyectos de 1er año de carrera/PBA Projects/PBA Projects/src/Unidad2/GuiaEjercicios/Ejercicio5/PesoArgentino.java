
package Unidad2.GuiaEjercicios.Ejercicio5;


public class PesoArgentino extends Moneda {

    public PesoArgentino(double cantidad) {
        super(cantidad);
    }

    @Override
    public Moneda suma(Moneda unaMoneda) {
        unaMoneda.setCantidad((((unaMoneda.asDolar()).getCantidad())*185) + this.cantidad);
        return new PesoArgentino(unaMoneda.getCantidad());
    
    }

    @Override
    public Dolar asDolar() {
        return new Dolar(this.cantidad/185);
    }

    @Override
    public String toString() {
        return "PesoArgentino{" + "Cantidad =" + this.cantidad+'}';
    }
    
}
