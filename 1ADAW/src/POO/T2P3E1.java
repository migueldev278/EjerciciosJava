package POO;

import java.util.*;

public class T2P3E1 {

    public static void main(String[] args) {

        /*Voy a utilizar Arrays.asList para que la lista tenga un tamaño fijo 
        de 10 elementos*/
        Scanner teclado = new Scanner(System.in);

        List<String> DniAlumnos = Arrays.asList("Vacio", "Vacio", "Vacio", "Vacio",
                "Vacio", "Vacio", "Vacio", "Vacio", "Vacio", "Vacio");

        for (int i = 0; i < DniAlumnos.size(); i++) {
            System.out.println("Dame un Dni: ");
            String Dni = teclado.next();
            DniAlumnos.set(i, Dni);
        }

        //Muestro la cantidad de alumnos que han asistido
        
        System.out.println(DniAlumnos.size());
        
        //Muestro todos los DNI almacenados.
        for (int i = 0; i < DniAlumnos.size(); i++) {
                        System.out.print(DniAlumnos.get(i) + " ");

        }
        
        System.out.println("");
        //Pregunto al usuario por un dni
        
        System.out.println("Dime un dni para ver si esta: ");
        String BuscarDni = teclado.next();
        
        if (DniAlumnos.contains(BuscarDni)) {
            System.out.println(DniAlumnos.contains(BuscarDni)+ "Asistio a la charla");
        }else{
            System.out.println(DniAlumnos.contains(BuscarDni)+ "No asistio a la charla");
        }
       
        System.out.println("Registro de asistentes finalizado.");
        
        
    }

}
