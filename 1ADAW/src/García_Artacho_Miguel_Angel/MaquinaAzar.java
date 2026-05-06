package García_Artacho_Miguel_Angel;

public class MaquinaAzar {

    int rizquierda;
    int rcentro;
    int rderecha;
    double peso;
    double altura;
    double largo;
    double cantDinero;

    public MaquinaAzar(double peso, double altura, double largo) {
        this.rizquierda = (int) (Math.random() * 9) + 1;
        this.rcentro = (int) (Math.random() * 9) + 1;
        this.rderecha = (int) (Math.random() * 9) + 1;
        this.peso = peso;
        this.altura = altura;
        this.largo = largo;
        this.cantDinero = 10000.0;
    }

    public void jugar() {
        this.cantDinero += 25.0;
        this.rizquierda = (int) (Math.random() * 9 - 1) + 1;
        this.rcentro = (int) (Math.random() * 9 - 1) + 1;
        this.rderecha = (int) (Math.random() * 9 - 1) + 1;
        System.out.println("La jugada ha sido: " + rizquierda + ", " + rcentro + ", " + rderecha);
        int premio = 0;
        if (rizquierda == rcentro && rizquierda == rderecha && rcentro == rderecha) {
            premio = 100 * rcentro;
            this.cantDinero -= 100 * rcentro;
            System.out.println("Has ganado " + premio);
        } else if (rizquierda == rcentro || rizquierda == rderecha || rcentro == rderecha) {
            premio += 25;
            this.cantDinero -= 25;
            System.out.println(premio);
        }
    }
}
