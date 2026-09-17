package ejercicio26;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: El saldo no puede ser negativo.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria();
        c.setSaldo(-500);
        c.setSaldo(200000);
        System.out.println("Saldo final: $" + c.getSaldo());
    }
}
