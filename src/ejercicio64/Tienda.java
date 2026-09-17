package ejercicio64;

/*
 * DISEÑO PREVIO (Parte K):
 * 1. Atributos: nombre (String), propietario (String), cajaRegistradora (double)
 * 2. Métodos: realizarVenta(double monto), cerrarCaja(), mostrarBalance()
 * 3. Objetos reales a construir:
 *    - "Tienda Don Pedro", Propietario: "Pedro Gómez", Caja: $500000
 *    - "Supermercado El Sol", Propietario: "Ana Martínez", Caja: $2000000
 */

public class Tienda {
    String nombre;
    String propietario;
    double cajaRegistradora;

    public Tienda(String nombre, String propietario, double cajaInicial) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.cajaRegistradora = cajaInicial;
    }

    public void realizarVenta(double monto) {
        cajaRegistradora += monto;
        System.out.println("Venta de $" + monto + " realizada en " + nombre + ". Caja actual: $" + cajaRegistradora);
    }

    public static void main(String[] args) {
        Tienda t1 = new Tienda("Tienda Don Pedro", "Pedro Gómez", 500000);
        Tienda t2 = new Tienda("Supermercado El Sol", "Ana Martínez", 2000000);
        t1.realizarVenta(25000);
        t2.realizarVenta(150000);
    }
}