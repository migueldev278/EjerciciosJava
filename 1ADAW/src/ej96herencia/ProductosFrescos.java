package ej96herencia;


public class ProductosFrescos {

    String FechaCad;
    int NumLote;
    String FechaEnv;
    String PaisOri;
    
    public ProductosFrescos(String FechaCad, int NumLote, String FechaEnv, String PaisOri){
      this.FechaCad = FechaCad;
      this.NumLote = NumLote;
      this.FechaEnv = FechaEnv;
      this.PaisOri = PaisOri;
    }
    
    public String ConservacionUtilizado (String ConservacionUtil){
        return "La conservacion utilizada es: " + ConservacionUtil;
    }

    @Override
    public String toString() {
        return "ProductosFrescos{" + "FechaCad=" + FechaCad + ", NumLote=" + NumLote + ", FechaEnv=" + FechaEnv + ", PaisOri=" + PaisOri + '}';
    }

    
    
    
    
}
