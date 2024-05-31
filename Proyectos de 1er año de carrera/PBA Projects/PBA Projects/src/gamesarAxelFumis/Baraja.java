
package gamesarAxelFumis;

import java.util.*;


public abstract class Baraja {
    Stack<Naipe> baraja;
    protected int naipePalo;
    protected String palo1;
    protected String palo2;
    protected String palo3;
    protected String palo4;

    public Baraja(int naipePalo, String palo1, String palo2, String palo3, String palo4) {
        this.naipePalo = naipePalo;
        this.palo1 = palo1;
        this.palo2 = palo2;
        this.palo3 = palo3;
        this.palo4 = palo4;
        baraja= new Stack();
        
    }

    public Stack<Naipe> getBaraja() {
        return baraja;
    }

    public void setBaraja(Stack<Naipe> baraja) {
        this.baraja = baraja;
    }

    public int getNaipePalo() {
        return naipePalo;
    }

    public void setNaipePalo(int naipePalo) {
        this.naipePalo = naipePalo;
    }

    public String getPalo1() {
        return palo1;
    }

    public void setPalo1(String palo1) {
        this.palo1 = palo1;
    }

    public String getPalo2() {
        return palo2;
    }

    public void setPalo2(String palo2) {
        this.palo2 = palo2;
    }

    public String getPalo3() {
        return palo3;
    }

    public void setPalo3(String palo3) {
        this.palo3 = palo3;
    }

    public String getPalo4() {
        return palo4;
    }

    public void setPalo4(String palo4) {
        this.palo4 = palo4;
    }
    public void naipesDisponibles() {
        baraja.size();
        
    }
    public List<Naipe> darNaipes(int a) {
        List<Naipe> naipesDados = new LinkedList<>();
        for(int i=0;a>i;i++){
            naipesDados.add(baraja.pop());
        }
        return naipesDados;
    }
    public void ordenar() {
        Collections.sort(baraja,null);
    }
    public void barajar() {
        Collections.shuffle(baraja);
    }
    
    
}
