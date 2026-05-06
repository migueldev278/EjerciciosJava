import java.util.Scanner;
public class Exámen {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
    //ej1
    
        System.out.println("Dame un número: ");
        int cifra=teclado.nextInt();
        int suma=0;
        int contador=1;
        String lista="";
        
        while(cifra!=0){
            System.out.println("Dame otro número: ");
            cifra=teclado.nextInt();
            suma= suma+cifra;
            contador++;
            lista=lista+cifra;
            
                    }
        System.out.println(suma);
        System.out.println("Media: "+(suma/contador));
        System.out.println("lista");
       
    
        //Como pedir un caracter aleatorio: char opcion=teclado.next().chartAt(0);
  
    
    
    //ej2
    
    
   
        int num3;
        int totalEntradas = 0;

        do {
            System.out.println("1. Comprar entrada.");
            System.out.println("2. Mostrar total de entradas vendidas");
            System.out.println("3. Salir del programa");
            System.out.print("Elige una opcion (1-3): ");

            num3 = teclado.nextInt();

            switch (num3) {
                case 1:
                    System.out.print("Introduce tu edad: ");
                    int edad1 = teclado.nextInt();

                    if (edad1 < 5) {
                        System.out.println("Entrada gratuita.");
                    } else if (edad1 >= 5 && edad1 <= 15) {
                        System.out.println("Precio de la entrada: 5 euros.");
                    } else if (edad1 >= 16 && edad1 <= 60) {
                        System.out.println("Precio de la entrada: 10 euros.");
                    } else {
                        System.out.println("Entrada gratuita.");
                    }

                    totalEntradas++;
                    break;

                case 2:
                    System.out.println("Total de entradas vendidas: " + totalEntradas);
                    break;

                case 3:
                    System.out.println("Se cerro el programa.");
                    break;

                default:
                    System.out.println("Error, introduce un numero del 1 al 3: .");
            }
        } while (num3 != 3);

      
        
        // Para decir que tiene que dar un numero par
        
        
        
        
        
        
        
        //Pido dos numero positivos: ini y fin a)Muestro la suma de todos los 
        //números entre ini y fin b)igual que a pero solo los pares.
        
        int ini;
        int fin;
        
        do{
            System.out.println("Dame un num positivo: ");
            ini = teclado.nextInt();
            
        }while (ini<=0);    
        
        do{
            System.out.println("Dame otro: ");
            fin=teclado.nextInt();
            
        }while (fin<=0); 
        
        if(fin<ini){
            int aux=fin;
            fin=ini;
            ini=aux;
              
        int sumap=0;
        int suma1=0;
        int i;
        
        for(i=ini;i<fin;ini++){
            suma+=1;
            if(i%2==0){
            sumap+=1;
            }
        
        
        //Pido numero entero positivo. Muestro la tablas de multiplicar de ese
        //numero (del 1 al 10) asi:
        
        int num4=0;
        
        do{
            System.out.println("Dame tu alma: ");
            num3=teclado.nextInt();
            
        }while (num4<=0);
        
        for(int ia=1;i<=10;i++){
            System.out.println(num4+"X"+ia+"= "+(num4*ia));
                       
            }
        
        //Tablas de multiplicar
        
        int num5;
        int mult;
        
            do {                                  
            System.out.println("Dame un numero positivo: ");
            num5=teclado.nextInt();
            
            }while (num5<=0); 
            for (int i1=1;i1<=10;i1++){                
                mult=num5*i;
                System.out.println("num");
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
}
            
            
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
