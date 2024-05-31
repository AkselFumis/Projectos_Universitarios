package Libreria;

import java.util.LinkedList;
import java.util.List;

public class Libreria {

    List<Libro> libreria = new LinkedList<>();

    public Libreria() {
    }

    public void añadirLibro(Libro a) {
        libreria.add(a);
    }

    public void eliminarLibro(Libro a) {
        libreria.remove(a);
    }

    public Libro buscarLibro(String a) {
        for (Libro l : this.libreria) {
            if (a.equals(l.getTitulo())) {
                return l;
            }
        }
        return null;
    }

    public List<Libro> listarLibros() {
        return libreria;
    }
}
