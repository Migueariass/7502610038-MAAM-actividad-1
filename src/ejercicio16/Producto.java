package ejercicio16;

public class Producto {
    String nombre;
    int stock;

    void reabastecer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Reabastecimiento exitoso. Nuevo stock: " + stock);
        }
    }

    public static void main(String[] args) {
        Producto p = new Producto();
        p.stock = 5;
        p.reabastecer(15);
    }
}