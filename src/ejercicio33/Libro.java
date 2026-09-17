package ejercicio33;

public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Constructor copia
    public Libro(Libro otro) {
        this.titulo = otro.titulo;
        this.autor = otro.autor;
        this.paginas = otro.paginas;
    }

    void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Libro l1 = new Libro("Rayuela", "Julio Cortázar", 600);
        Libro l2 = new Libro(l1);
        l2.mostrarInfo();
    }
}