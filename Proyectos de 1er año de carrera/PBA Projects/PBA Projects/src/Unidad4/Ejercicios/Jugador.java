
package Unidad4.Ejercicios;

import java.util.Objects;


public class Jugador {
    private String nombre;
    private char posicion;
    private int goles,partidosJugados;

    public Jugador(String nombre, char posicion, int goles, int partidosJugados) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.goles = goles;
        this.partidosJugados = partidosJugados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getPosicion() {
        return posicion;
    }

    public void setPosicion(char posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    
    public double partidoGoles(){
        return this.goles/this.partidosJugados;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + " Goles x Partidos "+ (goles/partidosJugados)+'}';
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
        final Jugador other = (Jugador) obj;
        if (this.goles != other.goles) {
            return false;
        }
        if (this.partidosJugados != other.partidosJugados) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.posicion, other.posicion);
    }
    
    
}
