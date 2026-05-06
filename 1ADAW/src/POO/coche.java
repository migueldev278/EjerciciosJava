
package POO;

public class coche {

//EJ69
    
String color;
double anchura;
double altura;
int npuertas;
int nruedas;
boolean encendido; //T-on F-off
int gasolina;
final int maxgasolina=50;


//constructor

public coche(double anchura, double altura,String color, int puertas){
this.color=color;
this.altura=altura;
this.anchura=anchura;
this.npuertas=npuertas;
this.nruedas=4;
this.gasolina=this.maxgasolina;
}
        
public void arrancar(){
 if(!this.encendido){
     if (this.chequear()) {
         this.gasolina -=5;
     this.encendido=true;
     System.out.println("Coche arrancado...");
     }
     else{
         System.out.println("Fallo en el chequeo general..");
     }
 }   
 else{
     System.out.println("El coche ya estaba encendido...");
 }
}

public void parar(){
    if(this.encendido){
        this.encendido=false;
        System.out.println("El coche esta apagado...");
    }
    else{
        System.out.println("El coche ya estaba apagado...");
    }
}

public void desplazarse(){
    if(this.encendido){
        if (this.gasolina<=5) {
         this.gasolina -=5;
         System.out.println("Coche en movimiento...");
     }
     else{
         System.out.println("No hay suficiente gasolina para arrancar el coche..");
     }      
    }
    else{
        System.out.println("Coche esta apagado...");
    }
}

public void echargasolina(int cantidad){
    if (this.encendido=false) {
        this.parar();
        this.gasolina+=cantidad;
        if (this.gasolina>this.maxgasolina) {
           this.gasolina=this.maxgasolina;
        }
        System.out.println("Ahora tenemos"+this.gasolina+" litros de gasolina");
    }
}

public void pintar(String nuevo){
    this.color=nuevo;
}

public boolean chequear(){
    /*
    if (this.gasolina>0) {
        return true;
    }else{
       return false;
    }
    */
    return (this.gasolina>=5);
}


//método toString

public String toString(){
    String res="";
    res+= "Coche: \n";
    res+="Anchura: "+this.anchura+"\n";
    res+="Altura: "+this.altura+"\n";
    res+="Color: "+this.color+"\n";
    
    if (this.encendido) {
        res+="El coche está encendido";
        
    }else{
        res+="El coche esta apagado";
    }
    
    return res;
}



}