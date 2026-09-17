package ejercicio30;

class Perro {
    void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
}

public class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }

    public static void main(String[] args) {
        Perro p = new Perro();
        p.hacerSonido();
    }
}