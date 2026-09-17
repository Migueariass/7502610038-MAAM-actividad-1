package ejercicio58;

public class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    public InventarioItem(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularValorTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarInventario() {
        System.out.println("Item: " + nombre + " | Cantidad: " + cantidad + " | Valor Total: $" + calcularValorTotal());
    }

    public static void main(String[] args) {
        InventarioItem item = new InventarioItem("Monitor 24 pulgadas", 15, 650000);
        item.mostrarInventario();
    }
}