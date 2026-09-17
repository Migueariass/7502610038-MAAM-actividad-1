package ejercicio34;

public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro(Libro otro) {
        this.titulo = otro.titulo;
        this.autor = otro.autor;
        this.paginas = otro.paginas;
    }

    void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Libro original = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 496);
        Libro copia = new Libro(original);

        System.out.println("--- Libro Original ---");
        original.mostrarInfo();
        System.out.println("--- Libro Copia ---");
        copia.mostrarInfo();
    }
}