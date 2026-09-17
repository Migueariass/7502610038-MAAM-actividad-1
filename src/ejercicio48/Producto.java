package ejercicio48;

/*
 * ERROR ORIGINAL: Confundir atributos de la clase con variables locales del método (sombreado/shadowing).
 * EXPLICACIÓN: Si la variable local o parámetro tiene el mismo nombre que el atributo, lo oculta a menos que se utilice 'this'.
 */

public class Producto {
    String nombre;
    double precio;

    public void establecerPrecio(double precio) {
        // Corrección: 'this.precio' se refiere al atributo de la clase, evitando la confusión con el parámetro local
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }

    public static void main(String[] args) {
        Producto p = new Producto();
        p.nombre = "Teclado";
        p.establecerPrecio(150000);
        p.mostrarInfo();
    }
}