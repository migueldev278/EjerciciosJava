package POO;

import java.util.*;

public class T2P3E2CLASS {

    private String nombre;
    /*Voy a utilizar Array.List porque es mutable el tamaño*/

    private List<String> Libros = new ArrayList<>();

    public T2P3E2CLASS(String nombre) {
        this.nombre = nombre;
    }

    //Creo método añadirLibro
    public boolean setaniadirLibro(String libro) {
        Libros.add(libro);
        return true;
    }

    public void getmostrarLibros(int cantidad) {
        this.Libros = Libros;
        for (int i = 0; i < Libros.size(); i++) {
            System.out.println(Libros.get(i));
        }
    }

    public void setbuscarLibro(String titulo){
        System.out.println(Libros.contains(titulo));
    }
    
    
    
}
