package Unidad2.Clase5Figuras;

public class Cliente {

    public static void main(String[] args) {

        Figura C = new Circulo(44.55);
        Figura R = new Rectangulo(30, 40);
        Figura T = new Triangulo(50, 70);

        System.out.println(C + " Area " + C.calcularArea());
        System.out.println(R + " Area " + R.calcularArea());
        System.out.println(T + " Area " + T.calcularArea());

        //Alternativa 2
        Figura figuras[] = new Figura[3];
        figuras[0] = C;
        figuras[1] = R;
        figuras[2] = T;

        for (int i = 0; i < figuras.length; i++) {
            System.out.println(figuras[i]);
        }

    }

}
