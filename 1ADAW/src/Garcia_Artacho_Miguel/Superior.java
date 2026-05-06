package Garcia_Artacho_Miguel;

public abstract class Superior extends NivelEducativo {

    protected int numObligatorias;
    protected double numOptativas;

    public Superior(String nombre, int duracion, int numObligatorias, double numOptativas) {
        super(nombre, duracion);
        this.numObligatorias = numObligatorias;
        this.numOptativas = numOptativas;
    }

    @Override
    public abstract String realizarEventoAnual();

    @Override
    public String toString() {
        return "Estudio Superior: " + getNombre() + "," + getDuracion() + " años. \n"
                + "Con: " + numObligatorias + " materiales obligatorias y " + numOptativas + " materiales Optativas.";
    }

}
