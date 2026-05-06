
package POO;
import java.util.Scanner;

public class primerprograma {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Heroe manolo = new Heroe("Super Miguel",29,false,1.74);
        
        manolo.nombre="patxo";
        System.out.println(manolo.nombre);
        System.out.println(manolo.altura);
        System.out.println(manolo.edad);
        System.out.println(manolo.vuela);
        
        manolo.volar();
        
        Heroe samu = new Heroe("Lesly Queen",22,true,1.68);
        System.out.println();
        System.out.println(samu.nombre);
        System.out.println(samu.altura);
        System.out.println(samu.edad);
        System.out.println(samu.vuela);
        
        
        //1. a)
        Heroe lampA = new Heroe("Blanco","Xiaomi Mi LED",1,12.2);
        System.out.println();
        lampA.encender();
        lampA.mostrarinfo();
        
        //1. b)
        System.out.println("Introduce el color de la lampara: ");
        String color1= teclado.nextLine();
        
        System.out.println("Introduce el modelo de la lampara: ");
        String modelo1= teclado.nextLine();
                
        System.out.println("Introduce el numero de bombillas de la lampara: ");
        int bombillas= teclado.nextInt();
                
        System.out.println("Introduce la potencia de la lampara: ");
        double potencia= teclado.nextDouble();
                
        //Creo la lampara
        Heroe lampB = new Heroe(color1, modelo1, bombillas, potencia);
        
        lampB.mostrarinfo();
        
        
        
        
    }
    
}
