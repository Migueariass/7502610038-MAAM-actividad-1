package ejercicio52;

public class FacturaSimple {
    int numero;
    String cliente;
    double valor;

    public FacturaSimple(int numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public void aplicarDescuento() {
        valor = valor * 0.90; // Aplica el 10% de descuento
        System.out.println("Descuento del 10% aplicado. Nuevo valor: $" + valor);
    }

    public void mostrarFactura() {
        System.out.println("Factura #" + numero + " | Cliente: " + cliente + " | Valor: $" + valor);
    }

    public static void main(String[] args) {
        FacturaSimple f = new FacturaSimple(101, "Carlos Pérez", 100000);
        f.mostrarFactura();
        f.aplicarDescuento();
    }
}