import java.util.Scanner;
        
public class Condicionales {

    
    public static void main(String[] args) {
        
        // Ej 21 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dame un año: ");
        int anio = teclado.nextInt();
        
        if (anio/4==0)&&((anio/100!=0)||(anio/400==0){
        System.out.println("Es bisiesto");
    }
        else {
                System.out.println("No es bisiesto");
                }
        
        //Ej 
        int mayor=6;
        int menor=1;
        
        int dado1=(int)(Math.random()*(mayor-menor+1)+menor);
        System.out.println(nombre1+"ha sacado"+dado1);
                
        int dado2=(int)(Math.random()*(mayor-menor+1)+menor);
        System.out.println(nombre2+"ha sacado:"+dado2);
        
        if (dado1>dado2) {
            System.out.println("ha ganado");
        }
        else if (dado1==dado2) {
            
        }
        
        //ej 25 Realiza un programa que indique si un numero introducido por teclado es de 5 cifras y además es par.
        
        int num=teclado.nextInt();
        
        if ((num/2==0)&&(num>9999)&&(num<10000)) {
            System.err.println("OK");
        }
        else {
            System.out.println("No ok");
        }

        //ej 22
        System.out.println("Dame un numero: ");
        int num5 = teclado.nextInt();
        
        System.out.println("Dame un año: ");
        int año =teclado.nextInt();
        
        if ((num5==1)&&(num5==3)&&(num5==5)&&(num5==7)){
            System.out.println("Tiene 31 dias");
        
    }
    
}
