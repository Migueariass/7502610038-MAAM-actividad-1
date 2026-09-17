package ejercicio14;

public class CuentaBancaria {
    String titular;
    double saldo;

    void retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria();
        c.saldo = 200000;
        c.retirar(80000);
    }
}