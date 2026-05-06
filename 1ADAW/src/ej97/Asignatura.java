package ej97;

public class Asignatura {

    int codigo;
    int horas;

    public Asignatura(int codigo, int horas) {
        this.codigo = codigo;
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Asignatura[codigo=" + codigo + ", horas=" + horas + "]";
    }
}
