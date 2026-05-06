
package Herencia;

public class test1 {

    public static void main(String[] args) {
        
        Empleado pepe = new Empleado(2, "Amparo", 23,"456481681H", 1.68);
        
        System.out.println(pepe.nombre);
        System.out.println(pepe.edad);
        System.out.println(pepe.getDni());
        pepe.hablar();
        
    }
    
}
