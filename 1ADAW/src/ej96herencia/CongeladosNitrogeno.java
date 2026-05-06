package ej96herencia;


public class CongeladosNitrogeno extends ProductosCongelados{
    
    String MetodCong;
    int ExpNitro;

    public CongeladosNitrogeno(String MetodCong, int ExpNitro, String FechaCad, int NumLote, String FechaEnv, double TempMant, String PaisOri) {
        super(FechaCad, NumLote, FechaEnv, TempMant, PaisOri);
        this.MetodCong = MetodCong;
        this.ExpNitro = ExpNitro;
    }

    @Override
    public String toString() {
        return "CongeladosNitrogeno{" + "MetodCong=" + MetodCong + ", ExpNitro=" + ExpNitro + '}';
    }
    
    
    
}
