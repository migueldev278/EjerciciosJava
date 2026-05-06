package POO;

public class moto {

    String marca;
    String modelo;
    int caballosCv;
    double velocidad;
    boolean motor;

    //Método CONSTRUCTOR
    public moto(String marca, String modelo, int caballosCv, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.caballosCv = caballosCv;
        this.velocidad = 0;
        this.motor = false;
    }

    //Métodos de clase
    public void arrancar() {
        if (!this.motor) {
            this.motor = true;
            this.velocidad = 0;
        }
    }

    public void parar() {
        if (this.motor) {
            this.motor = false;
            this.velocidad = 0;
        }
    }

    public void acelerar() {
        do {
            if (this.motor) {
                this.velocidad += 10;

            }
        } while (this.velocidad < 200);

    }
    
    public void frenar() {
        do {
            if (this.motor) {
                this.velocidad -= 10;

            }
        } while (this.velocidad > 0);

    }
   
    public void mostrarinfo() {
        System.out.println("LAMPARA");
        System.out.println("-------");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Caballos(CV): "+this.caballosCv);
        System.out.println("Velocidad: "+this.velocidad);
    }
}


