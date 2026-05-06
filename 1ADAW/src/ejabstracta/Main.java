package ejabstracta;

public class Main {
    public static void main(String[] args) {

        // Creamos espadas para cada shinigami
        Zanpakuto espada1 = new Zanpakuto("Zangetsu", "cortadora", "negro");
        Zanpakuto espada2 = new Zanpakuto("Senbonzakura", "dispersora", "rosa");
        Zanpakuto espada3 = new Zanpakuto("Wabisuke", "encadenadora", "gris");

        // Creamos un sustituto, un teniente y un capitan
        Sustituto ichigo = new Sustituto("Ichigo", 17, "Karakura", espada1, "Karakura Town");
        Teniente renji = new Teniente("Renji", 200, "Rukongai", espada2, 6);
        Capitan byakuya = new Capitan("Byakuya", 500, "Seireitei", espada3, 6);

        // Mostramos los datos de cada uno
        System.out.println("=== SHINIGAMIS ===");
        System.out.println(ichigo.toString());
        System.out.println();
        System.out.println(renji.toString());
        System.out.println();
        System.out.println(byakuya.toString());
        System.out.println();

        // Probamos shunpo del puro
        renji.shunpo();
        byakuya.shunpo();
        System.out.println();

        // Probamos vigilar del sustituto
        ichigo.vigilar();
        System.out.println();

        // Probamos invocarBankai
        System.out.println("=== BANKAIS ===");
        renji.invocarBankai();   // no puede, solo muestra mensaje
        ichigo.invocarBankai();  // sustituto invoca bankai
        byakuya.invocarBankai(); // capitan invoca bankai
        System.out.println();

        // Probamos pelear: ichigo (sustituto) pelea contra renji (teniente)
        System.out.println("=== PELEA ===");
        System.out.println("Vida de Renji antes: " + renji.getVida());
        ichigo.pelear(renji);
        System.out.println("Vida de Renji despues: " + renji.getVida());
    }
}
