
package EjHerencia;


public class Operario extends Empleado{

    private int CodEmp;
    
    public Operario(String nombre, int codEmp) {
        super(nombre);
        this.CodEmp = codEmp;
    }

    public void setCodEmp(int CodEmp) {
        this.CodEmp = CodEmp;
    }

    public int getCodEmp() {
        return CodEmp;
    }
    
    

    @Override
    public String toString() {
        return "Soy el operario " + this.getNombre() + " con el codigo " + this.CodEmp ;
    }

    
    
}
