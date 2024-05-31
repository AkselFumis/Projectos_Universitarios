
package Unidad4.Ejercicios;

import java.util.*;


public class GestionLista  {

    
    public static void main(String[] args) {
        /*List <Integer> l = new LinkedList<>();
        List <Integer> l2 = new LinkedList<>();
        
        l.add(4);
        l.add(14);
        l.add(5);
        l.add(8);
        l.add(42);
        l.add(87);
        l.add(1);
        l.add(9);
        l.add(0);
        
        System.out.println(l);
        
        for(int i :l){
            l2.add((int)Math.pow(i,2));
        }
        
        System.out.println(l2);
        
        l.clear();
        Iterator it = l2.iterator();
        
        while(it.hasNext()){
            int i = (int)it.next();
            if(i<100)
                l.add(i);
        }
        
        System.out.println(l);
        l.sort(null);
        System.out.println(l);
        
        ListaFiguras l =new ListaFiguras();
        
        l.AgregarElemento(new Circulo(44.33));
        l.AgregarElemento(new Rectangulo(44,33));
        l.AgregarElemento(new Triangulo(70,60));
        l.AgregarElemento(new Circulo(39.4));
        l.AgregarElemento(new Rectangulo(70,10));
        l.AgregarElemento(new Triangulo(30,33));
        l.AgregarElemento(new Circulo(12.33));
        
        System.out.println(l.calcularAreaTotal());*/
        
        List<String> s = new ArrayList<>();
        
        s.add("Axel");
        s.add("Marte");
        s.add("Aixa");
        s.add("Aaron");
        s.add("Dario");
        s.add("Mica");
        s.add("Leonardo");
        
        System.out.println(s);
        
        s.sort(null);
        
        System.out.println(s);
            
    }
    
}
