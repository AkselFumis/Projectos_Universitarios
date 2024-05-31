package Unidad2.Clase5Figuras;

public class Circulo extends Figura {

    private final double PI = Math.PI;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return radio * radio * PI;
    }

    @Override
    public String toString() {
        return "Circulo{" + "PI=" + PI + ", radio=" + radio + '}';
    }

}
