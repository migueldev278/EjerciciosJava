package ej96herencia;


public class ProductosCongelados {

    String FechaCad;
    int NumLote;
    String FechaEnv;
    double TempMant;
    String PaisOri;

    public ProductosCongelados(String FechaCad, int NumLote, String FechaEnv, double TempMant, String PaisOri) {
        this.FechaCad = FechaCad;
        this.NumLote = NumLote;
        this.FechaEnv = FechaEnv;
        this.TempMant = TempMant;
        this.PaisOri = PaisOri;
    }

    @Override
    public String toString() {
        return "ProductosCongelados{" + "FechaCad=" + FechaCad + ", NumLote=" + NumLote + ", FechaEnv=" + FechaEnv + ", TempMant=" + TempMant + ", PaisOri=" + PaisOri + '}';
    }
    
    
    
    
}
