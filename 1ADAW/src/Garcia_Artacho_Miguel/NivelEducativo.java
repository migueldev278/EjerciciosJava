package Garcia_Artacho_Miguel;

public abstract class NivelEducativo {

    private String nombre;
    protected int maxEstudiantes;
    private int duracion;
    protected double nivelDemanda;
    protected String zona;
    protected double calificacionMin;

    public NivelEducativo(String nombre, int duracion) {
        this.nombre = nombre;
        this.maxEstudiantes = 0;
        this.duracion = duracion;
        this.nivelDemanda = 1;
        this.zona = "Andalucia";
        this.calificacionMin = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public abstract String realizarEventoAnual();

    @Override
    public String toString() {
        return nombre + "[" + zona + "," + duracion + " años]";
    }

}
