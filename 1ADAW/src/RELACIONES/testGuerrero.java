package RELACIONES;

import RELACIONES.otros.Arma;

public class testGuerrero {

    public static void main(String[] args) {
                
        Arma mazo = new Arma("Machete", 10, 15);
        Guerrero diego = new Guerrero("El matador", 100, 40, 75, mazo);
       
    }
    
}
