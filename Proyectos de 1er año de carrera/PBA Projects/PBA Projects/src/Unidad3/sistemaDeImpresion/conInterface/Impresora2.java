package Unidad3.sistemaDeImpresion.conInterface;


public class Impresora2 {
    //Atributos
    private final int maxEnCola=100;
    private int enCola=0;
    private Imprimible colaDeImpresion[] = new Imprimible[maxEnCola];
    //Constructores

    public Impresora2() {
    }
    
    //Getters y Setters
    //Métodos de clase
    
    public void procesarColaDeImpresion() {
        for(int i=0;i<enCola;i++) {
            imprimir(colaDeImpresion[i]);       //Alternativa 1
            //colaDeImpresion[i].imprimir();    //Alternativa 2
            
        }
        enCola=0;
    }
    
    public void imprimir(Imprimible objeto) {
        objeto.imprimir();
    }
    
    public void agregarCola(Imprimible i){
        colaDeImpresion[enCola] = i;
        enCola++;
    }
       
}
