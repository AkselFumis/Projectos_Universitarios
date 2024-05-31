package LICONEX_G12;


public class ExamenMoto extends Examen {
    private Moto moto;
    private int tiempoCircuito2;

    public ExamenMoto(Moto moto, int tiempoCircuito2,String fechaInicio, Persona persona, int circuito, int faltas) {
        super(fechaInicio,persona, circuito, faltas);
        this.moto = moto;
        this.tiempoCircuito2 = tiempoCircuito2;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public int getTiempoCircuito2() {
        return tiempoCircuito2;
    }

    public void setTiempoCircuito2(int tiempoCircuito2) {
        this.tiempoCircuito2 = tiempoCircuito2;
    }
    

    

    @Override
    public String tomarExamen() {
        if(((circuito+tiempoCircuito2)/2)<20 && faltas<5){
            return "Aprobado";
        }
        else{
            return "Desaprobado";
        }
    }

    @Override
    public String toString() {
        return "Examen de Moto(" + " Tiempo del circuito 1: " + circuito + " Minutos - Tiempo del circuito 2:" + tiempoCircuito2 + " Minutos || Faltas Totales: " + faltas +')';
    }
    

    
    
    
    
    
    
}
