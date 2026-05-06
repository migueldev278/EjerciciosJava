package ejmusica;


public class Partitura {

    private String nombre;
    private String autor;
    // Array de maximo 100 notas
    private Nota[] notas;
    // Cuantas notas hay actualmente en el array
    private int numNotasActual;

    // Constructor: solo recibe nombre y autor, el array empieza vacio
    public Partitura(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
        this.notas = new Nota[100]; // maximo 100 notas
        this.numNotasActual = 0;    // empieza sin ninguna nota
    }

    // numNotas(): devuelve cuantas notas tiene la partitura ahora mismo
    public int numNotas() {
        return numNotasActual;
    }

    // addNota(): añade la nota al final del array. Devuelve true si se pudo, false si no
    public boolean addNota(Nota nueva) {
        // Si ya hay 100 notas no se puede añadir mas
        if (numNotasActual >= 100) {
            return false;
        }
        // Ponemos la nota en la siguiente posicion libre y sumamos el contador
        notas[numNotasActual] = nueva;
        numNotasActual++;
        return true;
    }

    // toString: nombre y autor en la primera linea, luego notas de 10 en 10
    public String toString() {
        String resultado = nombre + " de " + autor + "\n";

        // Recorremos todas las notas con while
        int i = 0;
        while (i < numNotasActual) {
            resultado = resultado + notas[i].toString();

            // Cada 10 notas ponemos un salto de linea (pero no al principio)
            // i+1 porque i empieza en 0: la nota 10 es i=9, 9+1=10, 10%10=0
            if ((i + 1) % 10 == 0) {
                resultado = resultado + "\n";
            }
            i++;
        }
        return resultado;
    }

    // Getter del array de notas: lo necesita Instrumento para tocar la partitura
    public Nota[] getNotas() {
        return notas;
    }
}
