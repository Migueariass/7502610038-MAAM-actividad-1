package ejercicio19;

public class Estudiante {
    String nombre;
    int semestre;

    void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Semestre: " + semestre);
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        e1.nombre = "Ana";
        e1.semestre = 1;

        Estudiante e2 = new Estudiante();
        e2.nombre = "Pedro";
        e2.semestre = 4;

        e1.mostrarInfo();
        e2.mostrarInfo();
    }
}