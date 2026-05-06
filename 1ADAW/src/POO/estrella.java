
package POO;

public class estrella {
    
   int posx, posy;
   String forma;
   private final String[] dibujo={"*",".",".","."};
   
   
   public estrella(int x, int y){
       this.posx=x;
       this.posy=y;
       int ale=(int)(Math.random()*this.dibujo.length);
       this.forma=this.dibujo[ale]
   }
    
   
   
}
