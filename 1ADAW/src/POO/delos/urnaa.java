
package POO.delos;

public class urnaa {

    public static void main(String[] args) {
        
        int aleb = (int)(Math.random()*10+1);
        int alen = (int)(Math.random()*10+1);       
        
        urna caja = new urna(aleb, alen);
        System.out.println("Urna creada con "+aleb+" blancas y "+alen+" negras");
        
        while (caja.totalbolas() > 1) {            
            char bola1 = caja.extraer();
            char bola2 = caja.extraer();
            
            if (bola1 == bola2) {
                caja.introducir('b');
                System.out.println("Se mete una bola blanca...");
            }else{
                caja.introducir('i');
                System.out.println("Se mete una bola negra...");
            }
        }
        char ultima = caja.extraer();
        System.out.println("La ultima bola es: "+ultima);
    }
    
}
