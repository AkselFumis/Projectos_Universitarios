package Unidad1.GuiaEjercicios;

public class PatenteAuto2 {

    public class Patente {

        String letrasInicioPatente;
        int numeroPatente;
        String letrasFinPatente;

        public Patente() {
            letrasInicioPatente = "AA";
            numeroPatente = 111;
            letrasFinPatente = "AA";
        }

        public int getNumeroPatente() {
            return numeroPatente;
        }

        public void setNumeroPatente(int numeroPatente) {
            if (numeroPatente > 0 && (numeroPatente < 1000)) {
                this.numeroPatente = numeroPatente;
            } else {
                System.out.println("Número de Patente Inválido");
            }
        }

        public String getLetrasInicioPatente() {
            return letrasInicioPatente;
        }

        public String getLetrasFinPatente() {
            return letrasFinPatente;
        }

        public void setLetrasInicioPatente(String letrasPatente) {
            if (letrasPatente.length() == 2) {
                this.letrasInicioPatente = letrasPatente;
            } else {
                System.out.println("Letras de Patente Inválida");
            }

        }

        public boolean validarLongitudPatente(String unasletrasPatente) {
            return unasletrasPatente.length()==4;
        }
    }

}
