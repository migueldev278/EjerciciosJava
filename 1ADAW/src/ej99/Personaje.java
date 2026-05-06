package ej99;

public class Personaje {

    protected String nombre;
    protected int posX;
    protected int posY;
    protected double vida;
    protected double escudo;
    protected double ataque;

    public Personaje(String nombre, int posX, int posY, double vida, double escudo, double ataque) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
        this.vida = vida;
        this.escudo = escudo;
        this.ataque = ataque;
    }

    // Sumo x e y a la posición actual, nunca baja de 0
    public void desplazarse(int x, int y) {
        posX += x;
        posY += y;
        if (posX < 0) {
            posX = 0;
        }
        if (posY < 0) {
            posY = 0;
        }
    }

    // Ataca a otro personaje: resta el ataque de este personaje a la vida del objetivo
    public void atacar(Personaje objetivo) {
        if (objetivo instanceof Minion) {
            System.out.println("Estoy atacando a un minions");
        } else {
            System.out.println("Estoy atacando a un campeon");
        }
    }

    @Override
    public String toString() {
        String texto = "Nombre: " + nombre + "\n";
        texto += "PosX: " + posX + " PosY: " + posY + "\n";
        texto += "Vida: " + vida + "\n";
        texto += "Escudo: " + escudo + "\n";
        texto += "Ataque: " + ataque + "\n";
        return texto;
    }
}
