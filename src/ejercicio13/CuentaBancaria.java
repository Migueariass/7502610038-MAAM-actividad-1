package ejercicio13;

public class CuentaBancaria {
    String titular;
    double saldo;

    void consignar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Consignación exitosa. Nuevo saldo: $" + saldo);
        }
    }

    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria();
        c.titular = "Carlos Gomez";
        c.saldo = 100000;
        c.consignar(50000);
    }
}