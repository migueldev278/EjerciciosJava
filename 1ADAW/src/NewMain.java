import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
      
        System.out.println("Dime un numero: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Dime otro numero: ");
        int num2 = teclado.nextInt();
        
        if(num2>0){
            num1=num2;
              }
        System.out.println("num1");
        
        //Ej 14
        
        System.out.println("Dame los seg: ");
        int seg = teclado.nextInt();
        int min=(seg/60)+1;
        System.out.println("Han pasado: "+min+"minutos");
        
// Explicación de if...else        
       if ((4>5)&&(4<10)){
          int edad = 4+5;
           System.out.println("¡¡He crecido de golpe!!");
           System.out.println("Tengo: "+edad+"años");
 
       }
       else{
          int edad = 4-5;//edad=-5;
           System.out.println("Ha rejuvenecido");
           System.out.println("Tengo: "+edad+"años");

       }

       // Ejercicio A)
        int res;

        System.out.println("Dame un numero: ");
        int num3=teclado.nextInt();
        
        System.out.println("Dame otro numero: ");
        int num4=teclado.nextInt();
        
        if (num4!=0) {
            res=num3/num4;
                    }
        else{
            res=0; 
        }
        System.out.println("Este es el resultado: "+res);
        
        //Ej B)
        
        System.out.println("Dame un numero: ");
        int num5=teclado.nextInt();
        
        System.out.println("Dame un segundo numero: ");
        int num6=teclado.nextInt();

        if (num5<num6){
            System.out.println("Este es el numero menor"+num5);}
        else{
            System.out.println("Este es el numero menor"+num6);
        }
        
        //Ej C)
        
        System.out.println("Dime el primer numero: ");
        int num7 = teclado.nextInt();
        
        System.out.println("Dime el segundo numero: ");
        int num8= teclado.nextInt();
        
        System.out.println("1. calcular suma");
        System.out.println("2. calcular resta");
        System.out.println("3. calcular division");
        System.out.println("4. calcular resto");
        
        int opc = teclado.nextInt();
        
        if (opc==1){
            System.out.println("La suma es: "+(num7+num8));
        }
        else if(opc==2){
            System.out.println("La resta es: "+(num7-num8));
        }
        else if(opc==3){
            System.out.println("La division es: "+(num7/num8));
        }
    
            System.out.println("Dame un numero: ");
            int num9=teclado.nextInt();
            
            System.out.println("Dame un segundo numero: ");
            int num10=teclado.nextInt();
            
            System.out.println("Dame un tercer numero");
            int num11=teclado.nextInt();
            
            double mayor;
            
            if ((num9>=num10)&& (num9>=num11)){
               mayor= num9;
            }
            else if((num10>=num9)&&(num10>=num11)){
                mayor=num10;
            }
            else {
                mayor=num3;
            }
            
            System.out.println("El mayor es: "+mayor);
             
            
            
             

            
                
    }
}
        
        


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
