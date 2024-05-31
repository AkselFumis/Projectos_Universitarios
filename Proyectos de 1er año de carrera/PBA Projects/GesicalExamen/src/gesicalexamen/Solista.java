
package gesicalexamen;

import java.util.Objects;


public class Solista extends Musico {
    private String nombre,apellido,nacionalidad;
    private Instrumento instrumento;

    public Solista(String nombre, String apellido, String nacionalidad, Instrumento instrumento, String genero, String discografia, int añoInicio) {
        super(genero, discografia, añoInicio);
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.instrumento = instrumento;
    }

    public Solista(String nombre, String apellido, String nacionalidad, String genero, String discografia, int añoInicio) {
        super(genero, discografia, añoInicio);
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.instrumento = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
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
        final Solista other = (Solista) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.nacionalidad, other.nacionalidad);
    }
    
}
