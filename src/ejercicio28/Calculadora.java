package ejercicio28;

public class Calculadora {
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    public static void main(String[] args) {
        double prom = Calculadora.calcularPromedio(4.0, 3.5, 4.5);
        System.out.println("El promedio final es: " + prom);
    }
}
