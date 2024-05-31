package Unidad2.GuiaEjercicios;

public final class Cero extends DigitoBinario {

    public Cero() {
    }

    @Override
    public String toString() {
        return "0";
    }

    @Override
    public DigitoBinario and(DigitoBinario unDigito) {
        return new Cero();
    }

    @Override
    public DigitoBinario or(DigitoBinario unDigito) {
        return unDigito;
    }

    @Override
    public DigitoBinario not() {
        return new Uno();
    }

    public Boolean asBoolean() {
        return new Boolean(false);
    }
}
