import java.util.Scanner;
public class MATRICES {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
    //Poner dos digitos en cada celda, en este ejercicio se añade el 0 delnte 
    //del numero que solo tenga un número
    
        int [][] minion ={{2,3,12},{11,11,1},{5,15,4}};
        String res="";
        
        for (int i = 0; i < minion.length; i++) {
            for (int j = 0; j < minion[i].length; j++) {
                if (minion[i][j]>=0&&minion[i][j]<10) {
                    res+=0;
                } 
                res+=minion[i][j]+"";               
            }
            res+="\n";
        }
        
        System.out.println(res);
        
        
        
        
    }
    
}
