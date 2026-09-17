package ejercicio22;

public class CuentaBancaria {
    String titular;
    double saldo;

    boolean verificarSaldoSuficiente(double monto) {
        return saldo >= monto;
    }

    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria();
        c.titular = "Sofia";
        c.saldo = 300000;

        double montoRetiro = 150000;
        if (c.verificarSaldoSuficiente(montoRetiro)) {
            c.saldo -= montoRetiro;
            System.out.println("Retiro exitoso. Saldo actual: $" + c.saldo);
        } else {
            System.out.println("Saldo insuficiente para retirar $" + montoRetiro);
        }
    }
}