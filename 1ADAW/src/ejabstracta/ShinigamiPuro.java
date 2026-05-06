package ejabstracta;


public abstract class ShinigamiPuro extends Shinigami {

    // Numero de escuadron al que pertenece (del 1 al 13)
    protected int escuadron;

    // Constructor: recibe todo lo del padre mas el numero de escuadron
    public ShinigamiPuro(String nombre, int edad, String origen, Zanpakuto espada, int escuadron) {
        // Llamamos al constructor del padre (Shinigami)
        super(nombre, edad, origen, espada);

        // Validamos que el escuadron sea entre 1 y 13
        // Si no es correcto, sacamos un valor aleatorio entre 1 y 13
        if (escuadron >= 1 && escuadron <= 13) {
            this.escuadron = escuadron;
        } else {
            this.escuadron = (int)(Math.random() * 13) + 1;
        }
    }

    // shunpo: muestra por pantalla el desplazamiento del shinigami
    // No recibe ni devuelve nada
    public void shunpo() {
        System.out.println(nombre + " se ha desplazado usando shunpo.");
    }
}
