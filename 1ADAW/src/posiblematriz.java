import java.util.Scanner;
public class posiblematriz {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Plazas: O = Ocupado, L = Libre
char[] grandes = new char[10];
char[] pequenas = new char[14];
// Inicializar todas las plazas a L (libre)
for (int i = 0; i < grandes.length; i++)
grandes[i] = 'L';
for (int i = 0; i < pequenas.length; i++)
pequenas[i] = 'L';
int opcion = 0;
do {
System.out.println("\nAPARCAMIENTOS MEDAC NOVA");
System.out.println("--------------------------");
System.out.println("1) Aparcar vehículo.");
System.out.println("2) Sacar vehículo.");
System.out.println("3) Mostrar aparcamiento.");
System.out.println("4) Salir");
System.out.print("Opcion? ");
opcion = sc.nextInt();
sc.nextLine();
switch(opcion) {
case 1: // Aparcar vehículo
char seguirAparcar = 'S';
while (seguirAparcar == 'S') {
System.out.print("Tamaño del vehículo (G/P)? ");
char tipo = sc.nextLine().toUpperCase().charAt(0);
boolean aparcado = false;
if (tipo == 'P') {
// intenta primero en pequeñas
for (int i = 0; i < pequenas.length && !aparcado; i++) {
if (pequenas[i] == 'L') {
pequenas[i] = 'O';
System.out.println("Vehiculo aparcado en P" + i);
aparcado = true;
}
}
// si no hay, prueba en grandes
if (!aparcado) {
for (int i = 0; i < grandes.length && !aparcado; i++) {
if (grandes[i] == 'L') {
grandes[i] = 'O';
System.out.println("Vehiculo aparcado en G" + i);
aparcado = true;
}
}
}
}
else if (tipo == 'G') {
for (int i = 0; i < grandes.length && !aparcado; i++) {
if (grandes[i] == 'L') {
grandes[i] = 'O';
System.out.println("Vehiculo aparcado en G" + i);
aparcado = true;
}
}
}
if (!aparcado)
System.out.println("IMPOSIBLE: no hay plazas disponibles.");
System.out.print("Aparcar otro (S/N)? ");
seguirAparcar = sc.nextLine().toUpperCase().charAt(0);
// Si todas las plazas están llenas, no seguimos
if (!hayLibres(grandes, pequenas))
seguirAparcar = 'N';
}
break;
case 2: // Sacar vehículo
char seguirSacar = 'S';
while (seguirSacar == 'S') {
System.out.print("Tamaño del vehículo (G/P)? ");
char tipo = sc.nextLine().toUpperCase().charAt(0);
System.out.print("Numero de plaza? ");
int plaza = sc.nextInt();
sc.nextLine();
if (tipo == 'G') {
if (plaza < 0 || plaza >= grandes.length) {
System.out.println("Plaza inválida.");
}
else if (grandes[plaza] == 'L') {
System.out.println("IMPOSIBLE: en esa plaza no hay ningún vehículo");
}
else {
grandes[plaza] = 'L';
System.out.println("La plaza queda disponible.");
}
}
else if (tipo == 'P') {
if (plaza < 0 || plaza >= pequenas.length) {
System.out.println("Plaza inválida.");
}
else if (pequenas[plaza] == 'L') {
System.out.println("IMPOSIBLE: en esa plaza no hay ningún vehículo");
}
else {
pequenas[plaza] = 'L';
System.out.println("La plaza queda disponible.");
}
}
if (!hayOcupadas(grandes, pequenas))
seguirSacar = 'N';
else {
System.out.print("Sacar otro (S/N)? ");
seguirSacar = sc.nextLine().toUpperCase().charAt(0);
}
}
break;
case 3: // Mostrar aparcamiento
System.out.println("Situación del aparcamiento:");
mostrarArray("G", grandes);
mostrarArray("P", pequenas);
break;
case 4:
System.out.println("Aparcamientos MEDAC NOVA le desea Feliz Halloween!!");
break;
default:
System.out.println("Opción inválida.");
break;
}
} while (opcion != 4);
}
// Devuelve si queda alguna plaza libre
public static boolean hayLibres(char[] g, char[] p) {
for (int i = 0; i < g.length; i++)
if (g[i] == 'L') return true;
for (int i = 0; i < p.length; i++)
if (p[i] == 'L') return true;
return false;
}
// Devuelve si hay coches dentro
public static boolean hayOcupadas(char[] g, char[] p) {
for (int i = 0; i < g.length; i++)
if (g[i] == 'O') return true;
for (int i = 0; i < p.length; i++)
if (p[i] == 'O') return true;
return false;
}
// Mostrar arrays con formato
public static void mostrarArray(String tipo, char[] plazas) {
System.out.print("Plazas " + tipo + " = [");
for (int i = 0; i < plazas.length; i++) {
System.out.print(plazas[i]);
if (i < plazas.length - 1)
System.out.print(",");
}
System.out.println("]");
}
}