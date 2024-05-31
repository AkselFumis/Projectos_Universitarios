
package Unidad4.Clase11CursosAlumnos;


public class Alumno implements Comparable{
    private String nombre;
    private int legajo;
    private float notaTp;

    public Alumno(String nombre, int legajo, float notaTp) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notaTp = notaTp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public float getNotaTp() {
        return notaTp;
    }

    public void setNotaTp(float notaTp) {
        this.notaTp = notaTp;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", legajo=" + legajo + ", notaTp=" + notaTp + '}';
    }

    @Override
    public int compareTo(Object o) {
        if(this.nombre.charAt(0)>((Alumno)o).getNombre().charAt(0))
            return 1;
        if(this.nombre.charAt(0)<((Alumno)o).getNombre().charAt(0))
            return -1;
        if(this.nombre.charAt(1)>((Alumno)o).getNombre().charAt(1))
            return 1;
        if(this.nombre.charAt(1)<((Alumno)o).getNombre().charAt(1))
            return -1;
        
        return 0;
    }
    
    
}
