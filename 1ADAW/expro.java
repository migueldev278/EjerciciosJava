import java.util.Scanner;

public class expro {
    static final int VACIO = 0, PEQ = 1, GRA = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] plazas = new int[24]; // 0-13 pequeñas, 14-23 grandes

        while (true) {
            System.out.println("\nMENU: 1-Aparcar 2-Sacar 3-Mostrar 4-Salir");
            String opt = sc.nextLine().trim();

            if ("1".equals(opt)) { // Aparcar
                while (true) {
                    if (!hay(plazas, VACIO)) { System.out.println("No quedan plazas."); break; }
                    System.out.print("Tamaño (1=Pequeño,2=Grande): ");
                    String t = sc.nextLine().trim();
                    if (!"1".equals(t) && !"2".equals(t)) { System.out.println("Opción no válida."); continue; }

                    if ("1".equals(t)) { // pequeño: preferir pequeñas, sino grandes
                        int idx = primeroLibre(plazas, 0, 14);
                        if (idx == -1) idx = primeroLibre(plazas, 14, plazas.length);
                        if (idx == -1) System.out.println("No hay plazas libres para pequeño.");
                        else { plazas[idx] = PEQ; System.out.println("Aparcado en plaza " + (idx + 1)); }
                    } else { // grande
                        int idx = primeroLibre(plazas, 14, plazas.length);
                        if (idx == -1) System.out.println("No hay plazas grandes libres.");
                        else { plazas[idx] = GRA; System.out.println("Aparcado en plaza " + (idx + 1)); }
                    }

                    System.out.print("Otro? (s/n): ");
                    if (!"s".equalsIgnoreCase(sc.nextLine().trim())) break;
                }

            } else if ("2".equals(opt)) { // Sacar
                while (true) {
                    if (!hay(plazas, PEQ) && !hay(plazas, GRA)) { System.out.println("No hay coches."); break; }
                    System.out.print("Plaza a liberar (1-24): ");
                    int num;
                    try { num = Integer.parseInt(sc.nextLine().trim()); }
                    catch (Exception e) { System.out.println("Número no válido."); continue; }
                    if (num < 1 || num > 24) { System.out.println("Número no válido."); continue; }
                    int idx = num - 1;
                    if (plazas[idx] == VACIO) System.out.println("Ya está libre.");
                    else { plazas[idx] = VACIO; System.out.println("Plaza " + num + " liberada."); }

                    System.out.print("Otro? (s/n): ");
                    if (!"s".equalsIgnoreCase(sc.nextLine().trim())) break;
                }

            } else if ("3".equals(opt)) { // Mostrar
                for (int i = 0; i < plazas.length; i++) {
                    String tipo = (i < 14) ? "Peq" : "Gra";
                    String est = (plazas[i] == VACIO) ? "Libre" : (plazas[i] == PEQ ? "Ocupado(P)" : "Ocupado(G)");
                    System.out.printf("Plaza %2d (%3s): %s%n", i + 1, tipo, est);
                }

            } else if ("4".equals(opt)) { // Salir
                System.out.print("Salir? (s/n): ");
                if ("s".equalsIgnoreCase(sc.nextLine().trim())) { System.out.println("Adiós."); break; }

            } else {
                System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }

    static int primeroLibre(int[] p, int from, int to) {
        for (int i = from; i < to; i++) if (p[i] == VACIO) return i;
        return -1;
    }

    static boolean hay(int[] p, int valor) {
        for (int x : p) if (x == valor) return true;
        return false;
    }
}
class ParkingNoBreak {
    static final int EMPTY = 0, SMALL = 1, BIG = 2;

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int[] lots = new int[24];
        boolean running = true;

        while (running) {
            System.out.println("\nMENU OPCIONES: 1-Entrar 2-SalirCoche 3-Ver 4-Terminar");
            String choice = in.nextLine().trim();

            if ("1".equals(choice)) { // Entrar
                boolean repeat = true;
                while (repeat) {
                    if (!hasValue(lots, EMPTY)) {
                        System.out.println("No quedan plazas disponibles.");
                        repeat = false;
                        continue;
                    }

                    System.out.print("Tamaño (1=Pequeño,2=Grande): ");
                    String sz = in.nextLine().trim();
                    if (!"1".equals(sz) && !"2".equals(sz)) {
                        System.out.println("Opción no válida.");
                        continue;
                    }

                    if ("1".equals(sz)) {
                        int pos = firstFree(lots, 0, 14, EMPTY);
                        if (pos == -1) pos = firstFree(lots, 14, lots.length, EMPTY);
                        if (pos == -1) System.out.println("No hay hueco para vehículo pequeño.");
                        else {
                            lots[pos] = SMALL;
                            System.out.println("Vehículo estacionado en plaza nº " + (pos + 1));
                        }
                    } else {
                        int pos = firstFree(lots, 14, lots.length, EMPTY);
                        if (pos == -1) System.out.println("No hay plazas grandes libres.");
                        else {
                            lots[pos] = BIG;
                            System.out.println("Vehículo grande en plaza nº " + (pos + 1));
                        }
                    }

                    System.out.print("Otro? (s/n): ");
                    repeat = "s".equalsIgnoreCase(in.nextLine().trim());
                }

            } else if ("2".equals(choice)) { // Sacar coche
                boolean repeat = true;
                while (repeat) {
                    if (!hasValue(lots, SMALL) && !hasValue(lots, BIG)) {
                        System.out.println("No hay vehículos estacionados.");
                        repeat = false;
                        continue;
                    }

                    System.out.print("Número de plaza a liberar (1-24): ");
                    int num;
                    try {
                        num = Integer.parseInt(in.nextLine().trim());
                    } catch (Exception e) {
                        System.out.println("Número inválido.");
                        continue;
                    }
                    if (num < 1 || num > 24) {
                        System.out.println("Número fuera de rango.");
                        continue;
                    }

                    int idx = num - 1;
                    if (lots[idx] == EMPTY) System.out.println("La plaza ya estaba libre.");
                    else {
                        lots[idx] = EMPTY;
                        System.out.println("Plaza " + num + " ahora libre.");
                    }

                    System.out.print("Otro? (s/n): ");
                    repeat = "s".equalsIgnoreCase(in.nextLine().trim());
                }

            } else if ("3".equals(choice)) { // Mostrar
                for (int i = 0; i < lots.length; i++) {
                    String sizeTag = (i < 14) ? "peq" : "gra";
                    String state = lots[i] == EMPTY ? "Libre" : (lots[i] == SMALL ? "Ocupado(P)" : "Ocupado(G)");
                    System.out.printf("Plaza %2d (%3s): %s%n", i + 1, sizeTag, state);
                }

            } else if ("4".equals(choice)) { // Terminar
                System.out.print("Desea finalizar? (s/n): ");
                if ("s".equalsIgnoreCase(in.nextLine().trim())) running = false;

            } else {
                System.out.println("Opción no válida.");
            }
        }

        in.close();
    }

    static int firstFree(int[] arr, int from, int to, int val) {
        for (int i = from; i < to; i++) if (arr[i] == val) return i;
        return -1;
    }

    static boolean hasValue(int[] arr, int v) {
        for (int x : arr) if (x == v) return true;
        return false;
    }
}