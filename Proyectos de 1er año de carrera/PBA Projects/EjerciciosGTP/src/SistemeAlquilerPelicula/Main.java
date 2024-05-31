
package SistemeAlquilerPelicula;


public class Main {

    
    public static void main(String[] args) {
        SistemaAlquilerPelicula sap = new SistemaAlquilerPelicula();
        Usuario u1 = new Usuario("Axel","Fumis");
        Usuario u2 = new Usuario("Aixa","Orbelli");
        
        Pelicula p1 = new Pelicula("Ciencia Ficcion","Terminator","Steven",110);
        Pelicula p2 = new Pelicula("Fantasia","Avatar","Phill",150);
        Pelicula p3 = new Pelicula("Comedia","Son como niños","Chris",80);
        Pelicula p4 = new Pelicula("Accion","Indestrutibles","Barney",75);
        
        sap.añadirPelicula(p1);
        sap.añadirPelicula(p2);
        sap.añadirPelicula(p3);
        sap.añadirPelicula(p4);
        
        sap.alquilarPelicula(p1, u1);
        sap.alquilarPelicula(p2, u2);
        sap.alquilarPelicula(p3, u1);
        sap.alquilarPelicula(p2, u1);
        
        sap.mostrarPeliculasDisponibles();
        
        sap.devolverPelicula(p1, u1);
        sap.devolverPelicula(p2, u1);
        
        System.out.println(sap.buscarPelicula("Avatar"));
        
        sap.mostrarHistorialAlquileres(u1);
        sap.mostrarHistorialAlquileres(u2);
        
        sap.mostrarPeliculasDisponibles();
    }
    
}
