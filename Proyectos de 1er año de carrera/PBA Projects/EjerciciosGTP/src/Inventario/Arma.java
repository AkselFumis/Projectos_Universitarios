package Inventario;

public class Arma extends ObjetoInventario {

    private int daño;
    private String tipo;

    public Arma(String nombre, String descripcion,String tipo, int daño  ) {
        super(nombre, descripcion);
        this.daño = daño;
        this.tipo = tipo;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Arma{" +"Nombre: " + nombre + ", Descripcion: " + descripcion + ", Daño: " + daño + ", Tipo: " + tipo + '}';
    }

}
