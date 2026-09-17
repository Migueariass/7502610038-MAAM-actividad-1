package ejercicio68;

public class PlatoRestaurante {
    String nombre;
    double precio;
    String categoria;

    public PlatoRestaurante(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public void aplicarDescuentoMenu(double porcentaje) {
        this.precio -= this.precio * (porcentaje / 100.0);
        System.out.println("Nuevo precio de '" + nombre + "' tras descuento: $" + precio);
    }

    public void servir() {
        System.out.println("Serviendo plato: " + nombre + " [" + categoria + "]");
    }

    public static void main(String[] args) {
        PlatoRestaurante plato = new PlatoRestaurante("Bandeja Paisa", 28000, "Plato Fuerte");
        plato.servir();
        plato.aplicarDescuentoMenu(10);
    }
}
