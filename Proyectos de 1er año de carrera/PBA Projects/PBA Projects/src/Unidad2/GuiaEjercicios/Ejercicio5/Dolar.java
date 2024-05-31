package Unidad2.GuiaEjercicios.Ejercicio5;

public class Dolar extends Moneda {

    public Dolar(double cantidad) {
        super(cantidad);
    }

    @Override
    public Moneda suma(Moneda unaMoneda) {
        unaMoneda.setCantidad((unaMoneda.asDolar()).getCantidad() + this.cantidad);
        return new Dolar(unaMoneda.getCantidad());
    }

    @Override
    public Dolar asDolar() {
        return new Dolar(this.cantidad);
    }

    @Override
    public String toString() {
        return "Dolar{" + "Cantidad =" + this.cantidad + '}';
    }

}
