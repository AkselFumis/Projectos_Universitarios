
package basket_axelfumis;


public class Jugador implements Comparable<Jugador> {
    private String apellido,nombre;
    private int altura,edad;

    public Jugador(String apellido, String nombre,int edad ,int altura ) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        
    }

    public Jugador() {
        this.apellido = "a";
        this.nombre = "a";
        this.altura = 1;
        this.edad = 99;
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Apellido:" + apellido + ", Nombre:" + nombre + this.puntaje()+'}';
    }

    @Override
    public int compareTo(Jugador o) {
        return this.apellido.compareTo(o.getApellido());
    }
    public int puntaje(){
        int puntaje= 0;
        puntaje =this.altura * ( 50 - this.edad);
        return puntaje;
    }
    public void ordenarPuntaje(){
        
    }
}
