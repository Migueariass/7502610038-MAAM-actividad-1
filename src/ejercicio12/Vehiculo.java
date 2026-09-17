package ejercicio12;

public class Vehiculo {
    String marca;
    int velocidadActual;

    void frenar() {
        if (velocidadActual >= 10) {
            velocidadActual -= 10;
        } else {
            velocidadActual = 0;
        }
        System.out.println("Frenando... Velocidad actual: " + velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        v.velocidadActual = 20;
        v.frenar();
    }
}
