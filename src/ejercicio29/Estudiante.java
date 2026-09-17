package ejercicio29;

public class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    public Estudiante() {}

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Código: " + codigo + " | Semestre: " + semestre);
    }

    public static void main(String[] args) {
        Estudiante e = new Estudiante("Laura", "7502610", 3);
        e.mostrarInfo();
    }
}