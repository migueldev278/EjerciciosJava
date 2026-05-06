package ej97;

public class Profesor {

    private String nombre;
    protected Asignatura[] asignaturas;
    protected int horasTotales;
    protected boolean dandoClase;

    public Profesor(String nombre, int totalAsignaturas) {
        this.nombre = nombre;
        this.dandoClase = false;

        asignaturas = new Asignatura[totalAsignaturas];

        int cantidad = (int) (Math.random() * totalAsignaturas) + 1;

        for (int i = 0; i < cantidad; i++) {
            int codigo = (int) (Math.random() * 101) + 100;
            int horas = (int) (Math.random() * 6) + 3;
            asignaturas[i] = new Asignatura(codigo, horas);
        }

        int suma = 0;
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] != null) {
                suma += asignaturas[i].horas;
            }
        }
        horasTotales = suma;
    }

    public String getNombre() {
        return nombre;
    }

    public void empezarClase() {
        if (dandoClase) {
            System.out.println(nombre + " ya está dando clase.");
            return;
        }

        int indice;
        do {
            indice = (int) (Math.random() * asignaturas.length);
        } while (asignaturas[indice] == null);

        dandoClase = true;
        System.out.println(nombre + " está dando clase de " + asignaturas[indice].codigo + ".");
    }

    public void parar() {
        if (!dandoClase) {
            System.out.println(nombre + " no está dando clase.");
            return;
        }
        dandoClase = false;
        System.out.println(nombre + " ha finalizado de dar clase.");
    }

    @Override
    public String toString() {
        String texto = "Profesor: " + nombre + "\n";
        texto += "Horas totales: " + horasTotales + "\n";
        texto += "Dando clase: " + dandoClase + "\n";
        texto += "Asignaturas:\n";
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] != null) {
                texto += "  " + asignaturas[i] + "\n";
            }
        }
        return texto;
    }
}
