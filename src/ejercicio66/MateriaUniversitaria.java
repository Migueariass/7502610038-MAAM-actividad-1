package ejercicio66;

public class MateriaUniversitaria {
    String nombre;
    String codigo;
    int creditos;
    String profesor;

    public MateriaUniversitaria(String nombre, String codigo, int creditos, String profesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.profesor = profesor;
    }

    public void mostrarFicha() {
        System.out.println("Asignatura: " + nombre + " (" + codigo + ") | Créditos: " + creditos + " | Docente: " + profesor);
    }

    public static void main(String[] args) {
        MateriaUniversitaria materia = new MateriaUniversitaria("Programación Orientada a Objetos", "POO-101", 3, "John Arrieta");
        materia.mostrarFicha();
    }
}
