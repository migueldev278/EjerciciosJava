package ejabstracta;


public abstract class ShinigamiMestizo extends Shinigami {

    // Porcentaje de hollow y quincy con decimales
    protected double porcentajeHollow;
    protected double porcentajeQuincy;

    // Constructor: recibe lo mismo que Shinigami, los porcentajes se calculan aqui
    public ShinigamiMestizo(String nombre, int edad, String origen, Zanpakuto espada) {
        // Llamamos al constructor del padre (Shinigami)
        super(nombre, edad, origen, espada);

        // Calculamos porcentaje hollow: valor aleatorio entre 10 y 50
        // Rango de 41 valores (50-10+1=41), base 10
        this.porcentajeHollow = (int)(Math.random() * 41) + 10;

        // Porcentaje quincy: 50 menos el valor de hollow
        this.porcentajeQuincy = 50 - this.porcentajeHollow;
    }

    // Getter del porcentaje hollow: lo necesita Sustituto en invocarBankai()
    public double getPorcentajeHollow() {
        return porcentajeHollow;
    }
}
