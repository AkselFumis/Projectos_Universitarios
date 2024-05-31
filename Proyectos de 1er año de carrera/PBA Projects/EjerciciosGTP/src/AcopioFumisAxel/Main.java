package AcopioFumisAxel;

import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deque<Lote> cola = new ArrayDeque();
        cola.push(new Lote(1, 238, 899, 4, LocalTime.of(13, 55)));
        cola.push(new Lote(2, 454, 61, 18, LocalTime.of(9, 12)));
        cola.push(new Lote(3, 217, 432, 21, LocalTime.of(15, 23)));
        cola.push(new Lote(4, 88, 501, 23, LocalTime.of(15, 45)));
        cola.push(new Lote(5, 346, 119, 25, LocalTime.of(17, 28)));
        cola.push(new Lote(6, 165, 753, 28, LocalTime.of(10, 49)));
        cola.push(new Lote(7, 452, 342, 28, LocalTime.of(14, 02)));
        cola.push(new Lote(8, 122, 259, 28, LocalTime.of(17, 36)));

        System.out.println("El ultimo lote ingreso a las " + cola.getFirst().getHora() + " del dia " + cola.getFirst().getDia());

        List<Lote> lotesOrdenados = new LinkedList<>();
        Deque<Lote> lotesSobrantes = new ArrayDeque();
        boolean flag = true;
        int mismoDia = 0;
        while (!cola.isEmpty()) {

            if (flag) {
                mismoDia = cola.getFirst().getDia();
                flag = false;
            }
            if (mismoDia == cola.peek().getDia()) {
                lotesOrdenados.add(cola.pop());
            } else {
                lotesSobrantes.push(cola.pop());
            }
        }
        System.out.println("Lotes Ordenados por numero de Proveedor");
        Collections.sort(lotesOrdenados, (j1, j2) -> j1.getNroDeProveedor() - j2.getNroDeProveedor());
        for (Lote l : lotesOrdenados) {
            System.out.println(l);
        }/*
        
        Esto esta hecho por si quieren comprobar los lotes que no entraron en la Lista "Lotes Ordenados"
        
        System.out.println("Lotes Sobrantes");
        while(!lotesSobrantes.isEmpty()){
            System.out.println(lotesSobrantes.pop());
        }*/
        
    }

}
