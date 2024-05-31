
package Unidad2.GuiaEjercicios;


public class NoHabilitado extends Estado {

    public NoHabilitado() {
    }

    @Override
    public Estado cambiarEstado() {
        return new Habilitado();
    }
    
}
