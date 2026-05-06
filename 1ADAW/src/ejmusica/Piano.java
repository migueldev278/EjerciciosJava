package ejmusica;


public class Piano extends InstrumentoCuerda {

    // Numero de teclas entre 49 y 88
    private int numTeclas;
    // Tipo: "pared", "cola" o "electrico"
    private String tipoPiano;

    // Constructor con partitura
    public Piano(String marca, int mes, int anio, Partitura partitura, int numTeclas, String tipoPiano) {
        // El piano es de cuerdas percutidas (cuerdaPercutida = true)
        // Las cuerdas del piano son iguales al numero de teclas
        super(marca, mes, anio, partitura, numTeclas, true);
        this.numTeclas = numTeclas;
        this.tipoPiano = tipoPiano;
    }

    // Constructor sin partitura
    public Piano(String marca, int mes, int anio, int numTeclas, String tipoPiano) {
        super(marca, mes, anio, numTeclas, true);
        this.numTeclas = numTeclas;
        this.tipoPiano = tipoPiano;
    }

    // afinar: tensa las clavijas de cada tecla
    public void afinar() {
        System.out.println("Se han tensado correctamente las " + numTeclas + " del piano");
    }

    // tocarPartitura(): traduce cada nota al sonido del piano y la repite segun su duracion
    public String tocarPartitura() {
        // Si esta roto no puede tocar
        if (roto) {
            return "El piano está roto y no puede tocar";
        }

        tocando = true;
        String resultado = "";
        Nota[] notas = partitura.getNotas();

        int i = 0;
        while (i < partitura.numNotas()) {
            // Obtenemos el sonido de la nota
            String sonido = getSonidoPiano(notas[i].getValor());

            // Repetimos el sonido tantas veces como indica la duracion
            int j = 0;
            while (j < notas[i].getDuracion()) {
                resultado = resultado + sonido + " ";
                j++;
            }
            i++;
        }
        return resultado;
    }

    // getSonidoPiano(): devuelve el sonido del piano para cada nota
    private String getSonidoPiano(String nota) {
        switch (nota) {
            case "do":
                return "ton";
            case "re":
                return "ten";
            case "mi":
                return "tin";
            case "fa":
                return "tan";
            case "sol":
                return "tun";
            case "la":
                return "tean";
            case "si":
                return "tain";
            default:
                return "?";
        }
    }
}
