package ejercicio15;

public class Producto {
    String nombre;
    int stock;

    void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada. Stock restante: " + stock);
        } else {
            System.out.println("Stock insuficiente para vender " + cantidad + " unidades.");
        }
    }

    public static void main(String[] args) {
        Producto p = new Producto();
        p.nombre = "Mouse";
        p.stock = 10;
        p.vender(3);
    }
}