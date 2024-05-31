
package Garaje;

import java.util.LinkedList;
import java.util.List;


public class Garaje {
    private List<Vehiculo> vehiculos = new LinkedList<>();

    public Garaje() {
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public void agregarVehiculo(Vehiculo e){
        this.vehiculos.add(e);
    }
    
    public void eliminarVehiculo(Vehiculo e){
        this.vehiculos.remove(e);
    }
    
    public void listarVehiculos(){
        System.out.println(this.vehiculos);
    }
}
