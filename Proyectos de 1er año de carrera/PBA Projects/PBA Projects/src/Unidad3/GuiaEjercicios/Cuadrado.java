
package Unidad3.GuiaEjercicios;


public class Cuadrado implements Relaciones{
    private double base,altura;

    public Cuadrado(double base, double altura) {
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
    public boolean esMayor(Object b) {
        return (this.base*this.altura)>(((Cuadrado)b).getBase()*((Cuadrado)b).getAltura());
    }

    @Override
    public boolean esMenor(Object b) {
        return (this.base*this.altura)<(((Cuadrado)b).getBase()*((Cuadrado)b).getAltura());
    }

    @Override
    public boolean esIgual(Object b) {
        return (this.base*this.altura)==(((Cuadrado)b).getBase()*((Cuadrado)b).getAltura());
    }
    
}
