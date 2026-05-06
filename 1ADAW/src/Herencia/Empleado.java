

package Herencia;


public class Empleado extends Persona{

    private int codEmpleado;
    
    public Empleado(int ce, String nombre, int edad, String dni, double altura){
        //llamar al contructor del padre
        super(nombre, edad, dni, altura);
        
        //relleno con mi codigo
        this.codEmpleado= ce;
    }
    
    public void trabajar(){
        System.out.println(this.nombre+ " ,empleado numero: "+ codEmpleado+ " esta trabajando...");
    }
    
}
