
package Unidad4.Ejercicios;

import Unidad2.geometria.*;


public class Circulo extends Figura {
    
    private final double PI=Math.PI;
    private double radio;

    public Circulo( double radio){
        
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
        return "Circulo {radio=" + radio + '}';
        
        
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
        if (Double.doubleToLongBits(this.radio) == Double.doubleToLongBits(other.radio)) {
            return true;
        }
        return false;
        
    }

    
   
}
