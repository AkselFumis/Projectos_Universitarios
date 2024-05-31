
package Unidad4.Clase13Conjuntos;


import java.util.Random;
import java.util.*;


public class Main {

    
    public static void main(String[] args) {
        Random rnd = new Random();
        Set<Integer> set = new HashSet<>();
        
        
        while(set.size()<20){
            set.add(rnd.nextInt(100));
        }
        
        
        System.out.println(set);
        
    
    }
    
}
