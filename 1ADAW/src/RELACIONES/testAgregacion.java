
package RELACIONES;

public class testAgregacion {

    public static void main(String[] args) {

        portatil pc = new portatil ("HP", "X555NM");
        pc.usarPortatil();
        alumno migue = new alumno("Don Miguel", 23, "79345615G", pc);
        alumno pepe = new alumno("Don Pepe", 15, "79347215G", pc);
        migue.tocarPortatil();
        
        migue.asignarPortatil(pc);
        
        System.out.println(pc);
        System.out.println(migue);
    }
    
}
