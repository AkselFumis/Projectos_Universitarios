
package LICONEX_G12;


public class ExamenAuto extends Examen{
    private Auto auto;

    public ExamenAuto(Auto auto,String fechaInicio, Persona persona, int circuito, int faltas) {
        super(fechaInicio, persona, circuito, faltas);
        this.auto = auto;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    
    
     @Override
    public String tomarExamen() {
        if(circuito<30 && faltas<3){
            return "Aprobado";
        }
        else{
            return "Desaprobado";
        }
    }

    @Override
    public String toString() {
        return "ExamenAuto{" + " Circuito: " + circuito + " Minutos || Faltas:" + faltas   + '}';
    }
    
    
    
}
