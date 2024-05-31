
package Unidad2.geometria;


public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String Color, float grosorLinea) {
        super(Color, grosorLinea);
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo {"  + "base=" + base + ", altura=" + altura + " Color: "+Color+" Grosor de la linea:"+grosorLinea+ '}';
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
        final Triangulo other = (Triangulo) obj;
        if (Double.doubleToLongBits(this.base) != Double.doubleToLongBits(other.base)) {
            return false;
        }
        if(Double.doubleToLongBits(this.altura) == Double.doubleToLongBits(other.altura)&& this.Color.equals(other.getColor())&& this.grosorLinea==other.getGrosorLinea()){
            return true;
        }
        return false;
    }
  
    
}
