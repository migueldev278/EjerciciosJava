package ej102;


public class Mago extends Ofensivo {
    
    String escuelaMagia;
    int mana;

    public Mago(String escuelaMagia,int mana,  int ataque, int defensa, String nombre, int nivel) {
        super(ataque, defensa, nombre, nivel);
        this.escuelaMagia = escuelaMagia;
        this.mana = mana;
    }

    @Override
    public String tipoPersonaje() {
        return super.tipoPersonaje(); 
    }
    
    
    @Override
    public int calcularDanio() {

        return 0;

    }
    
    void lanzarHechizo(){
        mana -= 10;
        
    }
    
    
    
}
