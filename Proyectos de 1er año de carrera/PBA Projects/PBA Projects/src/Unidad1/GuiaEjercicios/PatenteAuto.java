package Unidad1.GuiaEjercicios;

public class PatenteAuto {

    public class Patente {

        String letrasInicioPatente;
        int numeroPatente;
        String letrasFinPatente;

        public Patente() {
            letrasInicioPatente = "";
            numeroPatente = 0;
            letrasFinPatente = "";
        }

        public Patente(String letrasInicioPatente, int numeroPatente ,String letrasFinPatente ) {
            this.letrasInicioPatente = letrasInicioPatente;
            this.numeroPatente = numeroPatente;
            this.letrasFinPatente = letrasFinPatente;
        }

        public int getNumeroPatente() {
            return numeroPatente;
        }

        public void setNumeroPatente(int numeroPatente) {
            this.numeroPatente = numeroPatente;
        }

        public String getLetrasInicioPatente() {
            return letrasInicioPatente;
        }

        public String getLetrasFinPatente() {
            return letrasFinPatente;
        }

        public void setLetrasInicioPatente(String letrasInicioPatente) {
            this.letrasInicioPatente = letrasInicioPatente;
        }

        public void setLetrasFinPatente(String letrasFinPatente) {
            this.letrasFinPatente = letrasFinPatente;
        }
    }

}
