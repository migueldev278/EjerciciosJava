
package ejabstracta;

public class Zanpakuto {

    // Propiedades privadas de la espada
    private String nombre;
    private String tipo;          // tipo de espada
    private String color;         // color de la espada
    private int ataque;           // ataque actual (cambia con bankai/shikai)
    private int resistencia;      // resistencia actual (cambia con bankai/shikai)
    private String estado;        // "shikai" o "bankai"

    // Guardamos los valores originales para poder restaurarlos con shikai()
    // Los necesitamos porque bankai() los modifica y shikai() debe devolverlos al valor inicial
    private int ataqueOriginal;
    private int resistenciaOriginal;

    // Constructor: recibe nombre, tipo y color. Ataque, resistencia y estado se calculan aqui
    public Zanpakuto(String nombre, String tipo, String color) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;

        // Ataque aleatorio entre 2 y 25
        // Math.random() da un decimal entre 0.0 y 1.0
        // Multiplicando por 24 obtenemos 0.0 a 23.99, sumando 2 obtenemos 2 a 25.99
        // (int) lo convierte a entero truncando los decimales
        this.ataque = (int)(Math.random() * 24) + 2;

        // Resistencia aleatoria entre 70 y 150
        // Mismo proceso: rango de 81 valores (150-70+1=81), base 70
        this.resistencia = (int)(Math.random() * 81) + 70;

        // Guardamos los originales para poder restaurarlos despues con shikai()
        this.ataqueOriginal = this.ataque;
        this.resistenciaOriginal = this.resistencia;

        // Toda espada empieza en estado shikai
        this.estado = "shikai";
    }

    // bankai(): multiplica ataque y resistencia por los valores recibidos y cambia estado
    public void bankai(double multiplicadorAtaque, double multiplicadorResistencia) {
        this.ataque = (int)(this.ataque * multiplicadorAtaque);
        this.resistencia = (int)(this.resistencia * multiplicadorResistencia);
        this.estado = "bankai";
    }

    // shikai(): restaura los valores originales de ataque y resistencia y cambia estado
    public void shikai() {
        this.ataque = this.ataqueOriginal;
        this.resistencia = this.resistenciaOriginal;
        this.estado = "shikai";
    }

    // toString: devuelve nombre [atq: X, res: X] estado
    public String toString() {
        return nombre + " [atq: " + ataque + ", res: " + resistencia + "] " + estado;
    }

    // Getters necesarios para que las clases Shinigami puedan leer ataque y resistencia
    // Los necesitamos en Pelear() para calcular el daño
    public int getAtaque() {
        return ataque;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getNombre() {
        return nombre;
    }
}
