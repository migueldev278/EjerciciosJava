package ej102;


public abstract class Personaje {

    private String nombre;
    private int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
    void subirNivel(){
        nivel += 1;
    }
    
    public abstract String tipoPersonaje();

    @Override
    public String toString() {
        return "Nombre: " + nombre + "- Nivel: " + nivel;
    }
}
