package Unidad2.Clase7Netflix;

public class Serie extends Video {

    private int temporadas;

    public Serie(int temporadas, String titulo, String genero, int duracion, boolean visto) {
        super(titulo, genero, duracion, visto);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + ", visto=" + visto + " temporadas=" + temporadas + '}';
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
        final Serie other = (Serie) obj;
        if (this.titulo != other.titulo || this.temporadas != other.temporadas) {
            return false;
        }
        return true;
    }

}
