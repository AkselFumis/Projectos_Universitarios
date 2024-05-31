package Biblioteca;


public class Profesor extends Cliente {
    private int legajo;

    public Profesor(int legajo, int dni, String apellido, String nombre) {
        super(dni, apellido, nombre);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
}
