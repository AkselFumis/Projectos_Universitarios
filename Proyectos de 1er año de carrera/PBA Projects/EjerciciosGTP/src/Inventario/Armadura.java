
package Inventario;


public class Armadura extends ObjetoInventario {
    private int defensa;
    private String tipo;

    public Armadura(String nombre, String descripcion , String tipo, int defensa ) {
        super(nombre, descripcion);
        this.defensa = defensa;
        this.tipo = tipo;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Armadura{" + "Nombre: " + nombre + ", Descripcion: " + descripcion +", Defensa: " + defensa + ", Tipo: " + tipo + '}';
    }
    
}
