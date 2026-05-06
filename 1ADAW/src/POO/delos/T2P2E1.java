package POO.delos;

public class T2P2E1 {

    public static void main(String[] args) {

        carrito c1 = new carrito("Cesta de la compra", 10);

        c1.aniadirElemento("Pollo");
        c1.aniadirElemento("Patatas");
        c1.aniadirElemento("Queso");
        c1.aniadirElemento("Jamon");
        c1.aniadirElemento("Pescado");

            System.out.println(c1);
            
        videojuego v1 = new videojuego("avatar", "play",  18.25);
            
        System.out.println(v1);    
    }

}
