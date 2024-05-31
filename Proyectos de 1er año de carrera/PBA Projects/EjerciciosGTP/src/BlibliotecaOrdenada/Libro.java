package BlibliotecaOrdenada;

public class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;
    private int puntuacion;

    public Libro(String titulo, String autor, int añoPublicacion, int puntuacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.puntuacion = puntuacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Libro{"
                + "Título='" + titulo + '\''
                + ", Autor='" + autor + '\''
                + ", Año de Publicación=" + añoPublicacion
                + ", Puntuación=" + puntuacion
                + '}';
    }

}
