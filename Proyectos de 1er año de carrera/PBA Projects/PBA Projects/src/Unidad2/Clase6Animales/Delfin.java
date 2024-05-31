package Unidad2.Clase6Animales;

public class Delfin extends Mamifero {

    public Delfin(boolean sangreCaliente, double peso) {
        super(sangreCaliente, peso);
    }

    @Override
    public void comer() {
        System.out.println("Un delfin comiendo");
    }

}
