
package POO;

public class estudiante {
    
    String nombre; 
    String apellido;
    int numlist;
    double nota=-1;
    double [] notas;
    //Método constructor
    public estudiante(String nombre,String apellido,int numlist ){
            this.nombre=nombre;
            this.apellido=apellido;
            this.numlist=numlist;
            this.notas = new double [numlist];
            for (int i = 0; i < numlist; i++) {
            notas[i]= nota;
        }
    }
    
    //Métodos
    
    //Método para insertar nota
    
    public void InsertarNota(double nota){
        
        
    }
    
}
