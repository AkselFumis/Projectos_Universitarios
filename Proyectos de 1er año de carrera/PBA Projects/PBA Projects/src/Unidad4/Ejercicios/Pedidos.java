
package Unidad4.Ejercicios;


public class Pedidos {
    private int numProducto,cantProducto,numCliente;

    public Pedidos(int numProducto, int cantProducto, int numCliente) {
        this.numProducto = numProducto;
        this.cantProducto = cantProducto;
        this.numCliente = numCliente;
    }

    public int getNumProducto() {
        return numProducto;
    }

    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    
    @Override
    public String toString() {
        return "Pedido{" + "Id del Producto: " + numProducto + ", Cantida del Producto: " + cantProducto + ", Numero del Cliente" + numCliente + '}';
    }
    
    
}
