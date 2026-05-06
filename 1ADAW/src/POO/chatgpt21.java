package POO;

public class chatgpt21 {
    // ══════════════════════════════════════════════════════════════
// CLASE ALUMNO
// ══════════════════════════════════════════════════════════════

    class Alumno {

        // ── APARTADO A: Atributos privados ────────────────────────
        private String nombre;
        private int edad;
        private double notaMedia;
        private String[] asignaturas;   // array de texto

        // ── APARTADO B: Constructores ─────────────────────────────
        // 1. Constructor COMPLETO: recibe todos los datos
        public Alumno(String nombre, int edad, double notaMedia, int numAsignaturas) {
            this.nombre = nombre;
            this.edad = edad;
            this.notaMedia = notaMedia;

            // Creamos el array con el tamaño indicado
            this.asignaturas = new String[numAsignaturas];

            // Llenamos todas las posiciones con "Sin asignar"
            for (int i = 0; i < asignaturas.length; i++) {
                asignaturas[i] = "Sin asignar";
            }
        }

        // 2. Constructor SOBRECARGADO: sin nota media (se pone 0.0)
        public Alumno(String nombre, int edad, int numAsignaturas) {
            this.nombre = nombre;
            this.edad = edad;
            this.notaMedia = 0.0;   // nota por defecto

            this.asignaturas = new String[numAsignaturas];
            for (int i = 0; i < asignaturas.length; i++) {
                asignaturas[i] = "Sin asignar";
            }
        }

        // 3. Constructor de COPIA: copia todos los datos de otro Alumno
        public Alumno(Alumno otroAlumno) {
            this.nombre = otroAlumno.nombre;
            this.edad = otroAlumno.edad;
            this.notaMedia = otroAlumno.notaMedia;

            // Creamos un array NUEVO del mismo tamaño
            this.asignaturas = new String[otroAlumno.asignaturas.length];

            // Copiamos cada posición una a una (así son independientes)
            for (int i = 0; i < otroAlumno.asignaturas.length; i++) {
                this.asignaturas[i] = otroAlumno.asignaturas[i];
            }
        }

        // ── APARTADO C: Getters y Setters ─────────────────────────
        public String getNombre() {
            return nombre;
        }

        public double getNotaMedia() {
            return notaMedia;
        }

        public String[] getAsignaturas() {
            return asignaturas;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        // Solo acepta notas entre 0 y 10
        public void setNotaMedia(double notaMedia) {
            if (notaMedia >= 0 && notaMedia <= 10) {
                this.notaMedia = notaMedia;
            } else {
                System.out.println("Error: la nota debe estar entre 0 y 10.");
            }
        }

        // ── APARTADO D: Métodos de asignaturas ────────────────────
        // Guarda una asignatura en una posición concreta
        public void asignarAsignatura(int posicion, String nombreAsignatura) {
            // Comprobamos que la posición existe en el array
            if (posicion < 0 || posicion >= asignaturas.length) {
                System.out.println("Error: posición " + posicion + " no válida.");
                return;
            }
            // Comprobamos que la asignatura no esté ya en el array (OPCIONAL)
            if (existeAsignatura(nombreAsignatura)) {
                System.out.println("Error: la asignatura '" + nombreAsignatura + "' ya está asignada.");
                return;
            }
            asignaturas[posicion] = nombreAsignatura;
        }

        // Guarda una asignatura en la primera posición libre que encuentre
        public void asignarAsignatura(String nombreAsignatura) {
            // Comprobamos que no esté repetida (OPCIONAL)
            if (existeAsignatura(nombreAsignatura)) {
                System.out.println("Error: la asignatura '" + nombreAsignatura + "' ya está asignada.");
                return;
            }
            // Buscamos la primera posición con "Sin asignar"
            for (int i = 0; i < asignaturas.length; i++) {
                if (asignaturas[i].equals("Sin asignar")) {
                    asignaturas[i] = nombreAsignatura;
                    return;  // salimos en cuanto encontramos un hueco
                }
            }
            // Si llegamos aquí es que no había huecos
            System.out.println("Error: no hay posiciones libres.");
        }

        // Método auxiliar: comprueba si una asignatura ya existe en el array
        private boolean existeAsignatura(String nombreAsignatura) {
            for (int i = 0; i < asignaturas.length; i++) {
                if (asignaturas[i].equals(nombreAsignatura)) {
                    return true;
                }
            }
            return false;
        }

        // Borra una asignatura por nombre (la pone a "Sin asignar")
        // Devuelve true si la borró, false si no la encontró
        public boolean borrarAsignatura(String nombreAsignatura) {
            for (int i = 0; i < asignaturas.length; i++) {
                if (asignaturas[i].equals(nombreAsignatura)) {
                    asignaturas[i] = "Sin asignar";
                    return true;
                }
            }
            return false;
        }

        // Borra la asignatura de una posición concreta
        // Devuelve true si la borró, false si la posición no era válida
        public boolean borrarAsignatura(int posicion) {
            if (posicion < 0 || posicion >= asignaturas.length) {
                return false;
            }
            asignaturas[posicion] = "Sin asignar";
            return true;
        }

        // Pone todas las posiciones del array a "Sin asignar"
        public void limpiarAsignaturas() {
            for (int i = 0; i < asignaturas.length; i++) {
                asignaturas[i] = "Sin asignar";
            }
        }

        // ── APARTADO E: toString ──────────────────────────────────
        @Override
        public String toString() {
            String texto = "Nombre:     " + nombre + "\n"
                    + "Edad:       " + edad + "\n"
                    + "Nota media: " + notaMedia + "\n"
                    + "Asignaturas:\n";

            // Solo mostramos las que NO sean "Sin asignar"
            for (int i = 0; i < asignaturas.length; i++) {
                if (!asignaturas[i].equals("Sin asignar")) {
                    texto += "  - " + asignaturas[i] + "\n";
                }
            }

            return texto;
        }
    }
}
