
package Garaje;


public class Main {

    
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        
        garaje.agregarVehiculo(new Auto("Toyota"));
        garaje.agregarVehiculo(new Auto("Honda"));
        garaje.agregarVehiculo(new Auto("Chevrolet"));
        garaje.agregarVehiculo(new Auto("Ford"));
        garaje.agregarVehiculo(new Moto("Suzuki"));
        garaje.agregarVehiculo(new Moto("Honda"));
        garaje.agregarVehiculo(new Moto("Titan"));
        
        garaje.listarVehiculos();
    }
    
}
