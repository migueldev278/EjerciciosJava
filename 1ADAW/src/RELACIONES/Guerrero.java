
package RELACIONES;

import RELACIONES.otros.Arma;

public class Guerrero {
    
    String nombre;
    int saludMAX;
    int fuerza;
    int escudo;
    private int saludActual;
    boolean vivo;
    Arma weapon;

    public Guerrero() {
    }

    public Guerrero(String nombre, int saludMAX, int fuerza, int escudo, Arma palillo) {
        this.nombre = nombre;
        this.saludMAX = saludMAX;
        this.fuerza = fuerza;
        this.escudo = escudo;
        this.saludActual = saludMAX;
        this.vivo=true;
        this.weapon = palillo;
    }
    
    public void atacar(Guerrero defensor){
        if (vivo) {
            int danio = this.fuerza+this.weapon.getPoder()-defensor.escudo;
            defensor.saludActual -= danio;
            int resTemporal = this.weapon.getResistencia();
            this.weapon.setResistencia(resTemporal-1);
            if (defensor.saludActual <= 0) {
                defensor.vivo=false;
            }
        }else{
            System.out.println(this.nombre+" esta morido...");
        }
    }
    
    
    
    
    
}
