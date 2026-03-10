public class Libro {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public boolean prestamo() {
        if (prestados < ejemplares) {
            prestados++;
            return true;
        }
        return false;
    }

    public boolean devolucion() {
        if (prestados > 0) {
            prestados--;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Libro: " + titulo +
                " Autor: " + autor +
                " Ejemplares: " + ejemplares +
                " Prestados: " + prestados;
    }
}
