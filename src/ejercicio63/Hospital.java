package ejercicio63;

/*
 * DISEÑO PREVIO (Parte K):
 * 1. Atributos: nombre (String), camasDisponibles (int), nivelAtencion (int)
 * 2. Métodos: ingresarPaciente(), darAlta(), consultarDisponibilidad()
 * 3. Objetos reales a construir:
 *    - "Hospital San José", Camas: 120, Nivel: 3
 *    - "Clínica del Norte", Camas: 45, Nivel: 2
 */

public class Hospital {
    String nombre;
    int camasDisponibles;
    int nivelAtencion;

    public Hospital(String nombre, int camasDisponibles, int nivelAtencion) {
        this.nombre = nombre;
        this.camasDisponibles = camasDisponibles;
        this.nivelAtencion = nivelAtencion;
    }

    public void ingresarPaciente() {
        if (camasDisponibles > 0) {
            camasDisponibles--;
            System.out.println("Paciente ingresado a " + nombre + ". Camas libres: " + camasDisponibles);
        }
    }

    public static void main(String[] args) {
        Hospital h1 = new Hospital("Hospital San José", 120, 3);
        Hospital h2 = new Hospital("Clínica del Norte", 45, 2);
        h1.ingresarPaciente();
        h2.ingresarPaciente();
    }
}