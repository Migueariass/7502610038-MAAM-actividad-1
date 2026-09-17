package ejercicio61;

/*
 * DISEÑO PREVIO (Parte K):
 * 1. Atributos: nombre (String), especialidad (String), horasDictadas (int)
 * 2. Métodos: dictarClase(), registrarHoras(), mostrarInformacion()
 * 3. Objetos reales a construir:
 *    - "John Arrieta", Especialidad: "POO", Horas: 40
 *    - "Maria Perez", Especialidad: "Bases de Datos", Horas: 30
 */

public class Docente {
    String nombre;
    String especialidad;
    int horasDictadas;

    public Docente(String nombre, String especialidad, int horasDictadas) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horasDictadas = horasDictadas;
    }

    public void dictarClase() {
        System.out.println("El docente " + nombre + " está impartiendo la clase de " + especialidad);
    }

    public static void main(String[] args) {
        Docente d1 = new Docente("John Arrieta", "POO", 40);
        Docente d2 = new Docente("Maria Perez", "Bases de Datos", 30);
        d1.dictarClase();
        d2.dictarClase();
    }
}
