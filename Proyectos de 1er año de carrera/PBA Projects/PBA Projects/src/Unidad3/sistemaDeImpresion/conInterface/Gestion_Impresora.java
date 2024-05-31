
package Unidad3.sistemaDeImpresion.conInterface;


public class Gestion_Impresora {

   
    public static void main(String[] args) {
        
        Impresora2 imp = new Impresora2();
        Imprimible a = new ArchivoDePhotoshop();
        Imprimible b = new ArchivoDeWord();
        Imprimible c = new Contrato();
        
        imp.agregarCola(a);
        imp.agregarCola(b);
        imp.agregarCola(c);
        
        imp.procesarColaDeImpresion();
    }
    
}
