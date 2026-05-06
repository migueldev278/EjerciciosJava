
package ej94;

public class Main {
    public static void main(String[] args) {

        // Dos perros
        Perro p1 = new Perro("Labrador", "Pepe");
        Perro p2 = new Perro("Bulldog", "Lola");
       

        System.out.println(p1);
        System.out.println(p1.comunicarse());
        p1.dormir();
        p1.jugar();

        System.out.println(p2);
        

        System.out.println("---");

        // Dos gatos
        Gato g1 = new Gato("Egipcio", "Luna");
        Gato g2 = new Gato("Siames", "Yami");
        g2.setPelaje("largo");

        System.out.println(g1);
        System.out.println(g1.comunicarse());
        g1.dormir();
        g1.cazar();

        System.out.println(g2);
        System.out.println("Pelaje: " + g2.getPelaje());
    }
}