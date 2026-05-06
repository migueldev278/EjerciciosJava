package ejabstracta;


public abstract class Shinigami {

    // Propiedades protegidas (las subclases pueden acceder a ellas directamente)
    protected String nombre;
    protected int edad;
    protected String origen;
    protected int vida;
    protected int poder;

    // La espada es privada, solo accesible desde esta clase o mediante getter
    private Zanpakuto espada;

    // Constructor: recibe nombre, edad, origen y espada
    public Shinigami(String nombre, int edad, String origen, Zanpakuto espada) {
        this.nombre = nombre;
        this.edad = edad;
        this.origen = origen;
        this.espada = espada;

        // La vida siempre empieza en 1500
        this.vida = 1500;

        // Poder aleatorio entre 5 y 50
        // Rango de 46 valores (50-5+1=46), base 5
        this.poder = (int)(Math.random() * 46) + 5;
    }

    // invocarBankai: abstracto porque cada tipo de shinigami lo hace diferente
    public abstract void invocarBankai();

    // pelear: abstracto porque cada tipo ataca diferente segun el tipo del rival
    public abstract void pelear(Shinigami rival);

    // toString base: muestra nombre, vida, poder y datos de la espada
    public String toString() {
        return nombre + " [vida: " + vida + ", poder: " + poder + "]\n" + espada.toString();
    }

    // Getter de la espada: necesario para que las subclases puedan usarla en pelear()
    // La espada es privada pero los hijos necesitan leerla para calcular daño
    public Zanpakuto getEspada() {
        return espada;
    }

    // Getter del nombre: para usarlo en los mensajes de los metodos
    public String getNombre() {
        return nombre;
    }

    // Getter de vida: para mostrarlo
    public int getVida() {
        return vida;
    }

    // Metodo para restar vida al shinigami cuando recibe daño
    // Lo necesitamos en pelear() para aplicar el daño al defensor
    public void recibirDano(int dano) {
        this.vida = this.vida - dano;
    }

    // Getter del poder: para usarlo en los calculos de pelear()
    public int getPoder() {
        return poder;
    }
}
