package ej98;

public class Vehiculo {

    protected String color;
    protected int ruedas;

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    // toString: muestra el tipo real del objeto (Coche, Bicicleta...) y sus atributos
    @Override
    public String toString() {
        return getClass().getSimpleName() + " | color: " + color + " | ruedas: " + ruedas;
    }
}
