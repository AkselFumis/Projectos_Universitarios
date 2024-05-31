package gesical;

public class Teclado extends Instrumento{

    public Teclado() {
    }

    @Override
    public void tocar() {
        System.out.println("Tocar teclado");
    }
    @Override
    public String toString() {
        return "Teclado";
    }
}
