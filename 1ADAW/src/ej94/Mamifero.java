
package ej94;


public class Mamifero {
    int numPatas;
    double mediaVida;

    public Mamifero(int numPatas, double mediaVida) {
        this.numPatas = numPatas;
        this.mediaVida = mediaVida;
    }

    public String comunicarse() { return ""; }

    public void dormir() {
        System.out.println("Duermo 8 horas.");
    }

    public String toString() {
        return "Patas: " + numPatas + ", Vida media: " + mediaVida;
    }
}