package ejmusica;


public class Flauta extends InstrumentoViento {

    // "travesera" o "dulce"
    private String tipoFlauta;
    // "plastico", "madera" o "metal"
    private String tipoLengueta;

    // Constructor con partitura
    public Flauta(String marca, int mes, int anio, Partitura partitura, String tipoFlauta, String tipoLengueta) {
        // La flauta es de madera
        super(marca, mes, anio, partitura, "madera");
        this.tipoFlauta = tipoFlauta;
        this.tipoLengueta = tipoLengueta;
    }

    // Constructor sin partitura
    public Flauta(String marca, int mes, int anio, String tipoFlauta, String tipoLengueta) {
        super(marca, mes, anio, "madera");
        this.tipoFlauta = tipoFlauta;
        this.tipoLengueta = tipoLengueta;
    }

    // cambiarLengueta(): cambia el tipo de lengueta de la flauta
    public void cambiarLengueta(String nuevoTipo) {
        this.tipoLengueta = nuevoTipo;
    }

    // afinar: introduce la baqueta y verifica la marca
    public void afinar() {
        System.out.println("Se ha usado una baqueta para afinar correctamente la flauta " + tipoFlauta + " con lengüeta de " + tipoLengueta);
    }

    // tocarPartitura(): traduce cada nota al sonido de la flauta seguido de asteriscos
    public String tocarPartitura() {
        // Si esta rota no puede tocar
        if (roto) {
            return "La flauta está rota y no puede tocar";
        }

        tocando = true;
        String resultado = "";
        Nota[] notas = partitura.getNotas();

        int i = 0;
        while (i < partitura.numNotas()) {
            // Obtenemos el sonido de la nota
            String sonido = getSonidoFlauta(notas[i].getValor());

            // Añadimos tantos asteriscos como indica la duracion
            String asteriscos = "";
            int j = 0;
            while (j < notas[i].getDuracion()) {
                asteriscos = asteriscos + "*";
                j++;
            }

            resultado = resultado + sonido + asteriscos + " ";
            i++;
        }
        return resultado;
    }

    // getSonidoFlauta(): devuelve el sonido de la flauta para cada nota
    private String getSonidoFlauta(String nota) {
        if (nota.equals("do")) {
            return "flo";
        } else if (nota.equals("re")) {
            return "fle";
        } else if (nota.equals("mi")) {
            return "fli";
        } else if (nota.equals("fa")) {
            return "fla";
        } else if (nota.equals("sol")) {
            return "flon";
        } else if (nota.equals("la")) {
            return "flan";
        } else if (nota.equals("si")) {
            return "flin";
        } else {
            return "?";
        }
    }
}
