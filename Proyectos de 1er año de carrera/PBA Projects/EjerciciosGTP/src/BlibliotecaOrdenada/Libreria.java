package BlibliotecaOrdenada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Libreria {

    public static void main(String[] args) {
        List<Libro> libreria = new ArrayList<>();

        libreria.add(new Libro("El Quijote", "Miguel de Cervantes", 1605, 9));
        libreria.add(new Libro("Don Juan Tenorio", "José Zorrilla", 1844, 8));
        libreria.add(new Libro("La Ilíada", "Homero", -800, 9));
        libreria.add(new Libro("La Odisea", "Homero", -830, 8));
        libreria.add(new Libro("La Metamorfosis", "Franz Kafka", 1915, 9));
        libreria.add(new Libro("Drácula", "Bram Stoker", 1897, 7));
        libreria.add(new Libro("La Divina Comedia", "Dante Alighieri", 1321, 10));

        for (Libro l : libreria) {
            System.out.println(l);
        }

        Collections.sort(libreria, (c1, c2) -> c1.getTitulo().compareTo(c2.getTitulo()));
        System.out.println("Ordenados Alfabeticamente por Titulo");
        for (Libro l : libreria) {
            System.out.println(l);
        }
        Collections.sort(libreria, (c1, c2) -> c1.getAutor().compareTo(c2.getAutor()));
        System.out.println("Ordenados Alfabeticamente por Autor");
        for (Libro l : libreria) {
            System.out.println(l);
        }
        Collections.sort(libreria, (c1, c2) -> c1.getAñoPublicacion() - c2.getAñoPublicacion());
        System.out.println("Ordenados por año de publicacion");
        for (Libro l : libreria) {
            System.out.println(l);
        }
        Collections.sort(libreria, (c1, c2) -> c2.getPuntuacion() - c1.getPuntuacion());

        System.out.println("Ordenados por Puntacion");
        for (Libro l : libreria) {
            System.out.println(l);
        }

    }

}
