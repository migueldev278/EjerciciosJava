package POO2;

public class RuletaRusa {

    Revolver pistola;
    int numJugadores;
    Jugador jugadores[];

    public RuletaRusa(Revolver pistola, int numJugadores) {
        this.pistola = pistola;
        if (numJugadores > this.pistola.getTambor().size()) {
            numJugadores = this.pistola.getTambor().size();
        }
        this.numJugadores = numJugadores;
        this.jugadores = new Jugador[numJugadores];
        for (int i = 1; i < numJugadores; i++) {
            this.jugadores[i] = new Jugador("Jugador " + (i));
        }
    }

    public boolean gameover() {
        boolean encontrado = false;
        int i = 0;
        while (i < this.jugadores.length && !encontrado) {
            if (!this.jugadores[i].vivo == false) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

    public void ronda(){
        for (int i = 0; i < this.jugadores.length; i++) {
            System.out.println(jugadores[i].nombre+ " se dispara...");
            jugadores[i].disparar(this.pistola);
            if (!jugadores[i].vivo) {
                System.out.println(jugadores[i].nombre + " ha muerto...");
            }
        }
    }
    
    
}
