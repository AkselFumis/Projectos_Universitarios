
package LICONEX_G12;


public abstract class Vehiculo  {
    protected String patente;
    protected String marca;
    protected int cilindradas;

    public Vehiculo(String patente, String marca, int cilindradas) {
        this.patente = patente;
        this.marca = marca;
        this.cilindradas = cilindradas;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
   
    
}
