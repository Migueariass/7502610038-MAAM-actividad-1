package ejercicio40;

public class Pelicula {
    String nombre;
    String genero;
    int minutos;

    public Pelicula(String nombre, String genero, int minutos) {
        this.nombre = nombre;
        this.genero = genero;
        this.minutos = minutos;
    }

    void mostrarFicha() {
        System.out.println("Película: " + nombre + " | Género: " + genero + " | Duración: " + minutos + " min");
    }

    public static void main(String[] args) {
        Pelicula p = new Pelicula("Inception", "Ciencia Ficción", 148);
        p.mostrarFicha();
    }
}