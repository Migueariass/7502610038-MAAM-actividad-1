package ejercicio45;

/*
 * ERROR ORIGINAL: Método definido fuera de la clase.
 * MENSAJE DE ERROR: "class, interface, enum, or record expected"
 * EXPLICACIÓN: En Java, todo método debe residir dentro de los bloques {} de la clase.
 */

public class Persona {
    String nombre;

    // Corrección: Método ubicado dentro del cuerpo de la clase Persona
    void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Andrea";
        p.saludar();
    }
}