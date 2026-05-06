
package SENSORGLUCOSA;

import java.awt.Desktop;
import java.io.*;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JFrame;

public class GlucosaCareSystemAlumnos {

    private static final String ARCHIVO_DATOS = "diario_glucosa.txt";
    private static final String ARCHIVO_ALERTAS = "alertas_medicas.txt";
    private static final String ARCHIVO_ERRORES = "errores_sistema.txt";

    public static void main(String[] args) throws AlertaMedicaException {
        Scanner lectorConsola = new Scanner(System.in);
        System.out.println("--- SISTEMA GLUCOSCARE: MODO DESARROLLO ---");

        while (true) {
            int nivelActual = 0;
            try {
                System.out.print("\nEntrada del sensor: ");
                String datoEntrada = lectorConsola.nextLine();

                if (datoEntrada.equalsIgnoreCase("OFF")) {
                    System.out.println("Cerrando y generando informes...");
                    mostrarGrafica();
                    // Abrir los 3 ficheros creados
                    abrirArchivo(ARCHIVO_DATOS);
                    abrirArchivo(ARCHIVO_ALERTAS);
                    abrirArchivo(ARCHIVO_ERRORES);
                    break;
                }

                // 1. Convertir String a int
                nivelActual = Integer.parseInt(datoEntrada);

                // 2. Validar el nivel
                validarNivel(nivelActual);

                // 3. Registro normal
                int nivelAnterior = obtenerUltimoRegistro();
                String tendencia = calcularTendencia(nivelAnterior, nivelActual);
                guardarEnFichero(nivelActual, tendencia);
                System.out.println(">>> Registro normal guardado.");

            } catch (NumberFormatException e) {
                // Captura cuando el usuario mete letras en vez de números
                System.err.println("Dato no numérico detectado.");
                registrarLog(ARCHIVO_ERRORES, "ERROR", "Entrada no numérica: " + e.getMessage());

            } catch (AlertaMedicaException e) {
                // TODO A: Registrar la alerta en el fichero de alertas
                System.err.println("ALERTA MÉDICA: " + e.getMessage());
                registrarLog(ARCHIVO_ALERTAS, "ALERTA", e.getMessage() + " - Nivel: " + e.getNivel());

                // TODO B: Registrar también el valor en el diario normal para la gráfica
                int nivelAnterior = obtenerUltimoRegistro();
                String tendencia = calcularTendencia(nivelAnterior, e.getNivel());
                try {
                    guardarEnFichero(e.getNivel(), tendencia);
                } catch (IOException ioEx) {
                    registrarLog(ARCHIVO_ERRORES, "ERROR", "No se pudo guardar en diario: " + ioEx.getMessage());
                }

            } catch (IOException e) {
                System.err.println("Error de entrada/salida de archivos.");
                registrarLog(ARCHIVO_ERRORES, "ERROR", "IOException: " + e.getMessage());
            }
        }
    }

    /**
     * Lanza una excepción si el nivel es crítico.
     */
    private static void validarNivel(int nivel) throws AlertaMedicaException {
        if (nivel < 70) {
            throw new AlertaMedicaException("Hipoglucemia", nivel);
        } else if (nivel > 180) {
            throw new AlertaMedicaException("Hiperglucemia", nivel);
        }
    }

    /**
     * Escribe en el archivo de datos principal.
     */
    private static void guardarEnFichero(int nivel, String tendencia) throws IOException {
        try (FileWriter fw = new FileWriter(ARCHIVO_DATOS, true)) {
            fw.write("[" + new Date().toString() + "] Nivel: " + nivel + " mg/dL Tendencia: " + tendencia + "\n");
        }
    }

    /**
     * Método auxiliar para el registro de logs técnicos y médicos.
     */
    private static void registrarLog(String nombreArchivo, String etiqueta, String mensaje) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo, true))) {
            pw.println("[" + new Date().toString() + "] [" + etiqueta + "] " + mensaje);
        } catch (IOException e) {
            System.err.println("Fallo al registrar log.");
        }
    }

    // --- MÉTODOS DE APOYO ---
    private static int obtenerUltimoRegistro() {
        File f = new File(ARCHIVO_DATOS);
        if (!f.exists()) {
            return 100;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea, ultima = "";
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    ultima = linea;
                }
            }
            if (!ultima.isEmpty()) {
                String[] partes = ultima.split(" ");
                for (int i = 0; i < partes.length; i++) {
                    if (partes[i].equals("Nivel:")) {
                        return Integer.parseInt(partes[i + 1]);
                    }
                }
            }
        } catch (Exception e) {
            return 100;
        }
        return 100;
    }

    private static String calcularTendencia(int ant, int act) {
        if (act > ant + 10) {
            return "↑↑";
        }
        if (act < ant - 10) {
            return "↓↓";
        }
        return "→";
    }

    public static void mostrarGrafica() {
        JFrame v = new JFrame("Análisis de Glucosa");
        v.add(new GraficaGlucosa());
        v.setSize(1000, 600);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }

    public static void abrirArchivo(String ruta) {
        try {
            File f = new File(ruta);
            if (f.exists()) {
                Desktop.getDesktop().open(f);
            }
        } catch (IOException e) {
        }
    }
}
