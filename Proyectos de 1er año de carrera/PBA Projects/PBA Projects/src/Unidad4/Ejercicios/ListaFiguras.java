
package Unidad4.Ejercicios;

import java.util.*;


public class ListaFiguras {
    private List<Figura> l; 

    public ListaFiguras() {
        this.l = new ArrayList<>();
    }
    
    public void AgregarElemento(Figura a){
        l.add(a);
    }
    
    public double calcularAreaTotal(){
        double suma=0;
        
        for(Figura f:this.l){
            suma += f.calcularArea();
        }
         return suma;   
    }
    
}
