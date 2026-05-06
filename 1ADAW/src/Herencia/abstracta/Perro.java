package Herencia.abstracta;


public abstract class Perro extends Mamifero{

    String raza;
    String color;
    
    
    public Perro(String nombre, int numPatas, String raza, String color) {
        super(nombre, numPatas);
        this.raza = raza;
        this.color = color;
    }

    public void cargarseEnElSalon(){
        System.out.println("me he cagado en el salon y no en la calle");
    }

    @Override
    public String tipoMamifero() {
        return "Soy un perro";
    }
    
    @Override
    public void comunicarse(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Guau Guau!!!");
        }
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", color=" + color + '}';
    }
}
