package ej98;


public class Coche extends Vehiculo{
    
    protected double velocidad;
    protected int cilindrada;

    public Coche(String color, int ruedas, double velocidad, int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + " velocidad: " + velocidad + " km/h | cilindrada: "
                + cilindrada + " cc";
    }
    
    
    
    
}
