
package Futbol;


public class Jugador implements Comparable<Jugador> {
    private String apellido,nombre;
    private int velocidadMaxima,edad;

    public Jugador(String apellido, String nombre,int edad, int velocidadMaxima) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.velocidadMaxima = velocidadMaxima;
        this.edad = edad;
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

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre Completo:" + apellido+" " + nombre + ", Altura: " + velocidadMaxima + ", Edad: " + edad + " Puntaje: "+this.Puntaje()+ '}';
    }
    public int Puntaje(){
        return velocidadMaxima*(50 - edad);
    }

    @Override
    public int compareTo(Jugador o) {
        return this.getApellido().compareTo(o.getApellido());
    }
    
}
