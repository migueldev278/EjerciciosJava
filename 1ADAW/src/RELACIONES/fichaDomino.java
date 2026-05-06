package RELACIONES;

public class fichaDomino {

    int lado1I;
    int lado1D;

    int guardarPosición;

    public fichaDomino(int lado1I, int lado1D) {
        this.lado1I = (int) (Math.random() * 6 - 1);
        this.lado1D = (int) (Math.random() * 6 - 1);
    }

    public boolean encaja(int lado2I, int lado2D) {
        if (lado1D == lado2D || lado1D == lado2I || lado1I == lado2D || lado1I == lado2I) {
            return true;
        } else {
            return false;
        }
    }

    public void voltear() {
        guardarPosición = lado1D;
        lado1D = lado1I;
        lado1I = lado1D;
    }

    @Override
    public String toString() {
        return "[ " + lado1I + " - " + lado1D + " ] ";
    }

}
