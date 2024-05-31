
package Unidad2.geometria;


public class Circulo extends Figura {
    
    private final double PI=Math.PI;
    private double radio;

    public Circulo(String Color, float grosorLinea , double radio){
        super(Color,grosorLinea);
        this.radio=radio;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Circulo {radio=" + radio + " Color: "+this.Color+" Grosor de la linea:"+this.grosorLinea+ '}';
        
        
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
        final Circulo other = (Circulo) obj;
        if (Double.doubleToLongBits(this.radio) == Double.doubleToLongBits(other.radio) && this.Color.equals(other.getColor())&& this.grosorLinea==other.getGrosorLinea()) {
            return true;
        }
        return false;
        
    }

    
   
}
