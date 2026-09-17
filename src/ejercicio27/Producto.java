package ejercicio27;

public class Producto {
    String nombre;
    static int contadorProductos = 0;

    public Producto(String nombre) {
        this.nombre = nombre;
        contadorProductos++;
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("Monitor");
        Producto p2 = new Producto("Teclado");
        Producto p3 = new Producto("Diadema");

        System.out.println("Total de productos creados: " + Producto.contadorProductos);
    }
}