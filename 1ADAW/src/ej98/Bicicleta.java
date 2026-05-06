package ej98;

public class Bicicleta extends Vehiculo {

    protected String tipo;

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        if (tipo.equals("urbana") || tipo.equals("deportiva")) {
            this.tipo = tipo;
        }
    }

    public void tocarTimbre() {
        System.out.println("RING RING");
    }

    @Override
    public String toString() {
        return super.toString() + " | tipo: " + tipo;
    }

}
