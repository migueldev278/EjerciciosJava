
package POO;

public class hoja {
    
    String color;
    double anchura;
    double largo;
    double grosor;

    public hoja(String color, double anchura, double largo, double grosor) {
        this.color = color;
        this.anchura = anchura;
        this.largo = largo;
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "hoja{" + "color=" + this.color + ", anchura=" + this.anchura + ", largo=" + this.largo + ", grosor=" + this.grosor + '}';
    }
    
    
    
    
}
