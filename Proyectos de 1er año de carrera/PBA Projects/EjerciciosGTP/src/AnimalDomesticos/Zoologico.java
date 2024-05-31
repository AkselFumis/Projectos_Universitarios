package AnimalDomesticos;

import java.util.HashSet;
import java.util.Set;

public class Zoologico {

    private Set<Animal> animales = new HashSet<>();

    public Zoologico() {
    }

    public Set<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(Set<Animal> animales) {
        this.animales = animales;
    }

    public void agregarAnimal(Animal e) {
        this.animales.add(e);
    }
}
