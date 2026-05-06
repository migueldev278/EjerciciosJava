package POO2;

public class carta {
    private int numero;
    private char palo;

    public carta(int numero, char palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    

    @Override
    public String toString() {
        return "{" + this.numero + "-" + this.palo + "}";
    }
}
