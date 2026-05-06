package García_Artacho_Miguel;

public class Ninja {

    private String nombre;
    private String clan;
    private int chackra;
    private int edad;

    Jutsu[] jutsuAlmacenados;

    public Ninja(String nombre, String clan, int chackra, int edad) {
        this.nombre = nombre;
        this.clan = clan;
        this.chackra = chackra;
        this.edad = edad;
        this.jutsuAlmacenados = new Jutsu[10];
    }

    public Ninja(String nombre, String clan, int chackra, int edad, Jutsu[] jutsuAlmacenados) {
        this.nombre = nombre;
        this.clan = clan;
        this.chackra = chackra;
        this.edad = edad;
        this.jutsuAlmacenados = new Jutsu[10];
        if (jutsuAlmacenados[1] == null) {
            this.jutsuAlmacenados = jutsuAlmacenados;
        }
    }

    public boolean aprenderJutsu(Jutsu nuevo) {
        for (int i = 0; i < jutsuAlmacenados.length; i++) {
            if (jutsuAlmacenados[i] == null) {
                jutsuAlmacenados[i] = nuevo;
                return true;
            }
        }
        return false;
    }

    public void realizarJutsu(int num) {

    }

    public Jutsu mostrarJutsu() {
        for (int i = 0; i < jutsuAlmacenados.length; i++) {
            if (jutsuAlmacenados[i] != null) {
                System.out.println(jutsuAlmacenados[i]);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return nombre + " perteneciente al clan " + clan
                + "\n Edad: " + edad
                + "\n chackra: " + chackra
                + "\n Jutsu que conoce: " + mostrarJutsu();
    }

}
