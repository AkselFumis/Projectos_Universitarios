
package gamesarAxelFumis;


import java.util.*;


public class GamesAR_Naipes {

    
    public static void main(String[] args) {
        Española e = new Española(10,"c","c","","");
        Francesa a = new Francesa(52,"c","c","","");
        List<Naipe> naipes = new LinkedList<>();
        
        e.mostrarNaipes();
        e.barajar();
        e.barajar();
        e.barajar();
        e.barajar();
        naipes.addAll(e.darNaipes(7));
        System.out.println(naipes);
        e.mostrarNaipes();
        e.ordenar();
        e.mostrarNaipes();
       
        
    }
    
}
