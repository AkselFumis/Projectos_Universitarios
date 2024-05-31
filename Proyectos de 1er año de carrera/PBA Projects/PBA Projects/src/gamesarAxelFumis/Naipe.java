
package gamesarAxelFumis;


public class Naipe implements Comparable<Naipe> {
    private int num;
    private String palo;

    public Naipe(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Naipe{" + num  +" "+ palo + '}';
    }

    @Override
    public int compareTo(Naipe o) {
        if(this.palo.charAt(0)>(o).getPalo().charAt(0))
            return 1;
        if(this.palo.charAt(0)<(o).getPalo().charAt(0))
            return -1;
        if(this.num>o.num)
            return 1;
        if(this.num<o.num)
            return -1;
        return 0;
    }
    
    
}
