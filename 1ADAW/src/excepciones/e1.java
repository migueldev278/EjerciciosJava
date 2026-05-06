package excepciones;

import java.util.*;

public class e1 {

    public static void main(String[] args) {

        double res = 0;

        //E!
        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        boolean valido = false;

        // Pedimos el primer número en bucle hasta que sea válido
        while (!valido) {
            System.out.print("Introduce el primer número: ");
            try {
                num1 = entrada.nextInt(); // Intentamos convertir a entero
                valido = true; // Si llega aquí, es que no hubo error
            } catch (NumberFormatException e) {
                System.out.println("Error: eso no es un número entero. Inténtalo de nuevo.");
            }
        }

        valido = false; // Reseteamos para el segundo número

        // Pedimos el primer número en bucle hasta que sea válido
        while (!valido) {
            System.out.print("Introduce el primer número: ");
            try {
                num2 = entrada.nextInt(); // Intentamos convertir a entero
                valido = true; // Si llega aquí, es que no hubo error
            } catch (NumberFormatException e) {
                System.out.println("Error: eso no es un número entero. Inténtalo de nuevo.");
            }
        }

        System.out.println("Primer numero: " + num1);
        System.out.println("Segundo numero: " + num2);

        
            
        /*try {
            System.out.println("Introduce numerador: ");
        int nume = entrada.nextInt();
        System.out.println("Introduce denominador: ");
        int deno = entrada.nextInt();
        res = nume/deno;
        } catch (ArithmeticException fallo1) {
            System.out.println("Division por cero: "+fallo1.getMessage());
        } 
        catch (InputMismatchException fallo2){
            System.out.println("Mete numeros, MANDRIIL!!!" +fallo2.toString());
        }
        finally{
            System.out.println("Esto sale siempre, vaya por donde vaya");
        }
        
        System.out.println("Resultado: " +res);
         */
    }

}
