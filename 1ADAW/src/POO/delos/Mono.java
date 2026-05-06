package POO.delos;

public class Mono {

    String raza;
    String lugarNacimiento;
    boolean sexo;
    int edad;

    public Mono(boolean sex, String ln, int age, String race) {
        this.raza = race;
        this.lugarNacimiento = ln;
        this.sexo = sex;
        this.edad = age;
    }

    public Mono(boolean sex) {
        this.raza = "Sin raza";
        this.lugarNacimiento = "Zoologico de Fuengirola";
        this.sexo = sex;
        this.edad = 0;
    }

    public void setraza(String nuevo) {
        if (nuevo.equals("")) {
            this.raza = nuevo;
        }
    }
    
    public String getRaza(){
        return this.raza;
    }

    @Override
    public String toString() {
        return "Mono: " + this.lugarNacimiento + " Edad: " + this.edad + " Raza: " + this.raza;
    }

}
