package ejercicio28;

public class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    public CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    void mostrarCuenta() {
        System.out.println("Número: " + numero + " | Titular: " + titular + " | Saldo: $" + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("101-202", "Ana Gómez", 150000);
        CuentaBancaria c2 = new CuentaBancaria("303-404", "Carlos Pérez", 300000);
        CuentaBancaria c3 = new CuentaBancaria("505-606", "Marta Ríos", 450000);

        c1.mostrarCuenta();
        c2.mostrarCuenta();
        c3.mostrarCuenta();
    }
}