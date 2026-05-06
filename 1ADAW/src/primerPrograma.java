import java.util.Scanner;

public class primerPrograma {
    public static void main(String[] args) {        
            Scanner teclado = new Scanner(System.in);
           int num1;
           int num2;
           System.out.println("Dime un numero");
           num1 = teclado.nextInt(); 
           System.out.println("Dime un numero");
           num2 = teclado.nextInt();
           int suma = num1 + num2;
           int resta = num1 - num2;
           int multi = num1 * num2;
           int cociente = num1 / num2;
           System.out.println("La suma de " + num1 + "y " + num2 + "es: " + suma);
           System.out.println("La suma de " + num1 + "y " + num2 + "es: " + resta);
           System.out.println("La suma de " + num1 + "y " + num2 + "es: " + multi);
           System.out.println("La suma de " + num1 + "y " + num2 + "es: " + cociente);
           
          
           
           
           
                
         System.out.println("vaya lio de asignatura y viva la programacion");
         
         System.out.println("Dame un número mayor que 100: ");
            int monedero=teclado.nextInt();

        do {            
                      
            System.out.println("Tienes en el monedero: "+monedero);
            System.out.println("¿Cuanto quieres apostar de tu monedero?");
            int apuesta=teclado.nextInt();
           
            int numUsu=(int)(Math.random()*6)+1;
            int numMaq=(int)(Math.random()*6)+1;
            
            if (monedero<100) {
                System.out.println("Error");
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
