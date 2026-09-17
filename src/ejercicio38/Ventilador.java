package ejercicio38;

package ejercicio38;

public class Ventilador {
    String marca;
    int velocidad;
    boolean encendido;

    public Ventilador(String marca) {
        this.marca = marca;
        this.velocidad = 0;
        this.encendido = false;
    }

    void encender() {
        encendido = true;
        velocidad = 1;
        System.out.println("Ventilador " + marca + " encendido en velocidad " + velocidad);
    }

    void apagar() {
        encendido = false;
        velocidad = 0;
        System.out.println("Ventilador " + marca + " apagado.");
    }

    void subirVelocidad() {
        if (encendido) {
            velocidad++;
            System.out.println("Velocidad aumentada a: " + velocidad);
        } else {
            System.out.println("El ventilador está apagado.");
        }
    }

    public static void main(String[] args) {
        Ventilador v = new Ventilador("Samurai");
        v.encender();
        v.subirVelocidad();
        v.apagar();
    }
}