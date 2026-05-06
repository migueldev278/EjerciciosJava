package ej102;


public abstract class Ofensivo extends Personaje {

    private int ataque;
    private int defensa;
    
    
    
    public Ofensivo(int ataque, int defensa, String nombre, int nivel) {
        super(nombre, nivel);
        this.ataque = ataque;
        this.defensa = defensa;
    }

    void entrenar(int cantidad) {
        ataque += cantidad;
        defensa += cantidad;
    }

    public abstract int calcularDanio();

    @Override
    public String toString() {
        return super.toString() + "\n Ataque: " + ataque + " - Defensa=" + defensa;
    }

}
