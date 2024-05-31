
package Libreria;


public class EjerciciosGTP {

    
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        
        
        Libro l1 = new Libro("Maria becerra","Titanes",200);
        libreria.añadirLibro(new Libro("L-gante","El Hobbits",200));
        libreria.añadirLibro(new Libro("Juan Pedro","El libro",257));
        libreria.añadirLibro(l1);
        
        System.out.println(libreria.listarLibros());
        
        libreria.eliminarLibro(l1);
        
        System.out.println(libreria.listarLibros());
        
        System.out.println(libreria.buscarLibro("El libro"));
    
    }
    
}
