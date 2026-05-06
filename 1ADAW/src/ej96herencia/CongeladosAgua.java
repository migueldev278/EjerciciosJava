package ej96herencia;


public class CongeladosAgua extends ProductosCongelados{

    double CantSal;

    public CongeladosAgua(double CantSal, String FechaCad, int NumLote, String FechaEnv, double TempMant, String PaisOri) {
        super(FechaCad, NumLote, FechaEnv, TempMant, PaisOri);
        this.CantSal = CantSal;
    }

    @Override
    public String toString() {
        return "CongeladosAgua{" + "CantSal=" + CantSal + '}';
    }
    
    
    
}
