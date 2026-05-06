package Garcia_Artacho_Miguel;

import java.util.*;

public class LibroTexto {

    private String nombre;
    private String autor;
    private int numPag;
    private boolean reciclado; //False: materiales no reciclado / True: materiales reciclados
    private double coste;

    //Creo este array list para guardar los libros que vamos a añadir en el apartado F, método para agregarLibro.
    //Lo voy a inicializar en el constructor.
    protected List<String> bliblioteca;

    public LibroTexto(String nombre, String autor, boolean reciclado, double coste) {
        this.nombre = nombre;
        this.autor = autor;
        this.numPag = (int) Math.random() * (200 - 100 + 1) + 100;
        this.reciclado = reciclado;
        this.coste = coste;
        this.bliblioteca = new ArrayList<>(10);

    }

    public int reducirCoste(int num) {
        int numPagReducir = 0;
        if (num > this.numPag || num < this.numPag) {
            numPagReducir = (int) Math.random() * (this.numPag - num + 1) + num;
        }
        numPagReducir *= 0.65;
        return numPagReducir;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public boolean isReciclado() {
        return reciclado;
    }

    public double getCoste() {
        return coste;
    }

    @Override
    public String toString() {
        String resultado;

        if (reciclado) {
            resultado = this.nombre + "" + this.autor + "" + this.numPag + " páginas \n"
                    + "Es reciclado";
        } else {
            resultado = this.nombre + "" + this.autor + "" + this.numPag + " páginas \n"
                    + "No es reciclado";
        }

        return resultado;
    }

}
