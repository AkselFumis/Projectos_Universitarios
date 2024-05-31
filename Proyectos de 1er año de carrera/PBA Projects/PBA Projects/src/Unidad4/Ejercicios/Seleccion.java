
package Unidad4.Ejercicios;

import java.util.*;


public class Seleccion {

    
    public static void main(String[] args) {
        Set<Jugador> Titular = new HashSet<>();
        Set<Jugador> Suplente = new HashSet<>();
        Set<Jugador> Plantel = new HashSet<>();
        
        Jugador Messi = new Jugador ("Messi",'V',1400,500);
        Jugador FunesMori = new Jugador ("Funes Mori",'D',20,100);
        Plantel.add(Messi);
        Plantel.add (new Jugador("Martinez",'A',1000,200));
        Plantel.add (new Jugador("Dybala",'V',400,600));
        Plantel.add (new Jugador("Alvarez",'V',900,200));
        Plantel.add (new Jugador("Di Maria",'M',400,70));
        Plantel.add (new Jugador("Martinez",'D',200,170));
        Plantel.add (new Jugador("De Paul",'M',100,30));
        Plantel.add (new Jugador("Martinez",'V',1500,300));
        Plantel.add (new Jugador("Fernandez",'M',100,20));
        Plantel.add (new Jugador("Mac Allister",'M',1100,500));
        Plantel.add (new Jugador("Romero",'D',300,100));
        Plantel.add (new Jugador("Almada",'M',20,100));
        Plantel.add (new Jugador("Paredes",'M',200,150));
        Plantel.add (new Jugador("Otamendi",'D',230,100));
        Plantel.add (new Jugador("Molina",'D',290,120));
        Plantel.add (new Jugador("Gomez",'M',320,1000));
        Plantel.add (new Jugador("Correa",'V',120,100));
        Plantel.add (new Jugador("Acuña",'D',220,410));
        Plantel.add (new Jugador("Montiel",'D',320,1400));
        Plantel.add (new Jugador("Rulli",'A',120,100));
        Plantel.add (new Jugador("Palacios",'V',20,100));
        Plantel.add (FunesMori);
        
        for(Jugador j:Plantel){
            if(j.getPosicion()=='A'&&j.partidoGoles()>2.5)
                Titular.add(j);
            else if(j.partidoGoles()>1.5&&j.getPosicion()!='A')
                Titular.add(j);
            else
                Suplente.add(j);
            
        }
        System.out.println("Titulares");
        
        for(Jugador nombre: Titular){
            System.out.println(nombre);
        
        }
        System.out.println("Suplentes");
        for(Jugador nombre: Suplente){
            System.out.println(nombre);
        
        }
        if(Titular.contains(Messi))
            System.out.println("Si Existe");
        else
            System.out.println("No Existe");
        if(Plantel.contains(FunesMori))
            Plantel.remove(FunesMori);
        System.out.println("El Plantel tiene un total de "+Plantel.size()+" Jugadores");
            
    
    }
    
}
