package AnimalDomesticos;

public class EjercicioSet {

    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        zoo.agregarAnimal(new Serpiente("Tito", "Cobra", 0));
        zoo.agregarAnimal(new Serpiente("Tito", "Cobra", 0));
        zoo.agregarAnimal(new Serpiente("Jose", "Mama negra", 0));
        zoo.agregarAnimal(new Gato("Maria", "Lince", 4));
        zoo.agregarAnimal(new Gato("Maria", "Lince", 4));
        zoo.agregarAnimal(new Gato("Caren", "Callejero", 4));
        zoo.agregarAnimal(new Perro("Miguel", "Doberman", 4));
        zoo.agregarAnimal(new Perro("Pedro", "Golden Terry", 4));
        zoo.agregarAnimal(new Perro("Luca", "Breton", 4));

        for (Animal a : zoo.getAnimales()) {

            System.out.print(a + "  ");

        }
        System.out.println("");
        for (Animal a : zoo.getAnimales()) {
            if (a.esDomestico()) {
                System.out.print(a + "  ");
            }
        }
    }

}
