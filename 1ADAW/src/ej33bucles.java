import java.util.Scanner;
public class ej33bucles {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            
 //33. Realizar un programa que calcule el resultado de elevar un número a otro. 
 //Para ello, leerá dos números enteros, la base y el exponente, y calculará el 
 //resultado, mostrándolo en pantalla. La idea es hacer este ejercicio con 
 //bucles, es decir, no se pueden utilizar las funciones que te calculen 
 //automáticamente el resultado como, por ejemplo, la función Math.pow()
        
 int base;
 int exponente;
 int resultado=1;
 
        System.out.println("Introduce una base: ");
        base=teclado.nextInt();
        System.out.println("Introduce un exponente: ");
        exponente=teclado.nextInt();
        
        for(int i=1;i<=exponente;i++)
        {
            resultado=resultado*base;
        }
        System.out.println("Resultado de elevar"+base+"a"+exponente+"es"+resultado);
        
//34. Crea un programa que muestre todos los múltiplos de 6 entre 6 y 200, 
//ambos inclusive.

for (int i=6;i<200;i+=6){
    System.out.println(i);
}
    
//35. Implementa un programa que solicite al usuario dos números: n y m. 
//A continuación debe mostrar todos los múltiplos de n, entre n y m*n. Ejemplo:
//Introduce primer número: 4
//Introduce segundo número: 10
//Los múltiplos de 4 entre 4 y 40 son: 8,12,16,20,24,28,32,36,40

int num1;
int num2;

        System.out.println("Dame un número: ");
        num1=teclado.nextInt();
        System.out.println("Dame otro número: ");
        num2=teclado.nextInt();
        
        
for ( int i=num1;i<=num1*num2;i++){
    if(i%num1==0){
        System.out.println(i);
    }
    
}

/*
38. Queremos realizar un algoritmo que vaya pidiendo una sucesión de notas por
teclado hasta que se introduzca el valor -1. Tras eso se mostrará la media 
aritmética de las notas introducidas. Importante: Hay que controlar que los 
valores de las notasintroducidas sea el correcto (entre 0 y 10)
b) Realiza una variante del ejercicio anterior donde el primer valor que se 
solicita indica el número total de calificaciones que se deben introducir.
*/


        
        
// b)         
        
        
        
        
        
        
/*
39. Diseña un algoritmo que calcule el factorial de un número pedido por 
teclado.
El factorial de un numero es la multiplicación desde el 1 hasta ese número. 
Pej 5! = 1*2*3*4*5 = 120
Ejemplo de ejecución:
Dame un número: 5
El factorial de 5 es 120
*/      
        int num3;
        System.out.println("Dame un número");       
        num2=teclado.nextInt();
        int fact=1;
        
        for(int i=1;i<=num2;i++){
            fact=(fact*1);
        }
        
        System.out.println("El factorial es " +fact);
        
        
/*
37. Escribe un algoritmo que pida una lista de números enteros uno a uno 
hasta que se introduzca el valor 0. A continuación debe escribir por pantalla 
la posición de la primera y de la última aparición del número 12 dentro de la 
lista. Ejemplo:
            */       
        
        int num4=0;
        int ultimap=0;
        int primerap=0;
        int contador=0;        
        
        do {            
            System.out.println("Dame número (0 para salir)");
            num4=teclado.nextInt();
            contador++;
            if(num1==12){
                ultimap=contador;
            }
            if(num4==12&&primerap==0){
                primerap=contador;
            }
            
            
        } while (num4!=0);
        
        
        /*
    46.. Bucles
        */
        
        
        
/*
   Ejercicio apuestas
        1. Pido un numero mayor a 100 al ususario si no es mayor que 100 se 
        vuelve a pedir. Esto será el monedero.
        2. Mientras el usuario quiera seguir apostando y tenga dinero en el monedero.
        - El usuario indica cuanto quiere gastar como máximo lo que tiene el 
        monedero. Si se pasa de ese valor, hay que volver a pedirlo
        - Se tira un dado de 6 para el usuaario
        - Se tira dos dado de 6 para la máquina
        - Si el usuario gana->gana el lo apostado (incrementamos el monedero)
        - Si el usuario pierde->pierde lo apostado(se lo bajamos del monedero)
        - Si empatan, no se hara nada
        - Muestro por pantalla lo que queda en el monedero.
        */
            System.out.println("Dame un número mayor que 100: ");
            int monedero=teclado.nextInt();

        do {            
                      
            System.out.println("Tienes en el monedero: "+monedero);
            System.out.println("¿Cuanto quieres apostar de tu monedero?");
            int apuesta=teclado.nextInt();
           
            int numUsu=(int)(Math.random()*6)+1;
            int numMaq=(int)(Math.random()*6)+1;
            
            if (apuesta<monedero) {
                
            }
            else if (numUsu>numMaq) {
                System.out.println("Has ganado: "+apuesta);
                monedero+=apuesta;
            }
            else if (numUsu<numMaq) {
                System.out.println("Has perdido: "+apuesta);
                monedero-=apuesta;
            }
            else if (numUsu==numMaq) {
                System.out.println("Has empatado, no pierdes ni ganas.");
            }
                
                
        } while (monedero>0);
        
        
        














    
        
        
        
        
        
        
        
        
        }
    
}
