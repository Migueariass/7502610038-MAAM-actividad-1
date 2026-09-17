package ejercicio32;

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
        Producto p1 = Producto.crearProductoBasico("Mouse Óptico", 25000);
        Producto p2 = Producto.crearProductoBasico("Audífonos", 80000);

        p1.mostrarProducto();
        p2.mostrarProducto();
    }
}