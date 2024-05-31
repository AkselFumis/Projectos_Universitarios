package gesical;

import java.util.*;

public class Disco {
    private int añoEdicion;
    private String titulo;
    private String generoMusical;
    private List <Cancion> listaCanciones = new LinkedList <> ();

    public Disco(int añoEdicion, String titulo, String generoMusical) {
        this.añoEdicion = añoEdicion;
        this.titulo = titulo;
        this.generoMusical=generoMusical;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    
    @Override
    public String toString() {
        return "Disco{" + "Año de edición: " + añoEdicion + ", Título: " + titulo + ", Género musical: " + generoMusical + ", Lista de canciones: " + listaCanciones +'}';
    }
    
     public void añadirCancion(Cancion a){
        this.listaCanciones.add(a);
    }
    
    public void eliminarCancion(Cancion a){
        this.listaCanciones.remove(a);
    }
    
    public boolean hayCancionRepetida(Cancion o){
        boolean CancionRepetida=false;
        for(int i=0;this.listaCanciones.size()>i;i++){
            if(o.getNombre().equals(((Cancion)this.listaCanciones.get(i)).getNombre())&& o.getDuracionEnSegs()==(((Cancion)this.listaCanciones.get(i)).getDuracionEnSegs())){
                CancionRepetida=true;
            }
        }
        return CancionRepetida;
    }
    
    public int duracionDisco(){
        int duracionTotal=0;
        
        for(Cancion o: this.listaCanciones){
            duracionTotal= duracionTotal + o.getDuracionEnSegs();
        }
        return duracionTotal;
    }
    
    public void mostrarCancionesDisco(){
        for(Cancion c:this.listaCanciones){
            System.out.println("Cancion: "+c.getNombre()+" - Duracion: "+c.getDuracionEnSegs()+" Seg");
        }
    }
}
