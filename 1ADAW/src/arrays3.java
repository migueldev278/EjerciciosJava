import java.util.Scanner;
public class arrays3 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
        //Ejercicio 56
         
        
        int[] num = new int[10];
        int maximo = 0; // iniciamos en 0 porque son números naturales (≥0)
        int i;

        System.out.println("Escribe 10 números naturales:");
        for (i = 0; i < 10; i++) {
            num[i] = teclado.nextInt();

            // si es el primer número o si el nuevo número es mayor al actual máximo
            if (i == 0 || num[i] > maximo) {
                maximo = num[i];
            }
        }

        // contar cuántas veces aparece y mostrar posiciones
        int contador = 0;
        System.out.println("El valor máximo es: " + maximo);

        for (i = 0; i < 10; i++) {
            if (num[i] == maximo) {
                contador++;
            }
        }

        System.out.println("Aparece " + contador + " veces.");
     
        // dado un array de números enteros. Calcula la diferencia entre el 
        //mayor y el menos y lo muestras
        
        int [] numeros={5,3,9,15,85,46};
        
        int NumMayor=numeros[0];
        int NumMenor=numeros[0];
        
        for(i=1;i<numeros.length;i++){
            if(numeros[i]<NumMayor){
                NumMayor=numeros[i];
            }else if (numeros[i]<NumMenor) {
                NumMenor=numeros[i];
                }
            }
                System.out.println("El nº mayor es el "+NumMayor);
                System.out.println("El nº menor es el "+NumMenor);
                
                int resta=NumMayor-NumMenor;
                System.out.println("La diferencia es "+resta);
        }
    
    

        
        
        
        
        
        
        }       
    
    

