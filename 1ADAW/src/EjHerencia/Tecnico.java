package EjHerencia;


public class Tecnico extends Operario{

    public Tecnico(String nombre, int codEmp) {
        super(nombre, codEmp);
    }
    
    @Override
    public String toString() {
        return "Soy el tecnico " + this.getNombre() + " con el codigo " + this.getCodEmp() ;
    }
    
    
}
