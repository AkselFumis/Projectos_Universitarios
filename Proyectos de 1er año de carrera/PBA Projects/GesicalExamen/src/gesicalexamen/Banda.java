
package gesicalexamen;

import java.util.*;


public class Banda extends Musico{
    private String titulo;
    Set<Solista> solistas = new HashSet<>();

    public Banda(String titulo, String genero, String discografia, int añoInicio) {
        super(genero, discografia, añoInicio);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Solista> getSolistas() {
        return solistas;
    }

    public void setSolistas(Set<Solista> solistas) {
        this.solistas = solistas;
    }
    
    
    public void agregarSolista(Solista s){
        solistas.add(s);
    }
    
}
