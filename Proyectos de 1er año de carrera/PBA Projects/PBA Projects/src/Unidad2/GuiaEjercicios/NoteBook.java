package Unidad2.GuiaEjercicios;

public class NoteBook extends Computadora {

    private float pesoNoteBook;

    public NoteBook(String marca, String modelo, float peso) {
        super(marca, modelo);
        pesoNoteBook = peso;
    }

    public Float getPeso() {
        return pesoNoteBook;
    }

    public void setPeso(float peso) {
        pesoNoteBook = peso;
    }

    public void setPesoNoteBook(float pesoNoteBook) {
        this.pesoNoteBook = pesoNoteBook;
    }
    
    public String toString() {
        return "Notebook: " + marca + " - Modelo: " + modelo;
    }
}
