
package RELACIONES;

public class portatil {
    String marca;
    String modelo;
    boolean encendido;


    public portatil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = false;
    }
    
    public void usarPortatil(){
        if (this.encendido) {
            System.out.println("El portatil esta encendido y se usa para llegar a platino");
        }else{
            System.out.println("El portatil esta apagado, enciendelo antes");
        }
    }
    
    
}
