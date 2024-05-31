package Unidad3.GuiaEjercicios.Ejercicio5;

public class MyArrays {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{-1, 2, -3, 4, -5};
        MyArray m1 = new MyArray(a);
        MyArray m2 = new MyArray(b);
        System.out.println(m1.compareTo(m2));
    }

}
