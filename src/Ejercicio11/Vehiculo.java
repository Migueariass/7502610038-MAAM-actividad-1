package ejercicio11;

public class Vehiculo {
    String marca;
    int velocidadActual;

    void acelerar() {
        velocidadActual += 10;
        System.out.println("Acelerando... Velocidad actual: " + velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        v.marca = "Toyota";
        v.velocidadActual = 40;
        v.acelerar();
    }
}