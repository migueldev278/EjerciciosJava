package ejabstracta;


public class Teniente extends ShinigamiPuro {

    // No tiene propiedades nuevas, solo las heredadas

    // Constructor: recibe lo mismo que ShinigamiPuro
    public Teniente(String nombre, int edad, String origen, Zanpakuto espada, int escuadron) {
        // Llamamos al constructor del padre (ShinigamiPuro)
        super(nombre, edad, origen, espada, escuadron);
    }

    // invocarBankai: los tenientes aun no pueden invocar bankai, solo muestra mensaje
    public void invocarBankai() {
        System.out.println(nombre + " aún no puede invocar su bankai");
    }

    // pelear: ataca de forma diferente segun el tipo del rival
    public void pelear(Shinigami rival) {
        int dano = 0;

        if (rival instanceof Teniente) {
            // VS teniente: ataque propio - resistencia del rival (valor absoluto)
            dano = getEspada().getAtaque() - rival.getEspada().getResistencia();

        } else if (rival instanceof Capitan || rival instanceof Sustituto) {
            // VS capitan o sustituto: ataque propio - resistencia del rival + poder del rival (valor absoluto)
            dano = getEspada().getAtaque() - rival.getEspada().getResistencia() + rival.getPoder();
        }

        // Valor absoluto para que el daño no sea negativo
        dano = Math.abs(dano);

        // Aplicamos el daño al rival
        rival.recibirDano(dano);
    }

    // toString: muestra el formato especifico del teniente
    public String toString() {
        return nombre + " [vida: " + vida + ", poder: " + poder + "] Teniente del escuadrón " + escuadron + "\n" + getEspada().toString();
    }
}
