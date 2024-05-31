
package LICONEX_G12;


public class Persona {
    
    private String fechaNacimiento;
    private int Dni;
    private String nombre;
    private String apellido;

    public Persona( String fechaNacimiento, int Dni, String nombre, String apellido) {
        
        this.fechaNacimiento = fechaNacimiento;
        this.Dni = Dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
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
    
    
}
