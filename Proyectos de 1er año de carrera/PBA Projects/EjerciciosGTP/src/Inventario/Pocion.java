
package Inventario;


public class Pocion extends ObjetoInventario{
    private int cantidad;
    private String efecto;

    public Pocion( String nombre, String descripcion, String efecto,int cantidad) {
        super(nombre, descripcion);
        this.cantidad = cantidad;
        this.efecto = efecto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    @Override
    public String toString() {
        return "Pocion{" + "Nombre: " + nombre + ", Descripcion: " + descripcion + ", Nivel de pocion: " + cantidad + ", Efecto: " + efecto + '}';
    }
    
}
