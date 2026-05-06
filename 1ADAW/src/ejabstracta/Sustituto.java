
package ejabstracta;

public class Sustituto extends ShinigamiMestizo {

    // Zona que vigila el sustituto
    private String zonaAsignada;

    // Constructor: recibe todo lo del padre mas la zona asignada
    public Sustituto(String nombre, int edad, String origen, Zanpakuto espada, String zonaAsignada) {
        // Llamamos al constructor del padre (ShinigamiMestizo)
        super(nombre, edad, origen, espada);
        this.zonaAsignada = zonaAsignada;
    }

    // vigilar: muestra por pantalla la zona que vigila
    // No recibe ni devuelve nada
    public void vigilar() {
        System.out.println(nombre + " vigila " + zonaAsignada);
    }

    // invocarBankai: transforma la espada con los multiplicadores del sustituto
    public void invocarBankai() {
        // El ataque se multiplica por (porcentajeHollow / 10)
        // La resistencia se multiplica por 2
        getEspada().bankai(porcentajeHollow / 10, 2);
        System.out.println(nombre + " ha invocado su bankai");
    }

    // pelear: ataca a otro shinigami de forma diferente segun su tipo
    public void pelear(Shinigami rival) {
        int dano = 0;

        // Comprobamos el tipo del rival con instanceof
        if (rival instanceof Sustituto) {
            // VS sustituto: ataque propio - resistencia del rival (valor absoluto)
            dano = getEspada().getAtaque() - rival.getEspada().getResistencia();

        } else if (rival instanceof Teniente) {
            // VS teniente: ataque propio + poder propio - resistencia del rival (valor absoluto)
            dano = getEspada().getAtaque() + poder - rival.getEspada().getResistencia();

        } else if (rival instanceof Capitan) {
            // VS capitan: ataque propio - resistencia del rival + poder del rival (valor absoluto)
            dano = getEspada().getAtaque() - rival.getEspada().getResistencia() + rival.getPoder();
        }

        // Math.abs() para asegurar que el daño sea positivo (valor absoluto)
        dano = Math.abs(dano);

        // Aplicamos el daño al rival
        rival.recibirDano(dano);
    }

    // toString: muestra el formato especifico del sustituto
    public String toString() {
        return nombre + " [vida: " + vida + ", poder: " + poder + "] Shinigami Sustituto\n" + getEspada().toString();
    }
}
