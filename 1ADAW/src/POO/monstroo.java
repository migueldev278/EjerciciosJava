
package POO;

import javax.print.attribute.standard.PresentationDirection;

public class monstroo {
    
    //Propiedades o atributos de la clase
    String nombre;
    int puntesf;
    int vidatotales;
    int puntoshambre;
    private boolean vivo; //T - vivo F - muerto 
    private final int MAXESF=10;
    
    //Método constructor
    public monstroo(String nombre){
        this.nombre=nombre;
        this.puntesf=MAXESF;
        this.puntoshambre=3;
        this.vidatotales=7;
        this.vivo=true;
    }
    
    public monstroo(){
        this.nombre="pepe";
        this.puntesf=MAXESF;
        this.puntoshambre=3;
        this.vidatotales=7;
        this.vivo=true;
    }
    
    //Métodos
    
    //Método para comprobar si el monstruo está vivo o muerto.
    public boolean estavivo(){
        return vivo;
    }
    
    public void dormir(){
        if (vivo) {
            this.puntesf += 5;
            if (this.puntesf<=MAXESF) {
                
            }
        }
    }
    
    private void vive(){
        if(this.vidatotales)
    }
    private void perdervida(){
        if(this.puntoshambre<=0 && this.vidatotales >0)
           this.vidatotales-=1;
           this.puntesf=10;
           this.puntoshambre=3;
           this.vivo=true;
        if (vivo) {
            
        }
    }
    
    vive();
    public void jugar(){
        if (vivo) {
            this.vidatotales-=3;
            this.puntoshambre-=1;
            perdervida();
        }else{
            System.out.println("Esta muerto no puede perder puntos.");
        }
    }

        public void comer(boolean comidafav){
            if (vivo) {
                this.puntesf-=1;
                this.puntoshambre+=2;
                if (comidafav) {
                    this.puntoshambre+=1;
                }
                
            }
        }
            
     
    
    
    
}
