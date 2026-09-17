package ejercicio03;

public class Producto {
    String nombre;
    double precio;
    int stock;

    void mostrarDetalles() {
        System.out.println("--- Detalles del Producto ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}