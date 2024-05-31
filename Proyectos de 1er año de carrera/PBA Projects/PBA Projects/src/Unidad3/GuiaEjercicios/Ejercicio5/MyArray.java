package Unidad3.GuiaEjercicios.Ejercicio5;

public class MyArray implements Comparable<MyArray> {

    private int[] num;

    public MyArray(int[] num) {
        this.num = num;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    @Override
    public int compareTo(MyArray o) {
        int a = 0, b = 0;
        for (int i : this.num) {
            a = a + i;
        }

        for (int i : o.getNum()) {
            b = b + i;
        }
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return 0;
        }

    }
}
