
package Unidad2.GuiaEjercicios;


public class Semaforo {
    private String calle1;
    private String calle2;
    private Estado estado;

    public Semaforo(String calle1, String calle2, Estado estado) {
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.estado = estado;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
    
}
