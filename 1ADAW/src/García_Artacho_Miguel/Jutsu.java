package García_Artacho_Miguel;

public class Jutsu {

    private String nombre;
    private String rango;
    int cantConsume;
    private String tipo;

    public Jutsu(String nombre, String rango, int cantConsume, String tipo) {
        this.nombre = nombre;
        if (rango.equals("A") || rango.equals("B") || rango.equals("C") || rango.equals("D") || rango.equals("F")) {
            this.rango = rango;
        } else {
            this.rango = "F";
        }
        if (tipo.equals("Fuego") || tipo.equals("Agua") || tipo.equals("Tierra") || tipo.equals("Viento")) {
            this.tipo = tipo;
        } else {
            this.tipo = "Viento";
        }
        this.cantConsume = cantConsume;
    }

    public Jutsu(String nombre, int cantConsume) {
        this.nombre = nombre;
        if (rango.equals("A") || rango.equals("B") || rango.equals("C") || rango.equals("D") || rango.equals("F")) {
            this.rango = rango;
        } else {
            this.rango = "F";
        }
        if (tipo.equals("Fuego") || tipo.equals("Agua") || tipo.equals("Tierra") || tipo.equals("Viento")) {
            this.tipo = tipo;
        } else {
            this.tipo = "Viento";
        }
        this.cantConsume = cantConsume;
    }

    @Override
    public String toString() {
        return "Jutsu: " + nombre + " rango: " + rango + ", tipo: " + tipo
                + "\nConsume " + cantConsume + " puntos de poder.";
    }

}
