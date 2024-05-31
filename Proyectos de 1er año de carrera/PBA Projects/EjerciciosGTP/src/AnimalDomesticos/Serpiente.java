package AnimalDomesticos;

import java.util.Objects;

public class Serpiente extends Animal {

    public Serpiente(String nombre, String tipo, int numeroPatas) {
        super(nombre, tipo, numeroPatas);
    }

    @Override
    public boolean esDomestico() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Serpiente other = (Serpiente) obj;
        if (this.numeroPatas != other.numeroPatas) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.tipo, other.tipo);
    }
    
    @Override
    public String toString() {
        return "Serpiente{" + " Nombre: " + nombre + ", Especie: " + tipo + '}';
    }
}
