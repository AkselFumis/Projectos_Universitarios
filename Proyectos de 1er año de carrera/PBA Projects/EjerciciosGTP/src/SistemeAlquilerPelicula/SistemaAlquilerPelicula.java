package SistemeAlquilerPelicula;

import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;
import java.util.Iterator;

public class SistemaAlquilerPelicula {

    LocalDate fecha = LocalDate.now();
    List<Pelicula> peliculasDisponibles = new LinkedList<>();
    List<Pelicula> peliculas = new LinkedList<>();

    public SistemaAlquilerPelicula() {
    }

    public void añadirPelicula(Pelicula e) {
        this.peliculasDisponibles.add(e);
        this.peliculas.add(e);
    }

    public void eliminarPelicula(Pelicula e) {
        this.peliculasDisponibles.remove(e);
        this.peliculas.remove(e);
    }

    public void alquilarPelicula(Pelicula p, Usuario u) {
        if (peliculasDisponibles.contains(p)) {
            u.añadirAlquiler(new Alquiler(p, fecha, LocalDate.of(2023, 2, 15)));
            this.peliculasDisponibles.remove(p);
        } else {
            System.out.println("La pelicula no se encuentra disponible");
        }
    }

    public void devolverPelicula(Pelicula p, Usuario u) {
        Iterator it = u.getAlquileres().iterator();
        boolean encontrado = true;
        while (it.hasNext() && encontrado) {
            Alquiler a = (Alquiler) it.next();
            if (a.getPeliAlquilada().equals(p)) {
                peliculasDisponibles.add(p);
                encontrado = false;
            }
        }
        if (encontrado) {
            System.out.println("Este usuario no posee la Pelicula");
        }

    }

    public Pelicula buscarPelicula(String s) {
        for (Pelicula b : peliculas) {
            if (b.getTitulo().equals(s)) {
                return b;
            }
        }
        System.out.println("La pelicula buscada no se encuentra disponible");
        return null;
    }

    public void mostrarHistorialAlquileres(Usuario u) {
        System.out.println(u.getAlquileres());
    }

    public void mostrarPeliculasDisponibles() {
        System.out.println(this.peliculasDisponibles);
    }
}
