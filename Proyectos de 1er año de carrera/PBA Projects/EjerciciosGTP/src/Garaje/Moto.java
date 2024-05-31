
package Garaje;


public class Moto implements Vehiculo {
    
    private String marca;

    public Moto(String marca) {
        this.marca = marca;
    }
    
    

    @Override
    public int velocidadMaxima() {
        int suma=0;
        for(int i = 0;i<marca.length();i++){
            suma+=15;
        }
        return suma;
    }

    @Override
    public String toString() {
        return "Moto{" + "Marca:" + marca + " Velocidad Maxima"+ this.velocidadMaxima()+ '}'+"\n";
    }
    
}
