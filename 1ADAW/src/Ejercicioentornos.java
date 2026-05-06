import java.util.Scanner;

public class Ejercicioentornos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("¿Cual es tu equipo favorito?");
        String equipo= teclado.next();
        
        System.out.println("¿Cual es tu jugador favorito?");
        String jugador= teclado.next();
        
        System.out.println("¿Cual es tu equipo de selección favorita?");
        String seleccion= teclado.next();
        
        System.out.println("¿Cual es tu entrenador favorito?");
        String entrenador= teclado.next();
        
        System.out.println("¿Cual es tu portero favorito?");
        String portero= teclado.next();
        
        System.out.println(equipo);
        System.out.println(jugador);
        System.out.println(seleccion);
        System.out.println(entrenador);
        System.out.println(portero);
        
        
    }
    
}
