package ejercicio33;

abstract class Figura {
    String color;

    public Figura(String color) {
        this.color = color;
    }
}

public class Cuadrado extends Figura {
    double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public static void main(String[] args) {
        Cuadrado c = new Cuadrado("Rojo", 4.0);
        System.out.println("Cuadrado color: " + c.color + " | Lado: " + c.lado);
    }
}