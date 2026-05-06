package García_Artacho_Miguel;


public class Componente {
    
    private String nombre;
    private String tipo;
    private double consumo;

    public Componente(String nombre, String tipo, double consumo) {
        this.nombre = nombre;
        this.tipo = tipo;
        if (tipo.equals("CPU") || tipo.equals("RAM") || tipo.equals("SSD") || tipo.equals("GPU") || tipo.equals("PSU") || tipo.equals("OTRO")) {
            this.tipo = tipo;
        } else {
            this.tipo = "OTRO";
        }
        this.consumo = consumo;
    }

    public Componente() {
        this.nombre = "Desconocido";
        this.tipo = "OTRO";
        this.consumo = 100.0;
    }

    @Override
    public String toString() {
        return "Componente: " + nombre + " tipo: " + tipo + " consumo: " + consumo;
    }
    
    

}
