package Unidad2.Clase6Animales;

public class Oviparo extends Animal {

    public Oviparo(double peso) {
        super(peso);
    }

    public void ponerHuevo() {
        System.out.println("Un oviparo poniendo Huevo");
    }

    @Override
    public void comer() {
        System.out.println("Un oviparo comiendo");
    }

}
