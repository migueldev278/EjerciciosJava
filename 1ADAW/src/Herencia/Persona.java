
package Herencia;

public class Persona {
    
    public String nombre;
    int edad;
    private String dni;
    protected double altura;

    public Persona(String nombre, int edad, String dni, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.altura = altura;
    }
    
    public Persona(){
        this.nombre= "Desconocido";
        this.edad = -1;
        this.dni= " Sin dni";
        this.altura = -1.0;
    }

    public String getDni() {
        return dni;
    }
    
    
    
    public void hablar(){
        System.out.println(this.nombre+" esta hablando...");
    }
    
    
    
    
    
}
