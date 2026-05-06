
package EjHerencia;


public class Oficial extends Operario {

    public Oficial(String nombre, int CodEmp) {
        super(nombre,CodEmp);
    }
    
    @Override
    public String toString() {
        return "Soy el operario " + this.getNombre() + " con el codigo " + this.getCodEmp();
    }
    
}
