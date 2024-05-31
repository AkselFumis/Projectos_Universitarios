package gesical;

import java.util.*;

public class Banda extends Musico {

    private String titulo;
    private List<Solista> listaSolistas = new ArrayList<>();
    

    public Banda(String generoMusical, int añoInicio, String discografica, String titulo) {
        super(generoMusical, añoInicio, discografica);
        this.titulo = titulo;
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

    public int getAñoInicio() {
        return añoInicio;
    }

    public void setAñoInicio(int añoInicio) {
        this.añoInicio = añoInicio;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public void agregarSolista(Solista a) {
        this.listaSolistas.add(a);
    }

    public void eliminarSolista(Solista a) {
        this.listaSolistas.remove(a);
    }

    @Override
    public String toString() {
        return "Banda{" + "Titulo: " + titulo + ", Discográfica: " + discografica +  ", Lista de solistas que la componen: " + listaSolistas +'}';
    }

    @Override
    public void listarDisco() {
        System.out.println(this.listaDiscos);
    }

    @Override
    public void agregarDisco(Disco a) {
        this.listaDiscos.add(a);
    }

    @Override
    public void eliminarDisco(Disco a) {
        this.listaDiscos.remove(a);
    }
}
