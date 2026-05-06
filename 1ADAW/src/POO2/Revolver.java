package POO2;

import java.util.*;

public class Revolver {
    
    int tamaño;
    String marca;
    String modelo;
    private final ArrayList<Object> tambor;
    private int martillo;
    private int posBala;

    //Creamos un revolver con tamaño de tambor 6
    public Revolver(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tambor = new ArrayList<>(6);
        this.martillo = (int) (Math.random()*5);
        this.posBala = (int) (Math.random()*5);
    }

    public boolean disparar() {
        boolean res = false;
        if (martillo == posBala) {
            this.tambor.set(this.martillo, null); 
            res = true;
        }
            this.moverTambor();
            return res;
        }
    

    public void moverTambor() {
        this.martillo++;
        if (this.martillo == this.tambor.size()) {
            this.martillo = 0;
        }
    }

    public ArrayList<Object> getTambor() {
        return tambor;
    }

    
    
    @Override
    public String toString() {
        return "Revolver{" + "tama\u00f1o=" + tamaño + ", marca=" + marca + ", modelo=" + modelo + ", tambor=" + tambor + ", martillo=" + martillo + ", posBala=" + posBala + '}';
    }
    
    
    
}
