
package AcopioFumisAxel;

import java.time.LocalTime;


public class Lote {
    private int nroDeLote,nroDeProveedor,nroDeProducto,dia;
    private LocalTime hora;

    public Lote(int nroDeLote, int nroDeProveedor, int nroDeProducto, int dia, LocalTime hora) {
        this.nroDeLote = nroDeLote;
        this.nroDeProveedor = nroDeProveedor;
        this.nroDeProducto = nroDeProducto;
        this.dia = dia;
        this.hora = hora;
    }

    public int getNroDeLote() {
        return nroDeLote;
    }

    public void setNroDeLote(int nroDeLote) {
        this.nroDeLote = nroDeLote;
    }

    public int getNroDeProveedor() {
        return nroDeProveedor;
    }

    public void setNroDeProveedor(int nroDeProveedor) {
        this.nroDeProveedor = nroDeProveedor;
    }

    public int getNroDeProducto() {
        return nroDeProducto;
    }

    public void setNroDeProducto(int nroDeProducto) {
        this.nroDeProducto = nroDeProducto;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Lote{" + "Numero de Lote: " + nroDeLote + ", Numero de Proveedor: " + nroDeProveedor + ", Numero de Producto: " + nroDeProducto + ", Dia: " + dia + ", Hora: " + hora + '}';
    }
    
    
}
