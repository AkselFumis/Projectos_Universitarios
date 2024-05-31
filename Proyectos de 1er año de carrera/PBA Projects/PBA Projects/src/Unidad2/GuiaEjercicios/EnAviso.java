
package Unidad2.GuiaEjercicios;


public class EnAviso extends Estado {

    public EnAviso() {
    }

    @Override
    public Estado cambiarEstado() {
        return new NoHabilitado();
    }
    
}
