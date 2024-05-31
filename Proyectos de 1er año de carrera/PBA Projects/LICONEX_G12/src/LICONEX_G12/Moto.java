
package LICONEX_G12;


public class Moto extends Vehiculo {
    private boolean llevaTodosEspejos;

    public Moto(boolean llevaTodosEspejos, String patente, String marca, int cilindradas) {
        super(patente, marca, cilindradas);
        this.llevaTodosEspejos = llevaTodosEspejos;
    }

    public boolean isLlevaTodosEspejos() {
        return llevaTodosEspejos;
    }

    public void setLlevaTodosEspejos(boolean llevaTodosEspejos) {
        this.llevaTodosEspejos = llevaTodosEspejos;
    }

    @Override
    public String toString() {
        return "Moto{"  + "Patente: "+ patente+ " || Marca: "+marca+" || Cilindradas: "+cilindradas + " || Lleva todos los espejos: " + llevaTodosEspejos + '}';
    }
    
    
}
