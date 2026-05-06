
package POO.delos;

public class ungaunga {

    public static void main(String[] args) {

        Mono vini = new Mono(false,"Benagalbon",25,"Gorilla");
        Mono samu = new Mono(true); 
        int una = 9;
        int otra;
               
        String res= vini.getRaza() + " de las cuevas de Cobadonga";
        vini.setraza(res);
        System.out.println(vini.getRaza());
        
        
        
    }
    
}
