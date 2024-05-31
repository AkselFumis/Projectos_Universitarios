
package Unidad3.Clase9PresaDepredador;


public interface Depredador extends Observable {
    public void Perseguir(Presa p);
    public void Comer(Presa p);
}
