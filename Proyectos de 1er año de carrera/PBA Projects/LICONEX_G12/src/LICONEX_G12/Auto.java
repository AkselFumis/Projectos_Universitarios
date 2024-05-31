
package LICONEX_G12;


public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String patente, String marca, int cilindradas) {
        super(patente, marca, cilindradas);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Auto{" +  " || Patente: "+ patente+ " || Marca: "+marca+"  || Cilindradas: "+cilindradas + " || Cantidad de Puertas: " + cantidadPuertas + '}';
    }
    
    
}
