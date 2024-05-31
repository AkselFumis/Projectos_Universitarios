
package SistemeAlquilerPelicula;

import java.util.LinkedList;
import java.util.List;


public class Usuario {
    private String nombre,apellido;
    List<Alquiler> alquileres = new LinkedList<>();
    List<Pelicula> peliculas = new LinkedList<>();

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
    
    public void añadirAlquiler(Alquiler a){
        alquileres.add(a);
    }
    public void eliminarAlquiler(Alquiler a){
        alquileres.remove(a);
    }
    
}
