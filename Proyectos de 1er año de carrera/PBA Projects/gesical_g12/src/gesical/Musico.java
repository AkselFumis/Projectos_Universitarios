package gesical;

import java.util.*;

public abstract class Musico {
    protected String generoMusical;
    protected int añoInicio;
    protected String discografica;
    protected LinkedList <Disco> listaDiscos = new LinkedList <> ();

    
    
    public Musico(String generoMusical, int añoInicio, String discografica) {
        this.generoMusical = generoMusical;
        this.añoInicio = añoInicio;
        this.discografica = discografica;
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

     public abstract void agregarDisco(Disco a);
     
     public abstract void eliminarDisco(Disco a);
     
    public boolean comprobarDisco(Disco a) {

        int i = 0;
        boolean comprobado = false;
        while (i < listaDiscos.size() && !comprobado) {
            if (a.getTitulo().equals(((Disco) this.listaDiscos.get(i)).getTitulo())) {
                if (a.getAñoEdicion() == (((Disco) this.listaDiscos.get(i)).getAñoEdicion())) {
                    if (a.getGeneroMusical().equals(((Disco) this.listaDiscos.get(i)).getGeneroMusical())) {
                        comprobado = true;
                    }
                }
            }
            i++;
        }
        return comprobado;
    }
     
     public abstract void listarDisco();
     
    @Override
    public String toString() {
        return "Musico{" + "generoMusical=" + generoMusical + ", a\u00f1oInicio=" + añoInicio + ", discografica=" + discografica + ", listaDisco=" + listaDiscos + '}';
    }
    
    
}
