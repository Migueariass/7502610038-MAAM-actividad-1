package ejercicio20;

public class Producto {
    String nombre;
    double precio;

    double calcularPrecioConDescuento(double porcentaje) {
        return precio - (precio * (porcentaje / 100));
    }

    public static void main(String[] args) {
        Producto p = new Producto();
        p.nombre = "Laptop";
        p.precio = 2500000;

        double precioFinal = p.calcularPrecioConDescuento(10);
        System.out.println("Precio con descuento de " + p.nombre + ": $" + precioFinal);
    }
}