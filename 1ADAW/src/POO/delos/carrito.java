package POO.delos;

public class carrito {

    private String direccionweb;
    private int numMax;
    private String[] elementos;

    //Creo el boolean lleno para saber si el carrito está lleno o no.
    //F-No está llena T-Está llena.
    private boolean lleno = false;

    //Creo este string porque lo voy a utilizar en varias ocasiones y le pongo
    //final porque no voy a cambiar el valor de nada.
    private static final String nada = "nada";

    private void vaciarcarrito(int numelementos) {
        this.elementos = new String[numelementos];
        for (int i = 0; i < this.elementos.length; i++) {
            this.elementos[i] = nada;
        }
    }

    public carrito(String direccionweb, int numMax) {
        this.direccionweb = direccionweb;
        this.numMax = numMax;
        vaciarcarrito(numMax);
    }
    
    //Constructor sobrecargado
    public carrito(String direccionweb) {
        this.direccionweb = direccionweb;
        this.numMax = (int)(Math.random()*9)+7;
        vaciarcarrito(numMax);
    }
    
    //Constructor copia
    public carrito(carrito otro){
        this.direccionweb = otro.direccionweb;
        this.numMax = otro.numMax;
        this.elementos = new String[otro.elementos.length];
        for (int i = 0; i < otro.elementos.length; i++) {
            this.elementos[i] = otro.elementos[i];
        }
    }

    public void aniadirElemento(String nuevoelemento) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i].equals(nada)) {
                elementos[i] = nuevoelemento;
                return;
            }
        }
    }
    
    public void mostrarLista(){
        String lista="";
        int contador = 0;
        //Creo este boolean para saber si hay elemento en la posicición
        boolean hayElementos = false;
        
        for (String elemento : elementos) {
            contador++;
            if (!elemento.equals(nada)) {
                lista += "Nombre del " + contador + " elemento \n" + elemento + "\n";
                hayElementos = true;
            }else{
                lista += "Nombre del " + contador + " elemento \n" + "PO VACIA \n";
            }
        }
    }

    public void setCambiardireccion(String direccionweb) {
        this.direccionweb = direccionweb;
    }

    public String toString() {
        String resultado = "Nombre: " + direccionweb + "\n";
        resultado += "Edad: " + numMax + "\n";
        int contador = 0;
        //Creo este boolean para saber si hay elemento en la posicición
        boolean hayElementos = false;
        
        for (String elemento : elementos) {
            contador++;
            if (!elemento.equals(nada)) {
                resultado += "Nombre del " + contador + " elemento \n" + elemento + "\n";
                hayElementos = true;
            }else{
                resultado += "Nombre del " + contador + " elemento \n" + "PO VACIA \n";
            }
        }


        return resultado;

    }

}
