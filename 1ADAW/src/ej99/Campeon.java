package ej99;

public class Campeon extends Personaje {

    protected double mana;
    protected int nivel;
    protected String rol;
    protected Habilidad[] habilidades; // array de 4 habilidades, puede tener huecos null

    public Campeon(String nombre, String rol, Habilidad habilidad) {
        super(nombre,
                (int) (Math.random() * 921) + 1000, // posX entre 1000 y 1920
                (int) (Math.random() * 921) + 1000, // posY entre 1000 y 1920
                0, 0, 0); // vida, escudo y ataque los calculamos abajo

        this.nivel = 1;

        // Comprobamos que el rol sea válido, si no ponemos Carry por defecto
        if (rol.equals("Tanque") || rol.equals("Carry") || rol.equals("Support")
                || rol.equals("Mago") || rol.equals("Jungla")) {
            this.rol = rol;
        } else {
            this.rol = "Carry";
        }

        // Mana según el rol
        if (this.rol.equals("Tanque")) {
            mana = 100;
        } else if (this.rol.equals("Carry")) {
            mana = 300;
        } else if (this.rol.equals("Support")) {
            mana = 300;
        } else if (this.rol.equals("Mago")) {
            mana = 500;
        } else {
            mana = 200; // Jungla
        }
        // Ataque: aleatorio entre 3 y 7
        ataque = (int) (Math.random() * 5) + 3;

        // Vida: aleatorio entre 150 y 200 más bonus según rol
        vida = (int) (Math.random() * 51) + 150;
        if (this.rol.equals("Tanque")) {
            vida += 150;
        } else if (this.rol.equals("Support")) {
            vida += 50;
        } else if (this.rol.equals("Jungla")) {
            vida += 100;
        }

        // Escudo: aleatorio entre 15 y 20 más bonus según rol
        escudo = (int) (Math.random() * 6) + 15;
        if (this.rol.equals("Carry")) {
            escudo += 100;
        } else if (this.rol.equals("Support")) {
            escudo += 50;
        } else if (this.rol.equals("Mago")) {
            escudo += 150;
        }

        // Solo tiene la primera habilidad al crearse
        habilidades = new Habilidad[4];
        habilidades[0] = habilidad;
    }

    // Sube el nivel del campeón y añade habilidad si toca
    public void subirNivel(Habilidad nueva) {
        nivel++;

        vida += (int) (Math.random() * 9) + 1;
        escudo += ((int) (Math.random() * 9) + 1) / 10.0;
        ataque += ((int) (Math.random() * 9) + 1) / 10.0;

        // En nivel 4, 6 u 8 se añade la nueva habilidad al primer hueco libre
        if (nivel == 4 || nivel == 6 || nivel == 8) {
            boolean añadida = false;
            for (int i = 0; i < habilidades.length && !añadida; i++) {
                if (habilidades[i] == null) {
                    habilidades[i] = nueva;
                    System.out.println("Nueva habilidad añadida: " + nueva.nombre);
                    añadida = true;
                }
            }
        }
    }

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "Rol: " + rol + "\n";
        texto += "Nivel: " + nivel + "\n";
        texto += "Mana: " + mana + "\n";
        texto += "Habilidades:\n";
        for (int i = 0; i < habilidades.length; i++) {
            if (habilidades[i] != null) {
                texto += "  " + habilidades[i].nombre + "\n";
            }
        }
        return texto;
    }
}
