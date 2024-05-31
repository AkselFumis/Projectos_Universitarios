package gamesarAxelFumis;

import java.util.*;

public class Española extends Baraja {

    
    List<Naipe> naipesDados = new LinkedList<>();

    public Española(int naipePalo, String palo1, String palo2, String palo3, String palo4) {
        super(naipePalo, palo1 = "ORO", palo2 = "COPA", palo3 = "ESPADA", palo4 = "BASTO");

        if (naipePalo > 10) {
            this.baraja.add(new Naipe(1, "ORO"));
            this.baraja.add(new Naipe(2, "ORO"));
            this.baraja.add(new Naipe(3, "ORO"));
            this.baraja.add(new Naipe(4, "ORO"));
            this.baraja.add(new Naipe(5, "ORO"));
            this.baraja.add(new Naipe(6, "ORO"));
            this.baraja.add(new Naipe(7, "ORO"));
            this.baraja.add(new Naipe(8, "ORO"));
            this.baraja.add(new Naipe(9, "ORO"));
            this.baraja.add(new Naipe(10, "ORO"));
            this.baraja.add(new Naipe(11, "ORO"));
            this.baraja.add(new Naipe(12, "ORO"));

            this.baraja.add(new Naipe(1, "COPA"));
            this.baraja.add(new Naipe(2, "COPA"));
            this.baraja.add(new Naipe(3, "COPA"));
            this.baraja.add(new Naipe(4, "COPA"));
            this.baraja.add(new Naipe(5, "COPA"));
            this.baraja.add(new Naipe(6, "COPA"));
            this.baraja.add(new Naipe(7, "COPA"));
            this.baraja.add(new Naipe(8, "COPA"));
            this.baraja.add(new Naipe(9, "COPA"));
            this.baraja.add(new Naipe(10, "COPA"));
            this.baraja.add(new Naipe(11, "COPA"));
            this.baraja.add(new Naipe(12, "COPA"));

            this.baraja.add(new Naipe(1, "ESPADA"));
            this.baraja.add(new Naipe(2, "ESPADA"));
            this.baraja.add(new Naipe(3, "ESPADA"));
            this.baraja.add(new Naipe(4, "ESPADA"));
            this.baraja.add(new Naipe(5, "ESPADA"));
            this.baraja.add(new Naipe(6, "ESPADA"));
            this.baraja.add(new Naipe(7, "ESPADA"));
            this.baraja.add(new Naipe(8, "ESPADA"));
            this.baraja.add(new Naipe(9, "ESPADA"));
            this.baraja.add(new Naipe(10, "ESPADA"));
            this.baraja.add(new Naipe(11, "ESPADA"));
            this.baraja.add(new Naipe(12, "ESPADA"));

            this.baraja.add(new Naipe(1, "BASTO"));
            this.baraja.add(new Naipe(2, "BASTO"));
            this.baraja.add(new Naipe(3, "BASTO"));
            this.baraja.add(new Naipe(4, "BASTO"));
            this.baraja.add(new Naipe(5, "BASTO"));
            this.baraja.add(new Naipe(6, "BASTO"));
            this.baraja.add(new Naipe(7, "BASTO"));
            this.baraja.add(new Naipe(8, "BASTO"));
            this.baraja.add(new Naipe(9, "BASTO"));
            this.baraja.add(new Naipe(10, "BASTO"));
            this.baraja.add(new Naipe(11, "BASTO"));
            this.baraja.add(new Naipe(12, "BASTO"));

        } else {
            this.baraja.add(new Naipe(1, "ORO"));
            this.baraja.add(new Naipe(2, "ORO"));
            this.baraja.add(new Naipe(3, "ORO"));
            this.baraja.add(new Naipe(4, "ORO"));
            this.baraja.add(new Naipe(5, "ORO"));
            this.baraja.add(new Naipe(6, "ORO"));
            this.baraja.add(new Naipe(7, "ORO"));
            this.baraja.add(new Naipe(10, "ORO"));
            this.baraja.add(new Naipe(11, "ORO"));
            this.baraja.add(new Naipe(12, "ORO"));

            this.baraja.add(new Naipe(1, "COPA"));
            this.baraja.add(new Naipe(2, "COPA"));
            this.baraja.add(new Naipe(3, "COPA"));
            this.baraja.add(new Naipe(4, "COPA"));
            this.baraja.add(new Naipe(5, "COPA"));
            this.baraja.add(new Naipe(6, "COPA"));
            this.baraja.add(new Naipe(7, "COPA"));
            this.baraja.add(new Naipe(10, "COPA"));
            this.baraja.add(new Naipe(11, "COPA"));
            this.baraja.add(new Naipe(12, "COPA"));

            this.baraja.add(new Naipe(1, "ESPADA"));
            this.baraja.add(new Naipe(2, "ESPADA"));
            this.baraja.add(new Naipe(3, "ESPADA"));
            this.baraja.add(new Naipe(4, "ESPADA"));
            this.baraja.add(new Naipe(5, "ESPADA"));
            this.baraja.add(new Naipe(6, "ESPADA"));
            this.baraja.add(new Naipe(7, "ESPADA"));
            this.baraja.add(new Naipe(10, "ESPADA"));
            this.baraja.add(new Naipe(11, "ESPADA"));
            this.baraja.add(new Naipe(12, "ESPADA"));

            this.baraja.add(new Naipe(1, "BASTO"));
            this.baraja.add(new Naipe(2, "BASTO"));
            this.baraja.add(new Naipe(3, "BASTO"));
            this.baraja.add(new Naipe(4, "BASTO"));
            this.baraja.add(new Naipe(5, "BASTO"));
            this.baraja.add(new Naipe(6, "BASTO"));
            this.baraja.add(new Naipe(7, "BASTO"));
            this.baraja.add(new Naipe(10, "BASTO"));
            this.baraja.add(new Naipe(11, "BASTO"));
            this.baraja.add(new Naipe(12, "BASTO"));
        }

    }

    public void mostrarNaipes() {
        List<Naipe> mostrar = new ArrayList<>(this.baraja);
        for (Naipe n : mostrar) {
            System.out.println(n);
        }
    }

    

}
