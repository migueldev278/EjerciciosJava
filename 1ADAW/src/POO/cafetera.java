
package POO;

public class cafetera {
    
    final int capacidadmaxima;
    int cantidadctual;
    
    public cafetera(){
        this.capacidadmaxima=1000;
        this.cantidadctual=0;
    }

    public void echarcafe(int cantidad){
         this.cantidadctual+=cantidad;
         if (this.cantidadctual>capacidadmaxima) {
            this.cantidadctual=capacidadmaxima;             
        }
    }
    
    public void llenarcafetera(){
        this.cantidadctual=this.capacidadmaxima;
    }
    
    public void vaciarcafetera(){
        this.cantidadctual=0;
    }
    
    public void servirtaza(int capacidad){
        if (this.cantidadctual>=capacidad) {
            this.cantidadctual-=capacidad;
            System.out.println("Se puede servir...");
        }else{
            System.out.println("No se ha podido servir...");
        }
    }
    
    public void cantidadcafe(){
        System.out.println("Queda: "+this.cantidadctual+" cc de cafe en la cafetera");
    }
   
}
