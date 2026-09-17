package ejercicio44;

public class Paciente {
    String nombre;
    int edad;
    String diagnostico;

    public Paciente(String nombre, int edad, String diagnostico) {
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    void mostrarHistorial() {
        System.out.println("Paciente: " + nombre + " | Edad: " + edad + " | Diagnóstico: " + diagnostico);
    }

    public static void main(String[] args) {
        Paciente p = new Paciente("Carlos M.", 45, "Control General");
        p.mostrarHistorial();

        /*
         * Explicación Conceptual (Ejercicio 44):
         * 'Instanciar' es el proceso técnico de reservar memoria en JVM usando 'new'.
         * 'Crear un paciente' es la abstracción del objeto de la vida real en el dominio del problema.
         */
    }
}
