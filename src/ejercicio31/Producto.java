package ejercicio31;

public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public static Producto crearProductoBasico(String nombre, double precio) {
        return new Producto(nombre, precio, 0);
    }

    void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }

    public static void main(String[] args) {
        Producto p = Producto.crearProductoBasico("Teclado", 50000);
        p.mostrarProducto();
    }
}