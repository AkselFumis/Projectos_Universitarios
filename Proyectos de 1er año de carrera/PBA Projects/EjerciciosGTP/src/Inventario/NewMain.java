
package Inventario;

import java.util.*;

/**
 *
 * @author lirio
 */
public class NewMain {

    
    public static void main(String[] args) {
        List<Integer> dsa = new LinkedList<>();
        dsa.add(8);
        dsa.add(2);
        dsa.add(1);
        dsa.add(6);
        
        Iterator it = dsa.iterator();
        Collections.reverse(dsa);
        Collections.sort(dsa);
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
    }
    
}
