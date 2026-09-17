package ejercicio37;

interface Instrumento {
    void tocar();
}

public class Guitarra implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando acordes de guitarra...");
    }

    public static void main(String[] args) {
        Instrumento miInstrumento = new Guitarra();
        miInstrumento.tocar();
    }
}