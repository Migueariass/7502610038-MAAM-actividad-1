package ejercicio39;

public class Cancion {
    String titulo;
    String artista;
    double duracion;

    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    void mostrarInfo() {
        System.out.println("Canción: " + titulo + " | Artista: " + artista + " | Duración: " + duracion + " min");
    }

    public static void main(String[] args) {
        Cancion c = new Cancion("La Gota Fría", "Carlos Vives", 3.5);
        c.mostrarInfo();
    }
}