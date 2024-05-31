package Unidad1.GuiaEjercicios;

public class Password4 {

    private String texto;
    private int longitud;

    public Password4() {
        this.texto = "";
        this.longitud = texto.length();
    }

    public Password4(String texto) {
        this.texto = texto;
        this.longitud = texto.length();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getLongitud() {
        return longitud;
    }

    public boolean esFuerte() {
        int may = 0, min = 0, num = 0;
        for (int i = 0; this.texto.length() > i; i++) {
            if (this.texto.charAt(i) >= 'A' && this.texto.charAt(i) <= 'Z') {
                may++;
            } else if (this.texto.charAt(i) >= 'a' && this.texto.charAt(i) <= 'z') {
                min++;
            } else if (this.texto.charAt(i) >= '0' && this.texto.charAt(i) <= '9') {
                num++;
            }
        }
        if (may > 2 && min > 1 && num > 5) {
            return true;
        } else {
            return false;
        }
    }

}
