
package Unidad2.GuiaEjercicios;


public class Habilitado extends Estado {

    public Habilitado() {
    }
    
    

    @Override
    public Estado cambiarEstado() {
        return new EnAviso();
    }
    
}
