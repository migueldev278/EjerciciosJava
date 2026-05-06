package Garcia_Artacho_Miguel;

public class Grado extends Superior {

    double porcentajeExito;
    String ramaEstudios;
    boolean falseando; //True - está engañando / False - No lo está haciendo

    public Grado(String nombre, int duracion, int numObligatorias, double numOptativas) {
        super(nombre, duracion, numObligatorias, numOptativas);
        super.calificacionMin = (int) Math.random() + (10 - 2 + 1) + 2;
        super.maxEstudiantes = (int) (calificacionMin * 3);
        this.porcentajeExito = porcentajeExito;
        this.ramaEstudios = ramaEstudios;
        this.falseando = falseando;
    }

    public void falsearDatos() {

        porcentajeExito += 10.0;

        if (porcentajeExito >= 100) {
            porcentajeExito = 99.6;
        }

        if (calificacionMin - 1.25 > 1) {
            calificacionMin -= 1.25;
        }
    }

    public void recuperarDatos() {
        porcentajeExito = this.porcentajeExito;
        calificacionMin = this.calificacionMin;
    }

    @Override
    public String realizarEventoAnual() {
        return "Vamos a una empresa a que nos den una charla";
    }

    protected void calculaDemanda() {
        int valorResultado = 0;

        valorResultado = Math.abs(100 - this.maxEstudiantes);
        if (this.nivelDemanda > 100) {
            valorResultado = 100;
        }
    }

    @Override
    public String toString() {
        return "Estudio Superior: " + getNombre() + ", " + getDuracion() + " años \n"
                + "Con: " + numObligatorias + " materiales obligatorias y " + numOptativas + "materiales optativas. \n"
                + "Perteneciente a la rama: " + ramaEstudios + "\n"
                + "Con un " + porcentajeExito + "% de alumnos que lo superan";
    }

}
