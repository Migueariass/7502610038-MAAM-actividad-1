package ejercicio38;

public class Televisor {
    String marca;
    int canal;
    int volumen;
    boolean encendido;

    public Televisor(String marca) {
        this.marca = marca;
        this.canal = 1;
        this.volumen = 10;
        this.encendido = false;
    }

    void encender() {
        encendido = true;
        System.out.println("Televisor " + marca + " encendido.");
    }

    void apagar() {
        encendido = false;
        System.out.println("Televisor " + marca + " apagado.");
    }

    void cambiarCanal(int nuevoCanal) {
        if (encendido) {
            canal = nuevoCanal;
            System.out.println("Canal cambiado a: " + canal);
        } else {
            System.out.println("El televisor está apagado.");
        }
    }

    public static void main(String[] args) {
        Televisor tv = new Televisor("LG");
        tv.encender();
        tv.cambiarCanal(5);
        tv.apagar();
    }
}