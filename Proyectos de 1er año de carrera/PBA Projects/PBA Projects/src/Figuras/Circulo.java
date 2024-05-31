package Figuras;

public class Circulo extends Figura {

    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return 3.14 * (this.radio * this.radio);
    }

}
