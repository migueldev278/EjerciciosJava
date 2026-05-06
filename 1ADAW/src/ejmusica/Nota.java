package ejmusica;


public class Nota {

    // Valor de la nota: do, re, mi, fa, sol, la, si
    private String valor;
    // Duracion en segundos
    private int duracion;

    // Constructor: recibe el valor y la duracion
    public Nota(String valor, int duracion) {
        this.valor = valor;
        this.duracion = duracion;
    }

    // toString: devuelve [valor,duracion]
    public String toString() {
        return "[" + valor + "," + duracion + "]";
    }

    // Getters necesarios para que Instrumento pueda leer el valor y duracion al tocar
    public String getValor() {
        return valor;
    }

    public int getDuracion() {
        return duracion;
    }
}
