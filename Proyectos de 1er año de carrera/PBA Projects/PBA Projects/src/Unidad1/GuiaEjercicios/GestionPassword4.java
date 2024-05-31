
package Unidad1.GuiaEjercicios;

import java.util.Scanner;


public class GestionPassword4 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String pass="";
        System.out.println("Ingresa la cantidad de contraseñas que va a tener");
        
        int canPass = entrada.nextInt();
        pass= entrada.nextLine();
        
        Password4 passwords[] = new Password4[canPass];
        
        for(int i =0;i<passwords.length;i++){
            System.out.println("Ingrese una contraseña (Longitud minima 10)");
            
            pass=entrada.nextLine();
            while(pass.length()<10){
                System.out.println("La Contraseña no tiene la Longitud minima esperada");
                System.out.println("Por favor ingresela de nuevo");
                pass=entrada.nextLine();
            }
            Password4 password = new Password4(pass);
            passwords[i] = password;
            
            if(password.esFuerte())
                System.out.println("La contraseña es Fuerte");
            else
                System.out.println("La contraseña es debil");
        }
    }
    
}
