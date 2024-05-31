package Unidad2.Clase6Animales;

public abstract class Mamifero extends Animal {

    protected boolean sangreCaliente;

    public Mamifero(boolean sangreCaliente, double peso) {
        super(peso);
        this.sangreCaliente = sangreCaliente;
    }

    public boolean isSangreCaliente() {
        return sangreCaliente;
    }

    public void setSangreCaliente(boolean sangreCaliente) {
        this.sangreCaliente = sangreCaliente;
    }

    public void parir() {
        System.out.println("Un mamifero pariendo");
    }

    public void amamantar() {
        System.out.println("Un mamifero amamantando");
    }
}
