package ej97;


public class ProfesorUniversidad extends Profesor {

    protected boolean puedeInvestigar;
    protected int horasInvestigacion;
    protected boolean investigando;

    public ProfesorUniversidad(String nombre, int totalAsignaturas, int horasInvestigacion) {
        super(nombre, totalAsignaturas);

        this.investigando = false;

        if (horasTotales >= 8) {
            puedeInvestigar = true;
            this.horasInvestigacion = horasInvestigacion;
        } else {
            puedeInvestigar = false;
            this.horasInvestigacion = 0;
        }
    }

    public void investigar() {
        if (!puedeInvestigar) {
            System.out.println(getNombre() + " no puede investigar.");
            return;
        }
        if (dandoClase) {
            System.out.println(getNombre() + " ya está dando clase o investigando.");
            return;
        }
        investigando = true;
        dandoClase = true;
        System.out.println(getNombre() + " está investigando.");
    }

    public void pararInvestigacion() {
        if (!investigando) {
            System.out.println(getNombre() + " no está investigando.");
            return;
        }
        investigando = false;
        dandoClase = false;
        System.out.println(getNombre() + " ha parado de investigar.");
    }

    @Override
    public void parar() {
        if (investigando) {
            pararInvestigacion();
        } else {
            super.parar();
        }
    }

    public void cogerAsignatura(Asignatura nueva) {
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] == null) {
                if (horasTotales + nueva.horas > 25) {
                    System.out.println("No se puede añadir: superaría las 25 horas semanales.");
                    return;
                }
                asignaturas[i] = nueva;

                int suma = 0;
                for (int j = 0; j < asignaturas.length; j++) {
                    if (asignaturas[j] != null) suma += asignaturas[j].horas;
                }
                horasTotales = suma;

                actualizarInvestigacion();
                System.out.println("Asignatura añadida correctamente.");
                return;
            }
        }
        System.out.println("No hay hueco para más asignaturas.");
    }

    public void abandonarAsignatura() {
        for (int i = asignaturas.length - 1; i >= 0; i--) {
            if (asignaturas[i] != null) {
                asignaturas[i] = null;

                int suma = 0;
                for (int j = 0; j < asignaturas.length; j++) {
                    if (asignaturas[j] != null) suma += asignaturas[j].horas;
                }
                horasTotales = suma;

                actualizarInvestigacion();
                System.out.println("Última asignatura eliminada.");
                return;
            }
        }
        System.out.println("No hay asignaturas que eliminar.");
    }

    private void actualizarInvestigacion() {
        if (horasTotales >= 8) {
            if (!puedeInvestigar) {
                puedeInvestigar = true;
                horasInvestigacion = 20;
                System.out.println(getNombre() + " ahora puede investigar (20h/semana).");
            }
        } else {
            if (puedeInvestigar) {
                puedeInvestigar = false;
                horasInvestigacion = 0;
                investigando = false;
                System.out.println(getNombre() + " ya no puede investigar.");
            }
        }
    }

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "Puede investigar: " + puedeInvestigar + "\n";
        texto += "Horas investigación: " + horasInvestigacion + "\n";

        if (investigando) {
            texto += "Estado actual: investigando\n";
        } else if (dandoClase) {
            texto += "Estado actual: dando clase\n";
        } else {
            texto += "Estado actual: inactivo\n";
        }

        return texto;
    }
}

