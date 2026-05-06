package ej98;

public class Motocicleta extends Bicicleta {

    double velocidad;
    int cilindrada;

    public Motocicleta(String color, int ruedas, String tipo, double velocidad,
            int cilindrada) {
        super(color, ruedas, tipo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;

    }

    @Override
    public String toString() {
        return super.toString() + " velocidad: " + velocidad + " km/h | cilindrada: "
                + cilindrada + " cc";
    }

}
