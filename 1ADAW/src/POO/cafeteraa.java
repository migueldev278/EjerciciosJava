
package POO;


public class cafeteraa {

    public static void main(String[] args) {
        cafetera temu = new cafetera();
        temu.llenarcafetera();
        for(int i=0;i<7;i++){
            temu.servirtaza(10);
        }
        temu.vaciarcafetera();
        temu.servirtaza(10);
        
        for (int i = 0; i < 10; i++) {
            int ale=(int)(Math.random()*91+10);
            System.out.println("Meto "+ale+" cc de cafe en la cafetera");
            temu.echarcafe(ale);
        }
        
    }
    
}
