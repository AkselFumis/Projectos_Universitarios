package Unidad2.Clase6Animales;

public abstract class Animal {

    protected double peso;

    public Animal(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract void comer();

}
