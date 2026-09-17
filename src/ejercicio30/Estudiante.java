package ejercicio30;

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
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante("Pedro", "75001");
        Estudiante e3 = new Estudiante("Sofia", "75002", 4);

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();
    }
}