
package Garaje;


public class Auto implements Vehiculo {
    
    private String marca;

    public Auto(String marca) {
        this.marca = marca;
    }
    
    

    @Override
    public int velocidadMaxima() {
        int suma=0;
        for(int i = 0;i<marca.length();i++){
            suma+=20;
        }
        return suma;
    }

    @Override
    public String toString() {
        return "Auto{" + "Marca:" + marca + " Velocidad Maxima"+ this.velocidadMaxima()+ '}'+"\n ";
    }
    
}
