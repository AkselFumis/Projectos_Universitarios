package Unidad4.Ejercicios;

import java.util.*;

public class Colas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Deque<Pedidos> colap = new ArrayDeque<>();
        int numProducto[] = new int[10];
        

        colap.add(new Pedidos(8, 5, 77));
        colap.add(new Pedidos(2, 5, 57));
        colap.add(new Pedidos(3, 7, 58));
        colap.add(new Pedidos(3, 9, 12));
        colap.add(new Pedidos(5, 1, 16));
        colap.add(new Pedidos(9, 1, 734));
        colap.add(new Pedidos(7, 1, 754));
        colap.add(new Pedidos(5, 2, 34));
        colap.add(new Pedidos(9, 7, 99));
        colap.add(new Pedidos(4, 8, 15));
        colap.add(new Pedidos(1, 4, 70));
        
        System.out.println("Escriba el id del cliente");
        int buscarCliente  = entrada.nextInt();
        
        
        
        
        while(!colap.isEmpty() && colap.peek().getNumCliente() != buscarCliente){
            
            numProducto[colap.peek().getNumProducto()-1]+= colap.pop().getCantProducto();
            
            
        }
        for(int i=0; i<numProducto.length;i++){
            System.out.println(numProducto[i]);
        }
        
    }

}
