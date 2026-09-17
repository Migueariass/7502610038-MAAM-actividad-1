package ejercicio34;

abstract class Figura {
    abstract double calcularArea();
}

public class Rectangulo extends Figura {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(5, 3);
        System.out.println("Área del rectángulo: " + r.calcularArea());
    }
}