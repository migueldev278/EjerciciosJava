package POO.delos;

/**
 * Clase Alumno - Representa un estudiante con sus datos y asignaturas.
 * Práctica de Programación Orientada a Objetos.
 */

public class Alumno {
    // APARTADO A: Propiedades privadas
    private String nombre;
    private int edad;
    private double notaMedia;
    private String[] asignaturas; // array de nombres de asignaturas
    
    private static final String SIN_ASIGNAR = "Sin asignar";

    // Método auxiliar para inicializar el array de asignaturas (simplificado)
    private void inicializarAsignaturas(int numAsignaturas) {
        this.asignaturas = new String[numAsignaturas];
        // Uso de bucle for en lugar de Arrays.fill
        for (int i = 0; i < this.asignaturas.length; i++) {
            this.asignaturas[i] = SIN_ASIGNAR;
        }
    }

    // APARTADO B: Constructores

    /**
     * 1. Constructor completo
     * @param nombre Nombre del alumno
     * @param edad Edad del alumno
     * @param notaMedia Nota media del alumno
     * @param numAsignaturas Número de asignaturas (tamaño del array)
     */
    public Alumno(String nombre, int edad, double notaMedia, int numAsignaturas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
        inicializarAsignaturas(numAsignaturas);
    }

    /**
     * 2. Constructor sobrecargado
     * @param nombre Nombre del alumno
     * @param edad Edad del alumno
     * @param numAsignaturas Número de asignaturas (tamaño del array)
     */
    public Alumno(String nombre, int edad, int numAsignaturas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = 0.0; // La nota media será 0.0
        inicializarAsignaturas(numAsignaturas);
    }

    /**
     * 3. Constructor de copia
     * @param otro Objeto Alumno a copiar
     */
    public Alumno(Alumno otro) {
        this.nombre = otro.nombre;
        this.edad = otro.edad;
        this.notaMedia = otro.notaMedia;
        // Copia profunda del array de asignaturas (simplificado)
        this.asignaturas = new String[otro.asignaturas.length];
        for (int i = 0; i < otro.asignaturas.length; i++) {
            this.asignaturas[i] = otro.asignaturas[i];
        }
    }

    // APARTADO C: Métodos GET y SET

    /**
     * Método GET de nombre
     * @return El nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método GET de notaMedia
     * @return La nota media del alumno
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * Método GET de asignaturas
     * @return El array de asignaturas
     */
    public String[] getAsignaturas() {
        return asignaturas;
    }

    /**
     * Método SET de edad
     * @param edad La nueva edad del alumno
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método SET de notaMedia
     * Solo se permiten valores entre 0 y 10.
     * @param notaMedia La nueva nota media
     */
    public void setNotaMedia(double notaMedia) {
        if (notaMedia >= 0.0 && notaMedia <= 10.0) {
            this.notaMedia = notaMedia;
        } else {
            System.out.println("Error: La nota media debe estar entre 0 y 10.");
        }
    }

    // APARTADO D: Métodos de gestión de asignaturas

    /**
     * Guarda una asignatura en la posición indicada si la posición es válida.
     * @param posicion Índice del array donde guardar la asignatura
     * @param nombreAsignatura Nombre de la asignatura a guardar
     */
    public void asignarAsignatura(int posicion, String nombreAsignatura) {
        if (posicion >= 0 && posicion < asignaturas.length) {
            asignaturas[posicion] = nombreAsignatura;
        } else {
            System.out.println("Error: Posición de asignatura no válida (" + posicion + ").");
        }
    }

    /**
     * Guarda una asignatura en la primera posición libre que encuentre.
     * @param nombreAsignatura Nombre de la asignatura a guardar
     */
    public void asignarAsignatura(String nombreAsignatura) {
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i].equals(SIN_ASIGNAR)) {
                asignaturas[i] = nombreAsignatura;
                return;
            }
        }
        System.out.println("Error: No hay posiciones libres para asignar la asignatura " + nombreAsignatura + ".");
    }

    /**
     * Elimina la primera aparición de la asignatura (vuelve a poner "Sin asignar").
     * @param nombreAsignatura Nombre de la asignatura a borrar
     * @return true si se eliminó la asignatura, false en caso contrario
     */
    public boolean borrarAsignatura(String nombreAsignatura) {
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i].equals(nombreAsignatura)) {
                asignaturas[i] = SIN_ASIGNAR;
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina la asignatura en la posición indicada (vuelve a poner "Sin asignar").
     * @param posicion Índice del array a borrar
     * @return true si se eliminó la asignatura, false en caso contrario
     */
    public boolean borrarAsignatura(int posicion) {
        if (posicion >= 0 && posicion < asignaturas.length) {
            if (!asignaturas[posicion].equals(SIN_ASIGNAR)) {
                asignaturas[posicion] = SIN_ASIGNAR;
                return true;
            }
        }
        return false;
    }

    /**
     * Vuelve a dejar todas las posiciones del array con el valor "Sin asignar". (simplificado)
     */
    public void limpiarAsignaturas() {
        // Uso de bucle for en lugar de Arrays.fill
        for (int i = 0; i < this.asignaturas.length; i++) {
            this.asignaturas[i] = SIN_ASIGNAR;
        }
    }

    // APARTADO E: Método toString() (simplificado)

    /**
     * Devuelve una representación textual del alumno.
     * @return String con la información del alumno
     */
    @Override
    public String toString() {
        String resultado = "Nombre: " + nombre + "\n";
        resultado += "Edad: " + edad + "\n";
        resultado += "Nota media: " + notaMedia + "\n";
        resultado += "Asignaturas:\n";

        String asignaturasList = "";
        boolean hayAsignaturas = false;

        // Bucle for tradicional para construir la lista de asignaturas
        for (String asignatura : asignaturas) {
            // Filtra los valores "Sin asignar"
            if (!asignatura.equals(SIN_ASIGNAR)) {
                asignaturasList += "- " + asignatura + "\n";
                hayAsignaturas = true;
            }
        }
        
        if (!hayAsignaturas) {
            resultado += "- Ninguna asignada";
        } else {
            // Se elimina el último salto de línea para que el formato sea limpio
            resultado += asignaturasList.substring(0, asignaturasList.length() - 1);
        }
        
        return resultado;
    }
}
