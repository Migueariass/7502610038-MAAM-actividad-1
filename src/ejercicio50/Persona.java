package ejercicio50;

/*
 * ERROR ORIGINAL: Definir la clase con sus atributos y métodos, pero no instanciar el objeto con 'new' dentro de main.
 * EXPLICACIÓN: Para ejecutar la lógica de la clase, se debe crear una instancia viva en la memoria mediante el operador 'new'.
 */

public class Persona {
    String nombre;

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    public static void main(String[] args) {
        // Corrección: Construcción del objeto en memoria usando 'new Persona()'
        Persona p = new Persona();
        p.nombre = "Laura";
        p.saludar();
    }
}