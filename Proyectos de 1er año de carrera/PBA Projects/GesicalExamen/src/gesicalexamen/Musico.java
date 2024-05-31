
package gesicalexamen;

import java.util.*;


public class Musico {
    protected String genero,discografia;
    protected int añoInicio;
    List<Disco> discos = new LinkedList<>();

    public Musico(String genero, String discografia, int añoInicio) {
        this.genero = genero;
        this.discografia = discografia;
        this.añoInicio = añoInicio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }

    public int getAñoInicio() {
        return añoInicio;
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public void setDiscos(List<Disco> discos) {
        this.discos = discos;
    }

    public void setAñoInicio(int añoInicio) {
        this.añoInicio = añoInicio;
    }
    
    public void agregarDisco(Disco a){
        discos.add(a);
    }
    
    public void eliminarDisco(Disco a){
        discos.remove(a);
    }
}
