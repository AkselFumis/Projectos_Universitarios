
package LICONEX_G12;


public abstract class  Examen {
    protected String fechaInicio;
    protected Persona persona;
    protected int circuito;
    protected int faltas;

    public Examen(String fechaInicio,Persona persona, int circuito, int faltas) {
        this.fechaInicio = fechaInicio;
        this.persona = persona;
        this.circuito = circuito;
        this.faltas = faltas;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getCircuito() {
        return circuito;
    }

    public void setCircuito(int circuito) {
        this.circuito = circuito;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    

    
    
    public abstract String tomarExamen();
    
}
