package Ejercicio08;

public class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    void mostrarEstado() {
        System.out.println("--- Estado del Vehículo ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        Vehiculo veh = new Vehiculo();
        veh.marca = "Toyota";
        veh.modelo = "Corolla";
        veh.velocidadActual = 60;
        veh.mostrarEstado();
    }
}