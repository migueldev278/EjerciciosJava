package POO.delos;
public class Libro {
    
    // APARTADO A: Propiedades privadas
    private String titulo;
    private String autor;
    private int numPaginas;
    private double precio;
    private boolean prestado;

    // APARTADO B: Constructores

    /**
     * Constructor completo
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param numPaginas Número de páginas
     * @param precio Precio del libro
     * @param prestado Estado de préstamo
     */
    public Libro(String titulo, String autor, int numPaginas, double precio, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precio = precio;
        this.prestado = prestado;
    }

    /**
     * Constructor sobrecargado
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param numPaginas Número de páginas
     */
    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precio = 0.0;
        this.prestado = false;
    }

    /**
     * Constructor de copia
     * @param otroLibro Objeto Libro a copiar
     */
    public Libro(Libro otroLibro) {
        this.titulo = otroLibro.titulo;
        this.autor = otroLibro.autor;
        this.numPaginas = otroLibro.numPaginas;
        this.precio = otroLibro.precio;
        this.prestado = otroLibro.prestado;
    }

    // APARTADO C: Métodos GET y SET

    /**
     * Obtiene el título del libro
     * @return Título del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el autor del libro
     * @return Autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Obtiene el precio del libro
     * @return Precio del libro
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del libro
     * Solo permite valores mayores o iguales a 0
     * @param precio Nuevo precio del libro
     */
    public void setPrecio(double precio) {
        if (precio >= 0.0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    /**
     * Establece el estado de préstamo del libro
     * @param prestado Estado de préstamo
     */
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    // APARTADO D: Métodos prestar() y devolver()

    /**
     * Marca el libro como prestado
     */
    public void prestar() {
        this.prestado = true;
    }

    /**
     * Marca el libro como no prestado (devuelto)
     */
    public void devolver() {
        this.prestado = false;
    }

    // APARTADO E: Método toString()

    /**
     * Devuelve una representación textual del libro
     * @return String con la información del libro
     */
    @Override
    public String toString() {
        String estado = prestado ? "Prestado" : "Disponible";
        return "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Páginas: " + numPaginas + "\n" +
               "Precio: " + precio + " €\n" +
               "Estado: " + estado;
    }
}
