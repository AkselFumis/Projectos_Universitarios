
package Unidad3.Clase10CloneableComaparable;


public class GestionPersonas {

    
    public static void main(String[] args) {
        Binario p = new Binario ("000000000000","000000000000","000000000000","000000000000");
        Binario p2 = p.clone();
        Binario p3 = p.clone();
        Binario p4 = p.clone();
        Binario p1 = p.clone();
        
        p1.setS1("111111111111");
        p2.setS2("111111111111");
        p3.setS3("111111111111");
        p4.setS4("111111111111");
        
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
        Persona p5 = new Persona(3799999,29);
        Persona p6 = new Persona(3799999,29);
        
        if(p5.compareTo(p6)>0){
            System.out.println("P5 es mayor que P6");
        }
        else if(p6.compareTo(p5)>0){
            System.out.println("P6 es mayor que P5");
        }
        else{
            System.out.println("P5 y P6 son la misma persona");
        }
    }
    
}
