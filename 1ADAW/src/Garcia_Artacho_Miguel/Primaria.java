package Garcia_Artacho_Miguel;

public class Primaria extends NivelEducativo {

    protected int numCentros;
    protected double presupuesto;

    public Primaria(int numCentros, double presupuesto, String nombre, int duracion) {
        super(nombre, duracion = 6);
        this.numCentros = numCentros;
        this.presupuesto = presupuesto;
    }

    protected void calculaDemanda() {
        int valorResultado = 0;

        valorResultado = Math.abs(100 - super.maxEstudiantes);
        if (super.nivelDemanda > 100) {
            valorResultado = 100;
        }
    }

    public void absorber(Primaria otro) {
        if (otro instanceof Primaria) {
            this.numCentros = 1;
            super.maxEstudiantes += otro.maxEstudiantes;
            super.nivelDemanda = otro.nivelDemanda;
            this.presupuesto = (this.presupuesto + otro.presupuesto) / 2.25;
        }
    }

    @Override
    public String realizarEventoAnual() {
        return "Vamos al teatro a ver Peter Pan";
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "[" + calificacionMin + "," + nivelDemanda + "," + numCentros + "," + maxEstudiantes + "] \n"
                + presupuesto + "EUROS";
    }

}
