package AnimalDomesticos;

public class Gato extends Animal {

    public Gato(String nombre, String tipo, int numeroPatas) {
        super(nombre, tipo, numeroPatas);
    }

    @Override
    public boolean esDomestico() {
        return true;
    }
    @Override
    public String toString() {
        return "Gato{" + " Nombre: " + nombre + ", Especie: " + tipo + '}';
    }
}
