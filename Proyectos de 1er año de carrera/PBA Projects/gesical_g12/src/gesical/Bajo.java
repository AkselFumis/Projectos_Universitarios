package gesical;

public class Bajo extends Instrumento {

    public Bajo() {
    }
    
    
    @Override
    public void tocar() {
        System.out.println("Tocar bajo.");
    }
    @Override
    public String toString() {
        return "Bajo";
    }
}
