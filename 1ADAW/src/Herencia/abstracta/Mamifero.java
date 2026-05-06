package Herencia.abstracta;

public abstract class Mamifero {
    
    String nombre;
    int numPatas;

    public Mamifero(String nombre, int numPatas) {
        this.nombre = nombre;
        this.numPatas = numPatas;
    }

    public abstract String tipoMamifero();
    
    public abstract void comunicarse();

    
    @Override
    public String toString() {
        return "Mamifero{" + "nombre=" + nombre + ", numPatas=" + numPatas + '}';
    }
    
    
}
