package ejercicio18;

public class Mascota {
    String nombre;
    int edad;

    void cumplirAnios() {
        edad++;
        System.out.println("¡Feliz cumpleaños " + nombre + "! Ahora tiene " + edad + " años.");
    }

    public static void main(String[] args) {
        Mascota m = new Mascota();
        m.nombre = "Firulais";
        m.edad = 4;
        m.cumplirAnios();
    }
}