
package SistemeAlquilerPelicula;


public class Pelicula {
    private String genero,titulo,director;
    private int duracion;

    public Pelicula(String genero, String titulo, String director, int duracion) {
        this.genero = genero;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Genero: " + genero + ", Titulo: " + titulo + ", Director: " + director + ", Duracion: " + duracion +" Min"+ '}';
    }
    
    
}
