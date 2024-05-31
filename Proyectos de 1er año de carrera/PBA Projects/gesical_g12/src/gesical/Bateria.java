package gesical;

public class Bateria extends Instrumento{

    public Bateria() {
    }

    @Override
    public void tocar() {
        System.out.println("Tocar bateria.");
    }
    @Override
    public String toString() {
        return "Bateria";
    }
}
