package POO.delos;

/**
 * Clase Main - Prueba de la clase Libro
 * APARTADO F: Pruebas de funcionalidad
 */

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== PRÁCTICA DE PROGRAMACIÓN ORIENTADA A OBJETOS ===");
        System.out.println("=== CLASE LIBRO ===\n");

        // 1. Crear un objeto Libro usando el constructor completo
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 863, 25.50, false);
        System.out.println("--- Libro 1 (Constructor completo) ---");
        System.out.println(libro1);
        System.out.println();

        // 2. Crear otro objeto usando el constructor sobrecargado
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);
        System.out.println("--- Libro 2 (Constructor sobrecargado) ---");
        System.out.println(libro2);
        System.out.println();

        // 3. Crear un tercer objeto usando el constructor de copia
        Libro libro3 = new Libro(libro1);
        System.out.println("--- Libro 3 (Constructor de copia - copia de Libro 1) ---");
        System.out.println(libro3);
        System.out.println();

        // 4. Cambiar el precio de uno de los libros usando un SET
        System.out.println("--- Modificando el precio del Libro 2 ---");
        libro2.setPrecio(18.99);
        System.out.println("Nuevo precio del Libro 2: " + libro2.getPrecio() + " €");
        System.out.println();

        // 5. Prestar uno de los libros
        System.out.println("--- Prestando el Libro 1 ---");
        libro1.prestar();
        System.out.println("Libro 1 ha sido prestado.");
        System.out.println();

        // 6. Mostrar por pantalla la información de los tres libros usando toString()
        System.out.println("=== INFORMACIÓN FINAL DE TODOS LOS LIBROS ===\n");
        
        System.out.println("--- Libro 1 ---");
        System.out.println(libro1);
        System.out.println();

        System.out.println("--- Libro 2 ---");
        System.out.println(libro2);
        System.out.println();

        System.out.println("--- Libro 3 ---");
        System.out.println(libro3);
        System.out.println();

        // Prueba adicional: intentar establecer un precio negativo
        System.out.println("=== PRUEBA ADICIONAL: Validación de precio negativo ===");
        libro2.setPrecio(-5.0);
        System.out.println("Precio del Libro 2 después de intentar asignar -5.0: " + libro2.getPrecio() + " €");
    }
}
