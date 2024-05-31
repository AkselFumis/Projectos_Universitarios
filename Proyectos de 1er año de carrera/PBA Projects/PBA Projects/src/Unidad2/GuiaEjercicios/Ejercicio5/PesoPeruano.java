
package Unidad2.GuiaEjercicios.Ejercicio5;


public class PesoPeruano extends Moneda{

    public PesoPeruano(double cantidad) {
        super(cantidad);
    }

    @Override
    public Moneda suma(Moneda unaMoneda) {
        unaMoneda.setCantidad((((unaMoneda.asDolar()).getCantidad())*3.9) + this.cantidad);
        return new Euro(unaMoneda.getCantidad());
    }

    @Override
    public Dolar asDolar() {
        return new Dolar(this.cantidad/3.9);
    }

    @Override
    public String toString() {
        return "PesoPeruano{" +" Cantidad= "+this.cantidad+ '}';
    }
    
    
    
}
