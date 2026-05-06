import POO.delos.Alumno;

public class chatgpt2 {

    public static void main(String[] args) {
        
         // 2. Creamos a1 con el constructor COMPLETO
        Alumno a1 = new Alumno("Laura", 20, 7.5, 4);

        // 3. Asignamos asignaturas a a1
        a1.asignarAsignatura(0, "Programación");
        a1.asignarAsignatura(1, "Bases de Datos");
        a1.asignarAsignatura(2, "Entornos de Desarrollo");
        a1.asignarAsignatura(3, "Lenguajes de Marcas");

        // 4. Creamos a2 con el constructor SOBRECARGADO
        Alumno a2 = new Alumno("Carlos", 18, 3);

        // 5. Asignamos asignaturas a a2
        a2.asignarAsignatura(0, "Programación");
        a2.asignarAsignatura(1, "Sistemas Informáticos");

        // 6. Cambiamos la nota media de a2
        a2.setNotaMedia(6.2);

        // 7. Creamos a3 como COPIA de a1
        Alumno a3 = new Alumno(a1);

        // 8. Cambiamos la posición 1 de a3 (sin tocar a1)
        // Primero borramos la que había ("Bases de Datos") y luego ponemos la nueva
        a3.borrarAsignatura(1);
        a3.asignarAsignatura(1, "Acceso a Datos");

        // 9. Mostramos los tres alumnos
        System.out.println("══════════ ALUMNO 1 ══════════");
        System.out.println(a1);

        System.out.println("══════════ ALUMNO 2 ══════════");
        System.out.println(a2);

        System.out.println("══════════ ALUMNO 3 ══════════");
        System.out.println(a3);
    }

}
