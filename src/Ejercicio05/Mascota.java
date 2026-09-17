package Ejercicio05;

public class Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarDatos() {
        System.out.println("--- Datos de la Mascota ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
}