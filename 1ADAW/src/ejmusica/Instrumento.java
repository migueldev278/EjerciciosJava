package ejmusica;


public abstract class Instrumento {

    protected String marca;
    protected int mesFabricacion;
    protected int anioFabricacion;
    protected Partitura partitura;
    protected boolean tocando;   // si esta tocando ahora mismo
    protected boolean roto;      // si esta roto no puede tocar

    // Array con las notas validas para generar notas aleatorias
    // Lo necesitamos aqui y en las subclases que generen notas, por eso esta aqui
    private static String[] notasValidas = {"do", "re", "mi", "fa", "sol", "la", "si"};

    // Constructor con partitura recibida como parametro
    public Instrumento(String marca, int mes, int anio, Partitura partitura) {
        this.marca = marca;
        this.mesFabricacion = mes;
        this.anioFabricacion = anio;
        this.partitura = partitura;
        this.tocando = false; // al crearse no esta tocando
        this.roto = false;    // al crearse no esta roto
    }

    // Constructor sin partitura: la genera aleatoriamente
    public Instrumento(String marca, int mes, int anio) {
        this.marca = marca;
        this.mesFabricacion = mes;
        this.anioFabricacion = anio;
        this.tocando = false;
        this.roto = false;

        // Creamos la partitura con nombre y autor "desconocido"
        this.partitura = new Partitura("desconocido", "desconocido");

        // Numero aleatorio de notas entre 10 y 100
        int numNotas = (int)(Math.random() * 91) + 10;

        // Generamos ese numero de notas aleatorias y las añadimos
        int i = 0;
        while (i < numNotas) {
            partitura.addNota(generarNotaAleatoria());
            i++;
        }
    }

    // generarNotaAleatoria(): crea una nota con valor y duracion aleatorios
    // La necesitamos aqui y en aniadirNota(), por eso la extraemos como metodo
    private Nota generarNotaAleatoria() {
        // Valor aleatorio de entre las 7 notas validas
        String valor = notasValidas[(int)(Math.random() * 7)];
        // Duracion aleatoria entre 1 y 5
        int duracion = (int)(Math.random() * 5) + 1;
        return new Nota(valor, duracion);
    }

    // aniadirNota(): genera una nota aleatoria y la añade a la partitura
    public boolean aniadirNota() {
        return partitura.addNota(generarNotaAleatoria());
    }

    // tocarPartitura(): abstracto porque cada instrumento suena diferente
    public abstract String tocarPartitura();

    // pararDeTocar(): el instrumento deja de tocar
    public void pararDeTocar() {
        this.tocando = false;
    }

    // afinar(): abstracto porque cada instrumento se afina diferente
    public abstract void afinar();
}
