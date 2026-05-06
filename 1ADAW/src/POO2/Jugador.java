package POO2;

public class Jugador {

    String nombre;
    boolean vivo;
    Revolver gun;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.vivo = true;
    }

    public void disparar(Revolver pistola) {
        if (this.vivo) {
            if (this.gun.disparar()) {
                this.vivo = false;
            }
        }
        
    }

}
