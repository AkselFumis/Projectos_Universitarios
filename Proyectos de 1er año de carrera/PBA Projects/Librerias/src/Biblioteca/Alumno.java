
package Biblioteca;


public class Alumno extends Cliente {
    private int legajo;

    public Alumno(int legajo, int dni, String apellido, String nombre) {
        super(dni, apellido, nombre);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Alumno{"+ "dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", libroPrestado=" + libroPrestado + "legajo=" + legajo + '}';
    }
    
}
