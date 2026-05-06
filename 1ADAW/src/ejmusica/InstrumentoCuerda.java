package ejmusica;


public abstract class InstrumentoCuerda extends Instrumento {

    protected int numCuerdas;
    protected boolean cuerdaPercutida; // true = percutida, false = pulsada

    // Constructor con partitura
    public InstrumentoCuerda(String marca, int mes, int anio, Partitura partitura, int numCuerdas, boolean cuerdaPercutida) {
        super(marca, mes, anio, partitura);
        this.numCuerdas = numCuerdas;
        this.cuerdaPercutida = cuerdaPercutida;
    }

    // Constructor sin partitura (la genera aleatoriamente el padre)
    public InstrumentoCuerda(String marca, int mes, int anio, int numCuerdas, boolean cuerdaPercutida) {
        super(marca, mes, anio);
        this.numCuerdas = numCuerdas;
        this.cuerdaPercutida = cuerdaPercutida;
    }
}
