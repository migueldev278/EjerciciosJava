import java.util.Scanner;
public class acrtividad {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1 = sc2.nextInt();
        System.out.println("Dime otro numero");
        int num2 = sc2.nextInt();
        System.out.println("Dime otro numero");
        int num3 = sc2.nextInt();
        System.out.println("Dime otro numero");
        int num4 = sc2.nextInt();
        System.out.println("Dime otro numero");
        int num5 = sc2.nextInt();
        int med =(num1 + num2 + num3 + num4 + num5)/5;
        System.out.println("La media es:" +med);
        sc2.close();
        
        
        
        
        
        
        
        
        
    }
    
}
