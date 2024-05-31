package Libreria;

public class Libro {

    private String autor, titulo;
    private int numPag;

    public Libro(String autor, String titulo, int numPag) {
        this.autor = autor;
        this.titulo = titulo;
        this.numPag = numPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", titulo=" + titulo + ", numPag=" + numPag + '}';
    }

}
