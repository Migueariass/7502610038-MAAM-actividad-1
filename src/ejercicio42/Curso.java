package ejercicio42;

public class Curso {
    String nombre;
    String codigo;
    int creditos;

    public Curso(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    void mostrarCurso() {
        System.out.println("Curso: " + nombre + " | Código: " + codigo + " | Créditos: " + creditos);
    }

    public static void main(String[] args) {
        Curso c1 = new Curso("POO", "INF101", 3);
        Curso c2 = new Curso("Bases de Datos", "INF102", 4);

        c1.mostrarCurso();
        c2.mostrarCurso();

        /*
         * Argumentación de Objetos y Clases (Ejercicio 42):
         * Ambos objetos pertenecen a la clase 'Curso' porque comparten la misma estructura de
         * atributos y métodos. Se diferencian por el estado de sus atributos en memoria RAM.
         */
    }
}