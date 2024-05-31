package Unidad2.GuiaEjercicios;

public class Pc extends Computadora {

    public Pc(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String toString() {
        return "Pc: " + marca + " - Modelo: " + modelo;
    }
}
