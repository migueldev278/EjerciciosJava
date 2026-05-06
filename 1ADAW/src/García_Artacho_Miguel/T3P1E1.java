package García_Artacho_Miguel;

public class T3P1E1 {

    public static void main(String[] args) {

        Ninja n1 = new Ninja("Naruto", "Uzumaki", 80, 11);

        Jutsu j1 = new Jutsu("Fuego", "B", 25, "Viento");

        n1.aprenderJutsu(j1);
        n1.aprenderJutsu(j1);

        System.out.println(n1);

    }

}
