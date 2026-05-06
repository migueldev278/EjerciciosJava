
package SENSORGLUCOSA;

/**
 *
 * @author asabi
 */
public class AlertaMedicaException extends Exception { 

    public AlertaMedicaException(String mensaje) {
        // 2. Pasar el mensaje a la superclase Exception
        super(mensaje); 
    }

    String getNivel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

