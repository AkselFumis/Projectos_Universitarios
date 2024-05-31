package Unidad2.Clase6Animales;

public class Perro extends Mamifero {

    private String colorPelo;

    public Perro(String colorPelo, boolean sangreCaliente, double peso) {
        super(sangreCaliente, peso);
        this.colorPelo = colorPelo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    @Override
    public void comer() {
        System.out.println("Un perro comiendo");
    }

}
