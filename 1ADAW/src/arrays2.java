import java.util.Scanner;

public class arrays2 {

    public static void main(String[] args) {
              Scanner teclado = new Scanner(System.in);
             
              // ejercicio 1
              
              int [] array=new int [12];
              int suma=0;
              
              
              for(int i=0; i<array.length; i++){
                  array[i]=(int)(Math.random()*(50-5+1)+5);
    }
              for(int i=0;i<array.length;i++){
                  suma+=array[i];
              }
              System.out.println("La suma es "+suma+" y la media es "+(suma/array.length));
              
              //ejercicio 2
              
              int [] cajonera = new int[5];
              int [] otro = new int [5];
              
              for(int i = 0; i<cajonera.length;i++){
                  System.out.println("Dame los valores del cajón "+i+" :");
                  cajonera[i]=teclado.nextInt();
                  otro[i]= cajonera [i];
                  System.out.println(cajonera [i]);
                  System.out.println(otro[i]);
              }
              
              //ejercicio 51
              String multi5="";
              String pares="";
              int [] ej1 = new int [100];
              
              for(int i=0;i<ej1.length;i++){
                  array[i]=(int)(Math.random()*100)+1;
              }
                  
              for(int i=0; i<ej1.length;i++){
                  if(ej1[i]%5==0){
                      multi5= ej1[i]+"";
                  }
              }
              System.out.println(multi5);
 
              for(int i=0;i<ej1.length;i++){
                  if (ej1[1]%2==0) {
                      pares=ej1[1]+"";
                  }
              }
              
              int pos=0;
              int mayor=ej1[0];
              
              for(int i=1;i<ej1.length;i++){
                  if(ej1[1]>mayor){
                      mayor=ej1[1];
                      pos=i;
                  }
              }
              System.out.println(mayor);
              System.out.println(pos);
              
              // Ejercicio 52
            
        String [] color = new String [10];
        
        for(int i=0;i<color.length;i++){
            System.out.println("Dame el color de la celda: "+i+".");
            color[i]=teclado.nextLine();                               
        }
        
        int contadorRojo=0;
        int contadorAzul=0;
        
        for (int i = 0; i < color.length; i++) {
            if (color[i].equals("rojo")) {
                contadorRojo++;
            } else if (color[i].equals("azul")) {
                contadorAzul++;
            }
        }
        System.out.println("El color rojo aparece "+contadorRojo+" veces en el array");        
        System.out.println("El color azul aparece "+contadorAzul+" veces en el array");        

        
        int [] array1= {1,2,3,4,5};
        int [] array2= {1,2,3,4,5};
        
        boolean igual= true;
        
        int i=0;
        
        if(array1.length != array2.length) {
            igual=false;
        }else{
            while (igual&&i<array1.length) {                                
                 if (array1[i] != array2[i]) {
                 igual=false;               
                }
                 i++;
            }
        }
        if (igual) {
            System.out.println("Los arrays son iguales.");
        }else{
            System.out.println("Los arrays no son iguales.");
        }
         
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              

    }
    
}
