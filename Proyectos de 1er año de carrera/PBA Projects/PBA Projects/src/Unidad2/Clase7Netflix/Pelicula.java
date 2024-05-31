package Unidad2.Clase7Netflix;

public class Pelicula extends Video {

    private int año;

    public Pelicula(int año, String titulo, String genero, int duracion, boolean visto) {
        super(titulo, genero, duracion, visto);
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + ", visto=" + visto + " año=" + año + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        return this.titulo.equals(other.titulo);
    }

}
