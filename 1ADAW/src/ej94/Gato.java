
package ej94;


public class Gato extends Mamifero {
    String raza;
    String nombre;
    String pelaje = "corto";

    public Gato(String raza, String nombre) {
        super(4, 15);
        this.raza = raza;
        this.nombre = nombre;
    }

    public String comunicarse() { return "¡Miau!"; }

    public void dormir() {
        System.out.println(nombre + " duerme 15 horas.");
    }

    public void cazar() {
        System.out.println("Mi gato de " + numPatas + " patas está cazando.");
    }

    public String getPelaje()            { return pelaje; }
    public void setPelaje(String pelaje) { this.pelaje = pelaje; }

    public String toString() {
        return "Gato: " + nombre + ", Raza: " + raza + ", Pelaje: " + pelaje;
    }
}