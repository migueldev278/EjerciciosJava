
import java.util.Scanner;

public class operacionesstring {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Ejercicio 1
        System.out.println("Introduce una palabra: ");
        String palabra = teclado.next();

        System.out.println(palabra.length());
        System.out.println(palabra.charAt(0));
        System.out.println();

        //Ejercicio 2
        System.out.println("Introduce una frase: ");
        String frase2 = teclado.next();

        System.out.println("Introduce una palabra: ");
        String palabra2 = teclado.next();

        if (frase2.contains(palabra2)) {
            System.out.println("Si contiene la plabra");
        }else{
            System.out.println("No contiene la palabra");
        }
        
        //Ejercicio 3
        
        System.out.println("Introduce una frase: ");
        String frase3 = teclado.next();
        
        System.out.println("Introduce un caracter");
        char caracter = teclado.next().charAt(0);
        
        System.out.println(frase2.replace(caracter, caracter));
        
        //Ejercicio 4
        
        System.out.println("Introduce una frase: ");
        String frase4 = teclado.next();
        
        System.out.println(frase4.substring(0,5));
        
        int numcaracter= frase4.length();
        
        System.out.println(frase4.substring(numcaracter-3));
        
        //Ejercicio 5
        
        System.out.println("Introduce una frase: ");
        String frase5 = teclado.next();
        
        String [] palabras = frase5.split("");
        
        System.out.println(palabras);
        
        //Ejercicio 6
        
        
        
        //Ejercicio 7
        
        
        
        //Ejercicio 8
        
        
        
        
        
        
        
    }

}
