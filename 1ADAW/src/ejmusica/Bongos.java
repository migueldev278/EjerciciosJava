package ejmusica;


public class Bongos extends InstrumentoPercusion {

    // Numero de cajas, debe ser mayor a 2
    private int numCajas;
    // "sintetica" o "natural"
    private String tipoPiel;

    // Constructor con partitura
    public Bongos(String marca, int mes, int anio, Partitura partitura, int numCajas, String tipoPiel) {
        // Los bongos usan baquetas (usaBaquetas = true)
        super(marca, mes, anio, partitura, true);

        // Si el numero de cajas no es mayor a 2, ponemos 3 como minimo valido
        if (numCajas > 2) {
            this.numCajas = numCajas;
        } else {
            this.numCajas = 3;
        }
        this.tipoPiel = tipoPiel;
    }

    // Constructor sin partitura
    public Bongos(String marca, int mes, int anio, int numCajas, String tipoPiel) {
        super(marca, mes, anio, true);
        if (numCajas > 2) {
            this.numCajas = numCajas;
        } else {
            this.numCajas = 3;
        }
        this.tipoPiel = tipoPiel;
    }

    // afinar: ajusta los pernos de cada caja (4 pernos por caja)
    public void afinar() {
        System.out.println("Se han ajustado los " + (numCajas * 4) + " pernos de los bongos");
    }

    // tocarPartitura(): traduce cada nota al sonido de los bongos, sin tener en cuenta la duracion
    public String tocarPartitura() {
        // Si estan rotos no pueden tocar
        if (roto) {
            return "Los bongos están rotos y no pueden tocar";
        }

        tocando = true;
        String resultado = "";
        Nota[] notas = partitura.getNotas();

        int i = 0;
        while (i < partitura.numNotas()) {
            // En bongos no hay duracion, solo añadimos el sonido una vez
            resultado = resultado + getSonidoBongos(notas[i].getValor()) + " ";
            i++;
        }
        return resultado;
    }

    // getSonidoBongos(): devuelve el sonido de los bongos para cada nota
    private String getSonidoBongos(String nota) {
        if (nota.equals("do")) {
            return "tom";
        } else if (nota.equals("re")) {
            return "tem";
        } else if (nota.equals("mi")) {
            return "tim";
        } else if (nota.equals("fa")) {
            return "tam";
        } else if (nota.equals("sol")) {
            return "totom";
        } else if (nota.equals("la")) {
            return "tatam";
        } else if (nota.equals("si")) {
            return "tutim";
        } else {
            return "?";
        }
    }
}
