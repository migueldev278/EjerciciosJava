package ej96herencia;


public class ProductosRefrigerados {

    String FechaCad;
    int NumLote;
    int CodSupervision;
    String FechaEnv;
    double TempMant;
    String PaisOri;
    
    public ProductosRefrigerados(String FechaCad, int NumLote, int CodSupervision, String FechaEnv, double TempMant,String PaisOri){
    this.FechaCad = FechaCad;
    this.NumLote = NumLote;
    this.CodSupervision = CodSupervision;
    this.FechaEnv = FechaEnv;
    this.TempMant = TempMant;
    this.PaisOri = PaisOri;
    }

    @Override
    public String toString() {
        return "ProductosRefrigerados{" + "FechaCad=" + FechaCad + ", NumLote=" + NumLote + ", CodSupervision=" + CodSupervision + ", FechaEnv=" + FechaEnv + ", TempMant=" + TempMant + ", PaisOri=" + PaisOri + '}';
    }
    
    
    
}
