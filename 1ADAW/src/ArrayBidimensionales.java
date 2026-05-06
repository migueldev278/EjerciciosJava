import java.util.Scanner;

public class ArrayBidimensionales {

    private static int n;

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    //Ejercicio 1
    
    int [] [] ej1= new int [3] [3];
    
    for( int i= 0;i<ej1.length;i++){
        for( int k= 0;k<ej1.length;k++){
            do {                
                System.out.println("Dame un número postivo1: ");
                ej1[i][k]=teclado.nextInt();
            } while (ej1[i][k]>0);
        }
    }
        
        
    // Ejercicio 2
    
        do {            
            System.out.println("Dame un número positivo2: ");
            int n = teclado.nextInt();
        } while (n<0);
        
        int [] [] ej2= new int [n] [n];
        
        for(int i=0;i<ej2.length;i++){
            System.out.println(ej2[i][i]);
        }
        
        
        
        
        
        
        
    }
    
}
