package ej99;

public class Minion extends Personaje {

    String tipo;

    // Pasamos 0 en vida, escudo y ataque porque los asignamos justo después según el tipo
    public Minion(String tipo) {
        super("minion",
                (int) (Math.random() * 1121) + 400, // posX entre 400 y 1520
                (int) (Math.random() * 1121) + 400, // posY entre 400 y 1520
                0, 0, 0);

        // Comprobamos que el tipo sea válido, si no ponemos Melee por defecto
        if (tipo.equals("Melee") || tipo.equals("Mago") || tipo.equals("Cañón")) {
            this.tipo = tipo;
        } else {
            this.tipo = "Melee";
        }

        // Asignamos vida, escudo y ataque según el tipo
        if (this.tipo.equals("Melee")) {
            vida = 50;
            escudo = 10;
            ataque = 10;
        } else if (this.tipo.equals("Mago")) {
            vida = 12;
            escudo = 40;
            ataque = 30;
        } else {
            vida = 75;
            escudo = 5;
            ataque = 25;
        }
    }

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "Tipo: " + tipo + "\n";
        return texto;
    }
}
