
package Unidad2.geometria;

public abstract class Figura {
    
    protected String Color;
    protected float grosorLinea;

    public Figura(String Color, float grosorLinea) {
        this.Color = Color;
        this.grosorLinea = grosorLinea;
    }

    

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public float getGrosorLinea() {
        return grosorLinea;
    }

    public void setGrosorLinea(float grosorLinea) {
        this.grosorLinea = grosorLinea;
    }
    
    
    
    public abstract double calcularArea();
}
