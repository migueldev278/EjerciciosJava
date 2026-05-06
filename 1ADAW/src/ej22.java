import java.util.Scanner;
import javax.print.attribute.standard.SheetCollate;
import org.w3c.dom.html.HTMLFormElement;
public class ej22 {

    public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  
  int mes = teclado.nextInt();
  int anio = teclado.nextInt();
  
  if (mes==1||mes==3||mes==5||mes==7||mes=8||mes==10||mes==12){
  
      System.out.println(mes+"tiene 31 días");
      
  }
  else if (mes==4||mes==6||mes==9||mes==11){
      System.out.println(mes+"Tiene 30 días");
  }
  else if ((mes==2)){
      System.out.println("Es bisiesto");
  }
  else {
      System.out.println("Mes incorrecto");
  }
      
      //con switch
      
      switch(mes){
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12: System.out.println("31 días");
              break;
              case 4:
              case 6:
              case 9:
              case 11: System.out.println("30 días");
                                   break;
      }
      
      int precio=20;
      
      System.out.println("Dame una edad: ");
      int edad=teclado.nextInt();
      
      if (edad<5){
          System.out.println("No paga");
      }
      else if ((edad>5)&&(edad<12)){
          System.out.println("Tiene que pagar:"+75/100*+precio);
      }
          
      else if ((edad>13)&&(edad<50)){
        System.out.println("No tiene descuento y tiene que pagar:"+precio);
    }
  
      else if ((edad>51)&&(edad<65)){
          System.out.println("Tiene que pagar:"+75/100*+precio);
    }
      else if (edad>65){
        System.out.println("No tiene que pagar");
    }

        System.out.println(precio);
        
      teclado.close();

      
    String nick= "alumno";
    String email= "alumno@gmail.com";
    String cont= "alumno";
      
    if (email=="alumno@gmail.com")&&(cont=="alumno"){
        System.out.println("");
    
    
    
    }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
  
  
  
    }
    
}
