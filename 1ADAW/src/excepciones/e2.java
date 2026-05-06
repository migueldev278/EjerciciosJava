package Excepciones;

import java.util.Scanner;

public class e2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam = -1;
        int lista[];
        int suma=0;
        
        System.out.print("Introduce tamaño (positivo): ");
        tam = entrada.nextInt();
        
        lista = new int[tam];
        
        for (int i = 0; i <= lista.length; i++) {
            lista[i] = (int)(Math.random()*3);
        }
        

        for(int i=0; i< lista.length; i++){
            suma += (lista[i]/lista[i-1]);
        }   
    }
}
