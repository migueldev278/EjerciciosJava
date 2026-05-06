package ej99;

public class Habilidad {

    String nombre;
    char tecla;
    int nivel;
    private double mana;
    private double dano;

    public Habilidad(String nombre, char tecla) {
        this.nombre = nombre;
        this.tecla = tecla;
        this.nivel = 1;

        // Mana: aleatorio entre 1 y 10 más la mitad del nivel
        mana = (int) (Math.random() * 10) + 1 + (nivel / 2.0);

        // Daño: aleatorio entre 5 y 20 más un tercio del mana
        dano = (int) (Math.random() * 16) + 5 + (mana / 3.0);
    }

    // Sube el nivel y recalcula mana y daño
    public void subirNivel() {
        nivel++;
        mana = (int) (Math.random() * 10) + 1 + (nivel / 2.0);
        dano = (int) (Math.random() * 16) + 5 + (mana / 3.0);
    }

    @Override
    public String toString() {
        String texto = "Habilidad: " + nombre + "\n";
        texto += "Tecla: " + tecla + "\n";
        texto += "Nivel: " + nivel + "\n";
        texto += "Mana: " + mana + "\n";
        texto += "Daño: " + dano + "\n";
        return texto;
    }
}
