
package proyectot1;

import java.util.Scanner;

public class webinars {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
         Scanner teclado = new Scanner(System.in);


        // ══════════════════════════════════════════
        // EJERCICIO 1
        // ══════════════════════════════════════════
        System.out.println("=== EJERCICIO 1 ===");
        System.out.print("Escribe una palabra: ");
        String palabra = teclado.nextLine();

        // .length() nos dice cuántas letras tiene
        int longitud = palabra.length();
        System.out.println("La longitud es: " + longitud);

        // .charAt(0) es la primera letra (las posiciones empiezan en 0)
        char primerCaracter = palabra.charAt(0);
        System.out.println("Primera letra: " + primerCaracter);

        // La última letra está en la posición (longitud - 1)
        char ultimoCaracter = palabra.charAt(longitud - 1);
        System.out.println("Última letra: " + ultimoCaracter);


        // ══════════════════════════════════════════
        // EJERCICIO 2
        // ══════════════════════════════════════════
        System.out.println("\n=== EJERCICIO 2 ===");
        System.out.print("Escribe una frase: ");
        String frase2 = teclado.nextLine();

        System.out.print("Escribe la palabra que quieres buscar: ");
        String palabraBuscar = teclado.nextLine();

        // .contains() devuelve true si la frase contiene la palabra
        if (frase2.contains(palabraBuscar)) {
            System.out.println("SÍ contiene esa palabra.");
        } else {
            System.out.println("NO contiene esa palabra.");
        }


        // ══════════════════════════════════════════
        // EJERCICIO 3
        // ══════════════════════════════════════════
        System.out.println("\n=== EJERCICIO 3 ===");
        System.out.print("Escribe una frase: ");
        String frase3 = teclado.nextLine();

        System.out.print("Escribe el carácter que reemplazará las vocales: ");
        String reemplazo = teclado.nextLine();

        // Reemplazamos cada vocal (mayúscula y minúscula) por el carácter elegido
        frase3 = frase3.replace("a", reemplazo);
        frase3 = frase3.replace("e", reemplazo);
        frase3 = frase3.replace("i", reemplazo);
        frase3 = frase3.replace("o", reemplazo);
        frase3 = frase3.replace("u", reemplazo);
        frase3 = frase3.replace("A", reemplazo);
        frase3 = frase3.replace("E", reemplazo);
        frase3 = frase3.replace("I", reemplazo);
        frase3 = frase3.replace("O", reemplazo);
        frase3 = frase3.replace("U", reemplazo);

        System.out.println("Frase resultado: " + frase3);


        // ══════════════════════════════════════════
        // EJERCICIO 4
        // ══════════════════════════════════════════
        System.out.println("\n=== EJERCICIO 4 ===");
        System.out.print("Escribe una frase: ");
        String frase4 = teclado.nextLine();

        // .substring(inicio, fin) corta la frase desde "inicio" hasta "fin" (sin incluir fin)
        String primeros5 = frase4.substring(0, 5);
        System.out.println("Primeros 5 caracteres: " + primeros5);

        // Para los últimos 3, empezamos desde (longitud - 3) hasta el final
        int longitud4 = frase4.length();
        String ultimos3 = frase4.substring(longitud4 - 3);
        System.out.println("Últimos 3 caracteres: " + ultimos3);


        // ══════════════════════════════════════════
        // EJERCICIO 5
        // ══════════════════════════════════════════
        System.out.println("\n=== EJERCICIO 5 ===");
        System.out.print("Escribe una frase: ");
        String frase5 = teclado.nextLine();

        // .split(" ") separa la frase por espacios y guarda cada palabra en un array
        String[] palabras = frase5.split(" ");
        int numeroDePalabras = palabras.length;
        System.out.println("Número de palabras: " + numeroDePalabras);


        // ══════════════════════════════════════════
        // EJERCICIO 6
        // ══════════════════════════════════════════
        System.out.println("\n=== EJERCICIO 6 ===");
        System.out.print("Escribe una frase: ");
        String frase6 = teclado.nextLine();

        int contadorVocales = 0;

        // Recorremos letra por letra con un bucle for
        for (int i = 0; i < frase6.length(); i++) {
            char letra = frase6.charAt(i);

            // Comprobamos si la letra es una vocal (sin importar mayúsculas)
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                contadorVocales++;
            }
        }

        System.out.println("Número de vocales: " + contadorVocales);


        // ══════════════════════════════════════════
        // EJERCICIO 7
        // ══════════════════════════════════════════
        System.out.println("\n=== EJERCICIO 7 ===");
        System.out.print("Escribe una contraseña: ");
        String contrasena = teclado.nextLine();

        // Condición 1: tiene al menos 8 caracteres
        boolean tieneOchoCaracteres = contrasena.length() >= 8;

        // Condición 2: contiene @ y contiene .
        boolean tieneArroba = contrasena.contains("@");
        boolean tienePunto  = contrasena.contains(".");

        // Condición 3: el punto va DESPUÉS de la arroba
        boolean puntoDetrasDeArroba = contrasena.indexOf(".") > contrasena.indexOf("@");

        // Condición 4: no tiene espacios
        boolean sinEspacios = !contrasena.contains(" ");

        // Solo es válida si cumple TODAS las condiciones
        if (tieneOchoCaracteres && tieneArroba && tienePunto && puntoDetrasDeArroba && sinEspacios) {
            System.out.println("Contraseña VÁLIDA");
        } else {
            System.out.println("Contraseña NO válida");
            if (!tieneOchoCaracteres)    System.out.println("  - Necesita al menos 8 caracteres.");
            if (!tieneArroba)            System.out.println("  - Necesita contener @.");
            if (!tienePunto)             System.out.println("  - Necesita contener un punto.");
            if (!puntoDetrasDeArroba)    System.out.println("  - El punto debe ir después de la @.");
            if (!sinEspacios)            System.out.println("  - No puede tener espacios.");
        }


        // ══════════════════════════════════════════
        // EJERCICIO 8
        // ══════════════════════════════════════════
        System.out.println("\n=== EJERCICIO 8 ===");
        System.out.print("Escribe tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Escribe tu apellido: ");
        String apellido = teclado.nextLine();

        // Primero pasamos todo a minúsculas, luego ponemos la primera letra en mayúscula
        nombre   = nombre.toLowerCase();
        nombre   = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);

        apellido = apellido.toLowerCase();
        apellido = apellido.substring(0, 1).toUpperCase() + apellido.substring(1);

        System.out.println("Resultado: " + nombre + " " + apellido);

        teclado.close();
    }

}
