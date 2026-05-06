
package RELACIONES;

public class alumno {
    String nombre;
    int edad;
    String dni;
    portatil laptop;

    public alumno(String nombre, int edad, String dni, portatil p) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.laptop = p;
    }

    public void asignarPortatil(portatil nuevo){
        this.laptop = nuevo;
    } 
          
    public void tocarPortatil(){
        if (this.laptop != null) {
            this.laptop.encendido = true;
            this.laptop.usarPortatil(); 
        }
    }
    
    public void quitarPortatil(){
        this.laptop = null;
    }
    
    public void saludar(alumno alu){
        System.out.println(this.nombre+" saluda a "+alu.nombre);
    }
    
    @Override
    public String toString() {
        return "alumno{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", laptop=" + laptop + '}';
    }
    
    
    
    
}
