
package Unidad3.Clase10CloneableComaparable;


public class Persona implements Cloneable,Comparable<Persona>{
    private int dni,edad;

    public Persona(int dni, int edad) {
        this.dni = dni;
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona o) {
        int resultado=0;
        
        if(this.edad>o.edad) 
            return 1;
        else if (this.edad<o.edad)
            return -1;
        else if (this.dni>o.dni)
            return 1;
        else if (this.dni<o.dni)
            return -1;
        return 0;
                    
    }
    
    
    
}
