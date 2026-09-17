package ejercicio21;

public class Persona {
    String nombre;
    int edad;

    boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Juan";
        p.edad = 20;

        if (p.esMayorDeEdad()) {
            System.out.println(p.nombre + " es mayor de edad.");
        } else {
            System.out.println(p.nombre + " es menor de edad.");
        }
    }
}
