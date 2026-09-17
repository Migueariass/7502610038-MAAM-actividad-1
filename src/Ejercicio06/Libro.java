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
}
