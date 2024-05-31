
package Unidad4.Clase14PilasColas;

import java.util.Stack;


public class Pila {

    
    public static void main(String[] args) {
        Stack<Character> pila = new Stack<>();
        
        String cad ="abbcbba";
        
        /*pila.push('b');
        pila.push('a');
        pila.push('b');
        pila.push('b');
        pila.push('a')*/
        int i = 0;
        while (i<cad.length()&&cad.charAt(i)!= 'c'){
            pila.push(cad.charAt(i));
            i++;
        }
        if(cad.charAt(i)=='c')
            i++;
        while(i<cad.length()&&cad.charAt(i)==pila.pop()){
            i++;
        }
        if(cad.length()==i && pila.isEmpty())
            System.out.println("La cadena es regular");
        else
            System.out.println("La cadena no es regular");
    }
    
}
