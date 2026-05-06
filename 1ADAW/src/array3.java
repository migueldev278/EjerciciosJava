import java.util.Scanner;

public class array3 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Dado un array de enteros lamdo "pepe" Devolver otro array que solo 
    // tenga los números pares de "pepe" y los muestras en horizontal, separado 
    // por comas.
    
        int [] pepe= {1,5,6,8,15,42,46,10};
        int contpar=0;
        
 
        int indice=0;
        int [] otro= new int[contpar];
        for(int i=0;i<pepe.length;i++){
            if (pepe[i]%2==0) {
                otro[indice]=pepe[i];
                indice++;
            }
        }

        // Dado un array de números enteros decir si ese array es especial o no.
        // Un array es especial si todos los cajones impares tiene un numero 
        // impar y en todos los cajones pares, tiene números pares.
        
        int [] array = {4,7,4,13};
        
        int contadorimpar=0;
        int contadorpar=0;
        
        for(int i = 0;i<array.length;i++){
            
        }
        
        
        
        
        
        
        
        
        

    }
    
}
