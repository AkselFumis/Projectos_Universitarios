package AnimalDomesticos;

public class Perro extends Animal {

    public Perro(String nombre, String tipo, int numeroPatas) {
        super(nombre, tipo, numeroPatas);
    }

    @Override
    public boolean esDomestico() {
        return true;
    }

    @Override
    public String toString() {
        return "Perro{" + " Nombre: " + nombre + ", Especie: " + tipo + '}';
    }
}
