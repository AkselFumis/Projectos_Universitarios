package gesical;

public class Guitarra extends Instrumento {

    public Guitarra() {
    }

    @Override
    public void tocar() {
        System.out.println("Tocar guitarra.");
    }

    @Override
    public String toString() {
        return "Guitarra";
    }
    
}
