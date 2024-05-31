package Futbol;


import java.util.*;

public class Equipo {

    public static void main(String[] args) {
        Set<Jugador> equipo = new HashSet<>();
        

        equipo.add(new Jugador("MESSI", "LIONEL", 31, 170));
        equipo.add(new Jugador("RONALDO", "CRISTIANO", 36, 185));
        equipo.add(new Jugador("NEYMAR", "JR", 29, 175));
        equipo.add(new Jugador("SUAREZ", "LUIS", 33, 180));
        equipo.add(new Jugador("MBAPPÉ", "KILIAN", 22, 185));
        equipo.add(new Jugador("DE BRUYNE", "KEVIN", 29, 175));
        equipo.add(new Jugador("MODRIC", "LUKA", 36, 170));
        equipo.add(new Jugador("VAN DIJK", "VIRGIL", 29, 190));
        
        System.out.println("Equipo Completo");
        
        for(Jugador j : equipo){
            System.out.println(j);
        }
        
        System.out.println("Equipo Ideal");
        
        List<Jugador> equipoIdeal = new LinkedList<>(equipo);
        Collections.sort(equipoIdeal, (j1, j2) -> j2.Puntaje() - j1.Puntaje());
        for(Jugador j:equipoIdeal.subList(0, 5)){
            System.out.println(j);
        }
        
        System.out.println("Equipo ordenado alfabeticamente");
        equipoIdeal.sort(null);
        
        for(Jugador j : equipoIdeal){
            System.out.println(j);
        }
        
    }

}
