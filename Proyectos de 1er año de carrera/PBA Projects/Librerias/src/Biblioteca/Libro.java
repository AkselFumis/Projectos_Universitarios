
package Biblioteca;

import java.util.Objects;


public class Libro {
    private int capitulo,ISBN;
    private String titulo;
    private boolean estado;

    public Libro(int capitulo, int ISBN, String titulo, boolean estado) {
        this.capitulo = capitulo;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.estado = estado;
        
    }

    public Libro() {
        this.capitulo = 0;
        this.ISBN = 0;
        this.titulo = "";
        this.estado = false;
    }
    

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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
        final Libro other = (Libro) obj;
        if (this.capitulo != other.capitulo) {
            return false;
        }
        if (this.ISBN != other.ISBN) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        return Objects.equals(this.titulo, other.titulo);
    }

    @Override
    public String toString() {
        return "Libro{" + "capitulo=" + capitulo + ", ISBN=" + ISBN + ", titulo=" + titulo + ", estado=" + estado + '}';
    }
    
}
