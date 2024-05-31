package Unidad2.GuiaEjercicios;

public final class Uno extends DigitoBinario {

    public Uno() {
    }

    @Override
    public String toString() {
        return "1";
    }

    @Override
    public DigitoBinario and(DigitoBinario unDigito) {
        return unDigito;
    }

    @Override
    public DigitoBinario or(DigitoBinario unDigito) {
        return this;
    }

    @Override
    public DigitoBinario not() {
        return new Cero();
    }

    @Override
    public Boolean asBoolean() {
        return new Boolean(true);
    }
}
