
package Biblioteca;

import java.util.*;


public class Cliente {
    protected int dni;
    protected String apellido,nombre;
    List<Libro> libroPrestado = new LinkedList<>();

    public Cliente(int dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(List<Libro> libroPrestado) {
        this.libroPrestado = libroPrestado;
    }
    
    public void agregarLibro(Libro a){
        libroPrestado.add(a);
    }
    public void eliminarLibro(Libro a){
        libroPrestado.remove(a);
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", libroPrestado=" + libroPrestado + '}';
    }
    
    
}
