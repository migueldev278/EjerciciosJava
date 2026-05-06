
package POO;

import java.util.*;

public class arbol {
    
    String nombre;
    double altura;
    int edad;
    private String[] colores = {"verde claro", "verde oscuros", "marrones"};
    //Relacion
    hoja hojas[]; //Array de hojas

    public arbol(String nombre, double altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.hojas = new hoja[edad];
    }

    public void brotar(int total){
        this.hojas = new hoja[total];
        for (int i = 0; i < total; i++) {
            int ale = (int) (Math.random()*this.colores.length);
            String color = colores[ale];
            this.hojas[i] = new hoja("verde", (int)(Math.random()*5+1), (int)(Math.random()*5+1), (int)(Math.random()*1+0.02));
        }
    }
    
    private String mostrarHojas(){
        String res="";
        for (int i = 0; i < this.hojas.length; i++) {
            res+= this.hojas[i]+"\n";
        }
        return res;
    }
    
    @Override
    public String toString() {
        return "arbol{" + "nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", hojas=" + mostrarHojas() + '}';
    }
    
    
    
    
}
