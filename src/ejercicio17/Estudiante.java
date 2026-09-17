package ejercicio17;

public class Estudiante {
    String nombre;
    int semestre;

    void cambiarSemestre(int nuevoSemestre) {
        if (nuevoSemestre > semestre) {
            semestre = nuevoSemestre;
            System.out.println(nombre + " avanzó al semestre " + semestre);
        }
    }

    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.nombre = "Laura";
        e.semestre = 2;
        e.cambiarSemestre(3);
    }
}