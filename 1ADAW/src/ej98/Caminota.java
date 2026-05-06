package ej98;

public class Caminota extends Coche {

    int carga;

    public Caminota(String color, int ruedas, double velocidad, int cilindrada, int carga) {
        super(color, ruedas, velocidad, cilindrada);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + " | carga max: " + carga + "kg";
    }
}
