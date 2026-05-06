package ejmusica;


public abstract class InstrumentoPercusion extends Instrumento {

    protected boolean usaBaquetas; // true si usa baquetas, false si no

    // Constructor con partitura
    public InstrumentoPercusion(String marca, int mes, int anio, Partitura partitura, boolean usaBaquetas) {
        super(marca, mes, anio, partitura);
        this.usaBaquetas = usaBaquetas;
    }

    // Constructor sin partitura
    public InstrumentoPercusion(String marca, int mes, int anio, boolean usaBaquetas) {
        super(marca, mes, anio);
        this.usaBaquetas = usaBaquetas;
    }
}
