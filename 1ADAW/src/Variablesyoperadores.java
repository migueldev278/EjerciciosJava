import java.util.Scanner;
public class Variablesyoperadores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1 = teclado.nextInt();
        System.out.println("Dime otro numero");
        int num2 = teclado.nextInt();
        
        System.out.println("num / num2 * (num1-num2");
        
        //Ejercicio Quiero el resto de: (3203/m-n)elevado n/(n elevado 2*m al cubo
        
        System.out.println("Dame primer número: ");
        int num3= teclado.nextInt();
        
        System.out.println("Dame segundo numero");
        int num4 = teclado.nextInt();
        
        double parte11=num3-num4;
        double parte21=3203/parte11;
        double parte1=Math.pow(parte21, num4);
        double parte2=Math.pow(num2, 2)*Math.pow(num1, 3);
        double res= parte1%parte2;
        
        System.out.println(res);
        
        //Ejercicio 8 Crea un algoritmo que simule el lanzamiento de un dado de
        //N caras. El número de caras del dado se solicitará por teclado.
        
        int resu = (int)(Math.random()*6-1+1)+1;
        System.out.println("Ha salido un: "+resu);
        
        //Ejercicio Diseña un algoritmo que pida por teclado un tiempo 
        //expresado en segundos ymuestre por pantalla ese valor expresado en 
        //horas, minutos y segundos.
        
        
        //Pido al usuario el num del segundo (SegTotales)
        int SegTotales;
        int horas;
        int min;
        int seg;
        System.out.println("Introduce el tiempo e segundos");
        SegTotales=teclado.nextInt();
        horas=SegTotales/3600;
        seg=SegTotales%3600;
        min=seg/60;
        seg= seg%60;
        System.out.println("Son"+horas+"horas, "+min+"minutos y "+seg+"segundos.");
        
        //Ejercicio 9:Crea un algoritmo que sirva para resolver ecuaciones de primer grado del tipo:
        //primer grado del tipo: ax+b=0
        
        double resul=(-b/a);
        System.out.println("La X vale: "+resul);
        
        
       // Ejercicio 13
       
       
        
        
        
        
        
        
        
    }
    
}
