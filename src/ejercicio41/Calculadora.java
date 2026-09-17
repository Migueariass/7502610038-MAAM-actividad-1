package ejercicio41;

public class Calculadora {
    String marca;

    public Calculadora(String marca) {
        this.marca = marca;
    }

    double sumar(double a, double b) {
        return a + b;
    }

    double restar(double a, double b) {
        return a - b;
    }

    double multiplicar(double a, double b) {
        return a * b;
    }

    double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora("Casio");
        System.out.println("Suma: " + calc.sumar(10, 5));
        System.out.println("División: " + calc.dividir(10, 2));
    }
}