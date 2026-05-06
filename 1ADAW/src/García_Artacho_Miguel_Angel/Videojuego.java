package García_Artacho_Miguel_Angel;

import java.util.*;

public class Videojuego {

    private String titulo;
    private int añolanzamiento;
    private double puntuacion;

    List<String> sistema = new ArrayList<>();

    public Videojuego(String titulo, int añolanzamiento, double puntuacion, String sistema) {
        this.titulo = titulo;
        this.añolanzamiento = añolanzamiento;
        if (puntuacion >= 0.0 && puntuacion <= 100.0) {
            this.puntuacion = puntuacion;
        } else {
            this.puntuacion = 50.0;
        }
        this.sistema.add(sistema);
    }

    public Videojuego(String titulo, int añolanzamiento) {
        this.titulo = titulo;
        this.añolanzamiento = añolanzamiento;
        this.puntuacion = 0.0;
        this.sistema.add("PC");
    }

    public Videojuego(Videojuego otroVideojuego) {
        this.titulo = otroVideojuego.titulo;
        this.añolanzamiento = otroVideojuego.añolanzamiento;
        this.puntuacion = otroVideojuego.puntuacion;
    }

    public int calcularAntiguedad(int anio) {
        int antiguedad = 0;
        if (anio > this.añolanzamiento) {
            antiguedad += anio - añolanzamiento;
            System.out.println(antiguedad + "años");
        }
        return antiguedad;
    }

    public void actualizarPuntuacion(double nueva) {
        if (nueva >= 0.0 && nueva <= 100.0) {
            this.puntuacion = nueva;
        }
    }

    public boolean aniadirSistema(String nuevo) {
        sistema.add(nuevo);
        return true;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String mostrarLista() {
        System.out.println("VIDEO GAME"
                + "\n ----------"
                + "\n Titulo: " + titulo + " AÑO: " + añolanzamiento
                + "\n Puntuacion: " + puntuacion
                + "\n Sistemas para los que sale: ");
        for (int i = 0; i < sistema.size(); i++) {
            System.out.println("   " + sistema.get(i));
        }
        return "";

    }

    @Override
    public String toString() {
        return mostrarLista();
    }

}
