package ejercicio46;

/*
 * ERROR ORIGINAL: Omisión del nombre de la clase (public class { ... }).
 * MENSAJE DE ERROR: "<identifier> expected"
 * EXPLICACIÓN: Java exige asignar un nombre válido a la clase inmediatamente después de la palabra 'class'.
 */

public class Estudiante {
    String nombre;
    String codigo;

    void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo);
    }

    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.nombre = "Juan";
        e.codigo = "1001";
        e.mostrarInfo();
    }
}