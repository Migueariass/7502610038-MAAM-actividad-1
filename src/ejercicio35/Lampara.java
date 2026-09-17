package ejercicio35;

public class Lampara {
    String marca;
    boolean encendida;

    public Lampara(String marca) {
        this.marca = marca;
        this.encendida = false;
    }

    void encender() {
        encendida = true;
        System.out.println("La lámpara " + marca + " ha sido encendida.");
    }

    void apagar() {
        encendida = false;
        System.out.println("La lámpara " + marca + " ha sido apagada.");
    }

    void mostrarEstado() {
        System.out.println("Lámpara " + marca + " | Estado: " + (encendida ? "Encendida" : "Apagada"));
    }

    public static void main(String[] args) {
        Lampara l = new Lampara("Philips");
        l.mostrarEstado();
        l.encender();
        l.mostrarEstado();
        l.apagar();
    }
}