package García_Artacho_Miguel_Angel;

public class testVideojuego {

    public static void main(String[] args) {

        Videojuego v1 = new Videojuego("HalfLife", 1998, 97.0, "PC");

        v1.aniadirSistema("PS2");
        v1.aniadirSistema("Android");
        v1.aniadirSistema("DC");

        System.out.println(v1);

        v1.calcularAntiguedad(2026);

        v1.actualizarPuntuacion(120.0);

        Videojuego v2 = new Videojuego("Source", 1998, 77.0, "PC");

        v2.aniadirSistema("PS2");
        v2.aniadirSistema("Android");
        v2.aniadirSistema("DC");
        
        
        
    }

}
