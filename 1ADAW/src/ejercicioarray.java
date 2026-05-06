import java.lang.invoke.SerializedLambda;
import java.util.Scanner;

public class ejercicioarray {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
        boolean[][] luces=new boolean[8][8];
    
         
        
        
        
        for (int i = 0; i < luces.length; i++) {
            for (int j = 0; j < luces[j].length; j++) {
                int ale=(int)(Math.random()*2);
                luces[i][j]=false;
                if (ale==1) {
                    luces[i][j]=true;
                }
            }
        }       
        
        String salida="";
        
        for (int i=0;i<luces.length;i++){
            for (int j = 0; j < luces[j].length; j++) {
                switch (luces[i][j]) {
                    case true: 
                        salida+="*";
                        break;
                    default:
                        salida+=".";
                }
            }
            salida+="\n";
        }
      
        System.out.println(salida);           
        
        //ejercicio 60
        
        int [][] ej60= new int [5][5];
        int contador=0;
        
        for (int i = 0; i < ej60.length; i++) {
            for (int j = 0; j < ej60[i].length; j++) {
                 contador++;
                 ej60[i][j]=contador;
            }
        }
        for (int i = 0; i < ej60.length; i++) {
            for (int j = 0; j < ej60[i].length; j++) {
                System.out.println(ej60[i][j]+"");
            }
            System.out.println("");
        }
    
        //ejercicio 61
        
        int [][] ej61=new int [10][10];
        
        for (int i = 0; i < ej61.length; i++) {
            for (int j = 0; j < ej61[i].length; j++) {
                ej61[i][j]=(i+1)*(j+1);
            }         
        }
        for (int i = 0; i < ej61.length; i++) {
            for (int j = 0; j < ej61[i].length; j++) {
                System.out.println(ej61[i][j]+"");
            }
        }      
        
        //ejercicio 62
        
        System.out.println("Dame el número de filas: ");
        int n=teclado.nextInt();
        
        System.out.println("Dame el número de columnas: ");
        int m=teclado.nextInt();
        
        int [][] ej62=new int [n][m];
        
        int mayor=0;
        int menor=0;
        int igual=0;
        
        for (int i = 0; i < ej62.length; i++) {
            for (int j = 0; j < ej61[i].length; j++) {
                
            }
        }
        
        //ej 63 
        
        int [][] listado = new int [3][3];
        int mayor1=Integer.MIN_VALUE;
        String listadomayores="";
        String mayorprimer="";
        
        for (int i = 0; i < listado.length; i++) {
            for (int j = 0; j < listado[i].length; j++) {
                System.out.println("Dame un número para la celda"+"("+i+","+j+")");
                listado[i][j]=teclado.nextInt();
                if (listado[i][j]>mayor1) {
                    mayor1=listado[i][j];
                    mayorprimer="("+i+","+j+")";
                    listadomayores=mayorprimer;
                }else if (listado[i][j]== mayor1) {
                            listadomayores=listadomayores+"("+i+","+j+")";
    }                
                }
                System.out.println("");
            }
        
        //ej 64
        
        int [][] matriz= new int [4][4];
        matriz[4][4]=(int)(Math.random()*10);
        int mayor64=Integer.MIN_VALUE;
        int suma64=0;
        int media64=0;
        
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i]>mayor64) {
                mayor=matriz[i][i];
            }
                suma64+=matriz[i][i];
            }                
        
        System.out.println("El mayor es: "+mayor64);
        media64=suma64/matriz.length;
        System.out.println("La medoa es: "+media64);
        
        
        //ej 65
        
        int [][] matriz65={{2,4,1,3},{4,2,4,1},{1,4,2,4},{3,1,4,2}};
        
        boolean simetricafila= true;
        boolean simetricapos= true;
        
        for (int i = 0; i < matriz65.length; i++) {
            for (int j = 0; j < matriz65[i].length; j++) {
                if (simetricafila!=false&&matriz65.length==matriz65[i].length) {
                    simetricafila=true;
                }else{
                      simetricafila=false;
                }                
            }
        }
        for (int i = 0; i < matriz65.length; i++) {
            for (int j = 0; j < matriz65[i].length; j++) {
                if (simetricapos!=false&&matriz65[i][i]==matriz65[i][j]) {
                    simetricapos=true;
                    }
                else{
                    simetricapos=false;
                }
                }
            }
        if (simetricapos&&simetricafila) {
            System.out.println("Es simétrica");
        }else{
            System.out.println("No es simétrica");
        }
        
        
        //ej 66
        
        System.out.println("Jugador 1: Piedra (0), Papel (1), Tijera (-1): ");
        int res=teclado.nextInt();
        
        System.out.println("Jugador 2: Piedra (0), Papel (1), Tijera (-1): ");
        int res2=teclado.nextInt();
        
        if (res<-1||res>1||res2<-1||res2>1) {
            System.out.println("Número incorrecto");
        }
        
        else if (res==res2) {
            
        }
        else if (res==0&&res2==-1) {
            System.out.println("Piedra gana a tijeras. Gana el Jugador 1");
        }
        else if (res==1&&res2==0) {            
            System.out.println("Papel gana piedra. Gana el jugador 1");
        }
        else if (res==-1&&res2==1) { 
            System.out.println("Tijeras gana papel. Gana el jugador 1");
        }
        else {
            System.out.println("Gana el Jugador 2");
        }
        }
        
        }   
    

        
        
        
    
    

