package ejabstracta;


public class Capitan extends ShinigamiPuro {

    // No tiene propiedades nuevas, solo las heredadas

    // Constructor: recibe lo mismo que ShinigamiPuro
    public Capitan(String nombre, int edad, String origen, Zanpakuto espada, int escuadron) {
        // Llamamos al constructor del padre (ShinigamiPuro)
        super(nombre, edad, origen, espada, escuadron);
    }

    // invocarBankai: transforma la espada con los multiplicadores del capitan
    public void invocarBankai() {
        // Ataque se multiplica por (numero de escuadron * 1.5)
        // Resistencia se multiplica por 1.5
        getEspada().bankai(escuadron * 1.5, 1.5);
        System.out.println(nombre + " ha invocado su bankai");
    }

    // pelear: ataca de forma diferente segun el tipo del rival
    public void pelear(Shinigami rival) {
        int dano = 0;

        if (rival instanceof Capitan) {
            // VS capitan: ataque propio - resistencia del rival (valor absoluto)
            dano = getEspada().getAtaque() - rival.getEspada().getResistencia();

        } else if (rival instanceof Teniente) {
            // VS teniente: ataque propio + poder propio - resistencia del rival (valor absoluto)
            dano = getEspada().getAtaque() + poder - rival.getEspada().getResistencia();

        } else if (rival instanceof Sustituto) {
            // VS sustituto: ataque propio - resistencia del rival + poder del rival (valor absoluto)
            dano = getEspada().getAtaque() - rival.getEspada().getResistencia() + rival.getPoder();
        }

        // Valor absoluto para que el daño no sea negativo
        dano = Math.abs(dano);

        // Aplicamos el daño al rival
        rival.recibirDano(dano);
    }

    // toString: muestra el formato especifico del capitan
    public String toString() {
        return nombre + " [vida: " + vida + ", poder: " + poder + "] Capitán del escuadrón " + escuadron + "\n" + getEspada().toString();
    }
}
