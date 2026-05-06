package POO.delos;

public class urna {

    private int nblancas;
    private int nnegras;

    public urna(int nb, int nn) {
        this.nblancas = nb;
        this.nnegras = nn;
    }

    public int totalbolas() {
        return this.nblancas + this.nnegras;
    }

    public char extraer() {
        int total = this.totalbolas();
        int ale = (int) (Math.random() * total + 1);

        if (ale <= this.nblancas) {
            this.nblancas--;
            return 'b';
        } else {
            this.nnegras--;
            return 'n';
        }
    }

    public void introducir(char color) {
        if (color == 'b' || color == 'B') {
            this.nblancas++;
        } else {
            this.nnegras++;
        }
    }

}
