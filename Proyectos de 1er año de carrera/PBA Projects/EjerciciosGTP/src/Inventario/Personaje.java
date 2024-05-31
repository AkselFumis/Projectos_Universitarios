
package Inventario;

import java.util.LinkedList;
import java.util.List;


public class Personaje {
    private List<ObjetoInventario> inventario ;

    public Personaje() {
        this.inventario = new LinkedList<>();
    }

    public List<ObjetoInventario> getInventario() {
        return inventario;
    }

    public void setInventario(List<ObjetoInventario> inventario) {
        this.inventario = inventario;
    }
    public void agregarObjeto(ObjetoInventario a){
        this.inventario.add(a);
    }
    public void eliminarObjeto(ObjetoInventario a){
        this.inventario.remove(a);
    }
    public void mostrarInventario(){
        for(ObjetoInventario i : inventario){
            System.out.println(i);
        
        }
    }
}
