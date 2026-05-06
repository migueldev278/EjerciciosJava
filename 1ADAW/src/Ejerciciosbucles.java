import java.time.temporal.TemporalField;
import java.util.Scanner;
public class Ejerciciosbucles {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
    
       //ej1
       
        System.out.println("Dame un numero mayor que 1: ");
       int num=teclado.nextInt();
       
        while (num<=1) {
            System.out.println("El número debe ser mayor que 1");
            System.out.println("Dame otro número");
            num=teclado.nextInt();
        }
       
       int sum=1;
       int sum2=0;
       while (sum<=num){
           sum2=sum2+sum;
           sum++;
       }
        System.out.println("La suma de todos los numeros entre 1 y "+num+" es: "+sum2);
        
       //ej 2
       
        System.out.println("Dime un número: ");
       int num1=teclado.nextInt();
       
       int res=0;
       int sum3=0;
       
       while (num1!=0){
           res++;
           sum3=sum3+num1;
           System.out.println("Dame otro número: ");
           num1=teclado.nextInt();       
       }
       
        System.out.println("La suma es: "+sum3);
        System.out.println("Se han metido un total de: "+res);
       
        
        //ej 1 gmail y contraseña.
        
       int intentos=0;
        System.out.println("Dame un gmail: ");
        String gmail= teclado.next();
        
        System.out.println("Dame una contraseña: ");
        String cont=teclado.next();
        
        while ((!"pakitasalas@gmail.com".equals(gmail))||(!"Uno123abc".equals(cont))) {            
            System.out.println("Error");
            System.out.println("Vuelve a intentar gmail: ");
            gmail=teclado.next();
            System.out.println("Vuelve a intentar contraseña: ");
            cont=teclado.next();
            intentos++;
                 
        }
         System.out.println("Bienvenido");
        
        //ej 27 
        
        System.out.println("Mete número de 4 cifras: ");
        int pooc=teclado.nextInt();
        
        int c=pooc%10;
        int aux=pooc/10;
        int oo=aux%100;
        int p=aux/100;
        
        if ((pooc<1000)||(pooc>9999)){
                System.out.println("Error: No es POOC.");
        }
        else{
            
            System.out.println("Porfa introduce su nickname: ");
        String nick=teclado.nextLine();
        
        System.out.println("Porfa introduce su gmail: ");
        String gmail1=teclado.next();       
        System.out.println("Porfa introduce su contraseña: ");
        String contra=teclado.next();
        
        if ((!"pakitasalas@gmail.com".equals(gmail))&&(!"Uno123abc".equals(cont))) {
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
       
       
    }
    
}
