package ejercicio41;

public class Empleado {
    String nombre;
    String cargo;
    double salario;

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    void mostrarDetalles() {
        System.out.println("Empleado: " + nombre + " | Cargo: " + cargo + " | Salario: $" + salario);
    }

    public static void main(String[] args) {
        Empleado emp = new Empleado("Roberto Gómez", "Analista", 3200000);
        emp.mostrarDetalles();

        /*
          Argumentación POO vs Procedural (Ejercicio 41):
          Modelar Empleado mediante POO agrupa sus datos (nombre, cargo, salario) y sus
          comportamientos en una sola entidad. En programación procedural, tendríamos
         variables y funciones sueltas, lo cual dificulta la mantenibilidad al escalar el sistema.
         */
    }
}