
package gesicalexamen;

import java.util.*;


public class Disco {
    private String titulo;
    private int añoEdicion;
    Set<Cancion> canciones =new HashSet<>();

    public Disco(String titulo, int añoEdicion) {
        this.titulo = titulo;
        this.añoEdicion = añoEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public Set<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(Set<Cancion> canciones) {
        this.canciones = canciones;
    }
    public void agregarCancion(Cancion c){
        canciones.add(c);
    }
    public void EliminarCancion(Cancion c){
        canciones.remove(c);
    }
    
    public int duracion(){
        int suma=0;
        for(Cancion c :this.canciones){
            suma +=c.getDuracion();
        }
        return suma;
    }
}
