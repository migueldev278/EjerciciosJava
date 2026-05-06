package ej96herencia;


public class CongeladosAire extends ProductosCongelados{

    double nitro;
    double oxigeno;
    double dioxido;
    double vapor;

    public CongeladosAire(double nitro, double oxigeno, double dioxido, double vapor, String FechaCad, int NumLote, String FechaEnv, double TempMant, String PaisOri) {
        super(FechaCad, NumLote, FechaEnv, TempMant, PaisOri);
        this.nitro = nitro;
        this.oxigeno = oxigeno;
        this.dioxido = dioxido;
        this.vapor = vapor;
    }

    @Override
    public String toString() {
        return "CongeladosAire{" + "nitro=" + nitro + ", oxigeno=" + oxigeno + ", dioxido=" + dioxido + ", vapor=" + vapor + '}';
    }
    
    
    

    
    
}
