package ejercicio01;

public class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    void mostrarInfo() {
        System.out.println("--- Información del Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
    }
}
