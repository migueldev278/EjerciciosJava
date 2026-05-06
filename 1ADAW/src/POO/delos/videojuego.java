package POO.delos;

public class videojuego {

    private String titulo;
    private String consola;
    private double precio;

    double PrecioFinal = 0.0;

    //Constructor completo
    public videojuego(String titulo, String consola, double precio) {
        this.titulo = titulo;
        this.consola = consola;
        this.precio = precio;
    }

    //GET y GET
    public String getConsola() {
        return consola;
    }

    public double getPrecio() {
        return precio;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void calcularPrecioFinal(double IVA, double descuento) {
        PrecioFinal = (precio + precio * IVA / 100) - descuento;
        System.out.println(PrecioFinal);
    }

    @Override
    public String toString() {

        String res = "Consola:" + consola + " Titulo:" + titulo + " Precio:" + precio;

        return res;
    }

}
