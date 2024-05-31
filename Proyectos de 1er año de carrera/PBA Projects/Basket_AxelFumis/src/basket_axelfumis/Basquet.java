package basket_axelfumis;

import java.util.*;

public class Basquet {

    public static void main(String[] args) {
        List<Jugador> plantel = new ArrayList<>();
        Set<Jugador> equipoIdeal = new HashSet<>();

        plantel.add(new Jugador("GINOBILI ", "GONZALO", 45, 198));
        plantel.add(new Jugador("SANCHEZ  ", "AGUSTIN", 38, 193));
        plantel.add(new Jugador("CAMPAZZO ", "ARIEL", 31, 178));
        plantel.add(new Jugador("NOCIONI ", "SANTIAGO", 22, 203));
        plantel.add(new Jugador("DELFINO ", "MARIANO", 40, 189));
        plantel.add(new Jugador("LAPROVITTOLA ", "EZEQUIEL", 33, 180));
        plantel.add(new Jugador("SCOLA ", "LUCIANO", 35, 210));
        plantel.add(new Jugador("BOLMARO ", "ADRIAN", 25, 185));

        for (int i = 0; i < 5; i++) {
            equipoIdeal.add(plantel.get(i));
        }
        Jugador j1 = new Jugador();
        for (Jugador j : plantel) {
            boolean flag = true;
            if (!equipoIdeal.contains(j)) {
                Iterator it = equipoIdeal.iterator();

                while (it.hasNext() && flag) {
                    Jugador j2 = (Jugador) it.next();
                    if (j.puntaje() > j2.puntaje()) {
                        
                        equipoIdeal.add(j);
                        equipoIdeal.remove(j2);
                        flag = false;

                    }

                }

            }
        }
        for (Jugador j : plantel) {
            boolean flag = true;
            if (!equipoIdeal.contains(j)) {
                Iterator it = equipoIdeal.iterator();

                while (it.hasNext() && flag) {
                    Jugador j2 = (Jugador) it.next();
                    if (j.puntaje() > j2.puntaje()) {
                        
                        equipoIdeal.add(j);
                        equipoIdeal.remove(j2);
                        flag = false;

                    }

                }

            }
        }
        for (Jugador j : plantel) {
            boolean flag = true;
            if (!equipoIdeal.contains(j)) {
                Iterator it = equipoIdeal.iterator();

                while (it.hasNext() && flag) {
                    Jugador j2 = (Jugador) it.next();
                    if (j.puntaje() > j2.puntaje()) {
                        
                        equipoIdeal.add(j);
                        equipoIdeal.remove(j2);
                        flag = false;

                    }

                }

            }
        }
        
        

        List<Jugador> equipoIdeal1 = new ArrayList<>(equipoIdeal);

        System.out.println(equipoIdeal);

        equipoIdeal1.sort(null);

        System.out.println(equipoIdeal1);

    }

}
