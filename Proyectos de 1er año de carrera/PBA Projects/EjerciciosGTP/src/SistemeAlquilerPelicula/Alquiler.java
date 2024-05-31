
package SistemeAlquilerPelicula;

import java.time.LocalDate;


public class Alquiler {
    private Pelicula peliAlquilada;
    private LocalDate fechaInicio,fechaDevolucion;

    public Alquiler(Pelicula peliAlquilada, LocalDate fechaInicio, LocalDate fechaDevolucion) {
        this.peliAlquilada = peliAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Alquiler(Pelicula peliAlquilada, LocalDate fechaInicio) {
        this.peliAlquilada = peliAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = null;
    }
    
    

    public Pelicula getPeliAlquilada() {
        return peliAlquilada;
    }

    public void setPeliAlquilada(Pelicula peliAlquilada) {
        this.peliAlquilada = peliAlquilada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "Pelicula alquilada: " + peliAlquilada + ", Fecha de alquiler: " + fechaInicio + ", Fecha de entrega: " + fechaDevolucion + '}';
    }
    
    
}
