package ejmusica;


public abstract class InstrumentoViento extends Instrumento {

    protected String tipoViento; // "metal" o "madera"

    // Constructor con partitura
    public InstrumentoViento(String marca, int mes, int anio, Partitura partitura, String tipoViento) {
        super(marca, mes, anio, partitura);
        this.tipoViento = tipoViento;
    }

    // Constructor sin partitura
    public InstrumentoViento(String marca, int mes, int anio, String tipoViento) {
        super(marca, mes, anio);
        this.tipoViento = tipoViento;
    }
}
