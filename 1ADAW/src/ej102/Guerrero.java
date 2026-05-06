package ej102;


public abstract class Guerrero extends Ofensivo{
    
    String arma;
    int fuerza;
    
    public Guerrero(String arma, int fuerza,  int ataque, int defensa, String nombre, int nivel) {
        super(ataque, defensa, nombre, nivel);
        this.arma = arma;
        this.fuerza = fuerza;
    }

    @Override
    public int calcularDanio() {
        
        return 0;
        
    }
    
    void gritoGuerra(){
        fuerza += 3;
    }
    
    
    
    
    
}
