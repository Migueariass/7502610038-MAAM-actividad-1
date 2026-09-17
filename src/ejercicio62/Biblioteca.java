package ejercicio62;

/*
 * DISEÑO PREVIO (Parte K):
 * 1. Atributos: nombre (String), direccion (String), totalLibros (int)
 * 2. Métodos: prestarLibro(), recibirLibro(), mostrarEstado()
 * 3. Objetos reales a construir:
 *    - "Biblioteca Central", Dirección: "Calle 10 #5-20", Total Libros: 5000
 *    - "Biblioteca Departamental", Dirección: "Av. Universidad", Total Libros: 12000
 */

public class Biblioteca {
    String nombre;
    String direccion;
    int totalLibros;

    public Biblioteca(String nombre, String direccion, int totalLibros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.totalLibros = totalLibros;
    }

    public void prestarLibro() {
        if (totalLibros > 0) {
            totalLibros--;
            System.out.println("Libro prestado de " + nombre + ". Libros disponibles: " + totalLibros);
        }
    }

    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca("Biblioteca Central", "Calle 10 #5-20", 5000);
        Biblioteca b2 = new Biblioteca("Biblioteca Departamental", "Av. Universidad", 12000);
        b1.prestarLibro();
        b2.prestarLibro();
    }
}