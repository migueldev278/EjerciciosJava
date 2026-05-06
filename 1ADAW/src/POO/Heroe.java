package POO;

public class Heroe {

    //Propiedades/atributos de la clase
    String nombre;
    boolean vuela; //T-vuela, F-no vuela    
    int edad;
    double altura;

    String color;
    String modelo;
    int numbombillas;
    double potenciaW;
    boolean lampara;
    

    //Método CONSTRUCTOR
    public Heroe(String nombre, int edad, boolean vuela, double alt) {
        this.nombre = nombre;
        this.vuela = vuela; //T-vuela, F-no vuela    
        this.edad = edad;
        this.altura = alt;
    }

    public Heroe(String color, String modelo, int numbombillas, double potenciaW) {
        this.color = color;
        this.modelo = modelo;
        this.numbombillas = numbombillas;
        this.potenciaW = potenciaW;
        this.lampara = false;
    }
    


    //Métodos de clase
    public void volar() {
        System.out.println("El heroe esta volando");
    }

    public void encender() {
        if (!this.lampara) {
            lampara = true;
            System.out.println("La lampara esta encendida");
        }
    }

    public void apagar() {
        if (this.lampara) {
            lampara = false;
            System.out.println("La lampara esta apagada");
        }
    }

    public void mostrarinfo() {
        System.out.println("LAMPARA");
        System.out.println("-------");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Color: "+this.color);
        System.out.println("N bombillas: "+this.numbombillas);
        System.out.println("Potencia: "+this.potenciaW);
        
        if (this.lampara&&this.numbombillas==1) {
            System.out.println("La bombilla esta encendida");
        }else if (this.lampara&&this.numbombillas>1) {
            System.out.println("Las bombillas estan encendidas");
        }else if (!this.lampara&&this.numbombillas>1) {
            System.out.println("Las bombillas estan apagadas");
        }
        else{
            System.out.println("La bombilla esta apagada");
        }
        
    }

}
