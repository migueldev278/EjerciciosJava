package POO.delos;

/**
 * Clase Main - Prueba de la clase Alumno
 * APARTADO F: Pruebas de funcionalidad
 */

public class alumnoo {
    public static void main(String[] args) {
        System.out.println("=== PRÁCTICA DE PROGRAMACIÓN ORIENTADA A OBJETOS ===");
        System.out.println("=== CLASE ALUMNO ===\n");

        // 2. Crea un objeto Alumno llamado a1 usando el constructor completo
        System.out.println("--- 2. Creación de Alumno a1 (Constructor completo) ---");
        Alumno a1 = new Alumno("Laura", 20, 7.5, 4);
        System.out.println("Alumno a1 creado.");

        // 3. Asigna las siguientes asignaturas al alumno a1
        System.out.println("--- 3. Asignación de asignaturas a a1 ---");
        a1.asignarAsignatura(0, "Programación");
        a1.asignarAsignatura(1, "Bases de Datos");
        a1.asignarAsignatura(2, "Entornos de Desarrollo");
        a1.asignarAsignatura(3, "Lenguajes de Marcas");
        System.out.println("Asignaturas asignadas a a1.");

        // 4. Crea un segundo objeto Alumno llamado a2 usando el constructor sobrecargado
        System.out.println("\n--- 4. Creación de Alumno a2 (Constructor sobrecargado) ---");
        Alumno a2 = new Alumno("Carlos", 18, 3);
        System.out.println("Alumno a2 creado.");

        // 5. Asigna las siguientes asignaturas al alumno a2
        System.out.println("--- 5. Asignación de asignaturas a a2 ---");
        a2.asignarAsignatura(0, "Programación");
        a2.asignarAsignatura(1, "Sistemas Informáticos");
        // Prueba de asignación en posición libre (debería ir a la posición 2)
        a2.asignarAsignatura("Redes"); 
        System.out.println("Asignaturas asignadas a a2.");

        // 6. Modifica la nota media del alumno a2 y asígnale el valor 6.2
        System.out.println("--- 6. Modificación de nota media de a2 ---");
        a2.setNotaMedia(6.2);
        System.out.println("Nota media de a2 cambiada a " + a2.getNotaMedia());
        // Prueba de validación de nota media
        a2.setNotaMedia(15.0); 
        System.out.println("Nota media de a2 después de intento inválido: " + a2.getNotaMedia());

        // 7. Crea un tercer alumno llamado a3 que sea una copia independiente de a1.
        System.out.println("\n--- 7. Creación de Alumno a3 (Constructor de copia de a1) ---");
        Alumno a3 = new Alumno(a1);
        System.out.println("Alumno a3 creado como copia de a1.");

        // 8. Una vez creado a3, cambia únicamente la asignatura de la posición 1 por "Acceso a Datos".
        System.out.println("--- 8. Modificación de asignatura en a3 ---");
        a3.asignarAsignatura(1, "Acceso a Datos");
        System.out.println("Asignatura en posición 1 de a3 cambiada a 'Acceso a Datos'.");

        // 9. Muestra por pantalla la información de los tres alumnos (a1, a2 y a3) usando el método toString().
        System.out.println("\n=== 9. INFORMACIÓN FINAL DE LOS TRES ALUMNOS ===\n");
        
        System.out.println("--- Alumno a1 (Laura) ---");
        System.out.println(a1);
        System.out.println("\n------------------------------------------------\n");

        System.out.println("--- Alumno a2 (Carlos) ---");
        System.out.println(a2);
        System.out.println("\n------------------------------------------------\n");

        System.out.println("--- Alumno a3 (Copia de a1 modificada) ---");
        System.out.println(a3);
        System.out.println("\n------------------------------------------------\n");
        
        // Prueba de borrado de asignatura en a2
        System.out.println("--- Prueba de borrado de asignatura en a2 ---");
        System.out.println("Borrar 'Programación' de a2: " + a2.borrarAsignatura("Programación"));
        System.out.println("a2 después de borrar 'Programación':\n" + a2);
    }
}
