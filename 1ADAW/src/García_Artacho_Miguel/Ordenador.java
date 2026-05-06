package García_Artacho_Miguel;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {

    String marca;
    String modelo;
    int valorAlea = (int) Math.random() * 125 + 15;

    List<String> componentes = new ArrayList<>();

    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = new ArrayList<>();
        
    }

    public Ordenador(String marca, String modelo, int num) {
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = new ArrayList<>();
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                System.out.println("Nombre: Desconocido"
                        + "\n Tipo: "
                        + "\n Consumo: " + valorAlea);
                        i++;
            }

        }
    }
    
    
    public void mostrarComponentes(){
        
    }

    @Override
    public String toString() {
        return  marca + " - " + modelo + "\n Componentes: "  ;
    }

    

}
