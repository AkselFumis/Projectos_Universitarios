
package gesicalexamen;

import java.util.*;


public class GesicalExamen {

    
    public static void main(String[] args) {
        
        List<Disco> discos = new ArrayList<>();
        List<Solista> solistas = new ArrayList<>();
        
        Instrumento bajo=new Bajo();
        Instrumento teclado=new Teclado();
        Instrumento guitarra=new Guitarra();
        Instrumento bateria=new Bateria();
        
        Solista s1 = new Solista("Axel","Fumis","Argentina",bajo,"Rock","Sony",2003);
        Solista s2 = new Solista("Aixa","Fumis","Argentina",guitarra,"Rock","Sony",2003);
        Solista s3 = new Solista("Dario","Fumis","Argentina",bateria,"Rock","Sony",2003);
        Solista s4 = new Solista("Pedro","Caña","Mexico","Pop","Record",1989);
        Solista s5 = new Solista("Joan","Cruyf","Holanda",teclado,"Blues","Mueva",2000);
        Solista s6 = new Solista("Cara","Paty","Bolivia",bajo,"Cuarteto","Record",1990);
        Solista s7 = new Solista("Juan","Perez","España",guitarra,"Blues","Sony",2013);
        Solista s8 = new Solista("Juan","Quinteros","Colombia","Regaeton","Mueva",2020);
        
        Banda b = new Banda("La Banda de los millones","Rock","Sony",2003);
        
        b.agregarSolista(s1);
        b.agregarSolista(s2);
        b.agregarSolista(s3);
        
        Cancion c1 = new Cancion("Loca",210);
        Cancion c2 = new Cancion("Cuidad Magica",150);
        Cancion c3 = new Cancion("Petalos",230);
        Cancion c4 = new Cancion("Macarena",100);
        Cancion c5 = new Cancion("Dark Horse",310);
        Cancion c6 = new Cancion("Montero",210);
        Cancion c7 = new Cancion("Wacha",193);
        Cancion c9 = new Cancion("Mi ex",200);
        Cancion c8 = new Cancion("Alla",175);
        
        Disco d1 = new Disco("Tan bionica",2015);
        Disco d2 = new Disco("Random",2005);
        Disco d3 = new Disco("Cumbiacha",2022);
        
        d1.agregarCancion(c1);
        d1.agregarCancion(c2);
        d1.agregarCancion(c3);
        
        d2.agregarCancion(c4);
        d2.agregarCancion(c5);
        d2.agregarCancion(c6);
        
        d3.agregarCancion(c8);
        d3.agregarCancion(c7);
        d3.agregarCancion(c9);
        
        discos.add(d3);
        discos.add(d2);
        discos.add(d1);
        
        b.agregarDisco(d1);
        s5.agregarDisco(d2);
        s8.agregarDisco(d3);
        
        solistas.add(s1);
        solistas.add(s2);
        solistas.add(s3);
        solistas.add(s4);
        solistas.add(s5);
        solistas.add(s6);
        solistas.add(s7);
        solistas.add(s8);

        
        for(Solista s :solistas){
            System.out.print(s.getNombre() +" "+s.getApellido()+": ");
            if(s.getInstrumento()==null){
                System.out.println("Do re mi fa sol la si");
            }
            else
               s.getInstrumento().tocar();
        }

    }
    
}
