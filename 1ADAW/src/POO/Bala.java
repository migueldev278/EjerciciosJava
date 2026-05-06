
package POO;

public class Bala {
    
    private int calibre;
    private int longitud;

    public Bala(int calibre, int longitud) {
        this.calibre = calibre;
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Bala de calibre " + this.calibre + "mm y longitud " + this.longitud + "mm";
    }
    
    
    
}
