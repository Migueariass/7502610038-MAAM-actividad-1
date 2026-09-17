package ejercicio40;

public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    void hacerSonido() {
        System.out.println(nombre + " está haciendo un sonido característico de su especie (" + especie + ").");
    }

    void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años.");
    }

    public static void main(String[] args) {
        Mascota m = new Mascota("Firulais", "Perro", 3);
        m.hacerSonido();
        m.cumplirAnios();
    }
}