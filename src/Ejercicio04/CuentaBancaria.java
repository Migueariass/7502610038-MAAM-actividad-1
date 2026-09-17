package ejercicio04;

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
}