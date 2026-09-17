package ejercicio71;

public class ConstructorParametros {
    String nombre;
    int edad;

    // Constructor explícito con parámetros
    public ConstructorParametros(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarPersona() {
        System.out.println("Persona: " + nombre + " | Edad: " + edad + " años");
    }

    public static void main(String[] args) {
        ConstructorParametros p = new ConstructorParametros("Esteban", 20);
        p.mostrarPersona();
    }
}