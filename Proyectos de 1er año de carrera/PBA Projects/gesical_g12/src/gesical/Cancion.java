package gesical;

public class Cancion implements Comparable{
    private String nombre;
    private int duracionEnSegs;

    public Cancion(String nombre, int duracionEnSegs) {
        this.nombre = nombre;
        this.duracionEnSegs = duracionEnSegs;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionEnSegs() {
        return duracionEnSegs;
    }

    public void setDuracionEnSegs(int duracionEnSegs) {
        this.duracionEnSegs = duracionEnSegs;
    }

    @Override
    public String toString() {
        return "Cancion{" + "Nombre: " + nombre + ", Duración en segundos: " + duracionEnSegs + '}';
    }

    @Override
    public int compareTo(Object o) {
        if((((Cancion)o).getNombre()).equals(this.nombre)&&(((Cancion)o).getDuracionEnSegs())== this.duracionEnSegs){
            return 1;
        }
        else{
            return 0;
        }
    }
}
