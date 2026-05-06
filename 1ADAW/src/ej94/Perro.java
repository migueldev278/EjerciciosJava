
package ej94;


public class Perro extends Mamifero {
    String raza;
    String nombre;

    public Perro(String raza, String nombre) {
        super(4, 13);
        this.raza = raza;
        this.nombre = nombre;
    }

    public String comunicarse() {
        return "¡Guau!"; 
    }

    public void dormir() {
        System.out.println(nombre + " duerme 18 horas.");
    }

    public void jugar() {
        System.out.println(nombre + " está jugando.");
    }



    public String toString() {
        return "Perro: ";
    }
}

