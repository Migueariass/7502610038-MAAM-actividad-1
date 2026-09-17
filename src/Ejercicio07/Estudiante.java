package Ejercicio07;

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

    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        est.nombre = "Miguel Arias";
        est.codigo = "7502610038";
        est.semestre = 5;
        est.mostrarInfo();
    }
}