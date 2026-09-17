package Ejercicio06;

public class Libro {
    String titulo;
    String autor;
    int paginas;

    void mostrarResumen() {
        System.out.println("--- Resumen del Libro ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.titulo = "Cien Años de Soledad";
        libro.autor = "Gabriel García Márquez";
        libro.paginas = 471;
        libro.mostrarResumen();
    }
}
