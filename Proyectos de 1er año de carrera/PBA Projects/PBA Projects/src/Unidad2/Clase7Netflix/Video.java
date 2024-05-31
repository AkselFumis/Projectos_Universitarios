package Unidad2.Clase7Netflix;

public abstract class Video {

    protected String titulo;
    protected String genero;
    protected int duracion;
    protected boolean visto;

    public Video(String titulo, String genero, int duracion, boolean visto) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.visto = visto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

}
