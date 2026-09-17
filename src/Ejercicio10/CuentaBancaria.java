package Ejercicio10;

public class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    void mostrarInformacion() {
        System.out.println("--- Información de la Cuenta ---");
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.numero = "123-456789-0";
        cuenta.titular = "María López";
        cuenta.saldo = 500000.0;
        cuenta.mostrarInformacion();
    }
}
