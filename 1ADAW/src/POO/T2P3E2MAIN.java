package POO;

import java.util.*;

public class T2P3E2MAIN {

    public static void main(String[] args) {

        T2P3E2CLASS biblioteca = new T2P3E2CLASS("Biblioteca Davante con Bogavante");

        biblioteca.setaniadirLibro("La riada");
        biblioteca.setaniadirLibro("El Dique");
        biblioteca.setaniadirLibro("La Casa");
        biblioteca.setaniadirLibro("La Guerra");
        biblioteca.setaniadirLibro("La Fortuna");
        biblioteca.setaniadirLibro("La Lluvia");

        System.out.println("");

        biblioteca.getmostrarLibros(3);

        System.out.println("");

        biblioteca.setbuscarLibro("Dagon");
        biblioteca.setbuscarLibro("La Fortuna");

        char pica = '\u2660'; // ♠
        char corazon = '\u2665'; // ♥
        char trebol = '\u2663'; // ♣
        char diamante = '\u2666'; // ♦

        System.out.println(pica);
        
    }

}
