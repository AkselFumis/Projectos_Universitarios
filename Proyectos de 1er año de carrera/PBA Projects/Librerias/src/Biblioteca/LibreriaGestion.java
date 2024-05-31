package Biblioteca;


public class LibreriaGestion {

    public static void main(String[] args) {
        Libro l = new Libro(209,1664,"Hobbits",true);
        Libro l2 = new Libro(201,1564,"Hobbits2",true);
        Libro l3 = new Libro(200,1264,"Hobbits3",true);
        Libro l4 = new Libro(150,1434,"Hobbits7",true);
        Cliente c = new Alumno(24523,4422333,"Axel","Fumis");
        Cliente c2 = new Profesor(22523,4234333,"Aixa","Fumis");
        Cliente c3 = new Profesor(224353,4567533,"Dario","Fumis");
        Libreria lib = new Libreria();
        
        lib.agregarCliente(c);
        lib.agregarCliente(c2);
        lib.agregarLibro(l);
        lib.agregarLibro(l2);
        lib.agregarLibro(l3);
        lib.agregarLibro(l4);
        
        System.out.println("Libros Prestados");
        
        lib.prestarLibro(l, c3);
        lib.prestarLibro(l4, c);
        
        lib.prestarLibro(l, c);
        lib.prestarLibro(l2, c);
        lib.prestarLibro(l3, c2);
        
        System.out.println(c);
        System.out.println(c2);
        
        System.out.println("Lista de Prestamos");
        
        System.out.println(lib.listadoDePrestamos());
        
        lib.devolverLibro(l, c);
        
        lib.devolverLibro(l3, c2);
        
        System.out.println(c);
        System.out.println(c2);
        
        System.out.println(lib.masCapitulo());
        
        
    }
}
