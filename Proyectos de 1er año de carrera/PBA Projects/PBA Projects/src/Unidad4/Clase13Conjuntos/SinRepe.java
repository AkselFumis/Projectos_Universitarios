
package Unidad4.Clase13Conjuntos;

import java.util.*;


public class SinRepe {

    
    public static void main(String[] args) {
        List<String> conRepe =new LinkedList<>();
        
        conRepe.add("Axel");
        conRepe.add("Agustino");
        conRepe.add("Aixa");
        conRepe.add("Agustino");
        conRepe.add("Aixa");
        
        System.out.println(conRepe);
        System.out.println(sinrepe(conRepe));
    }

    private static List sinrepe(List<String> conRepe) {
        Set<String> eliminarRepe = new HashSet<>(conRepe);
       
        List<String> sinRepe = new ArrayList<>(eliminarRepe); 
        
        return sinRepe;
        
    }
    
}
