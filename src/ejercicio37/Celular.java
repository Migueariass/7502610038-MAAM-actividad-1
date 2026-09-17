package ejercicio37;

public class Celular {
    String marca;
    int bateria;
    boolean prendido;

    public Celular(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
        this.prendido = false;
    }

    void encender() {
        if (bateria > 0) {
            prendido = true;
            System.out.println("El celular " + marca + " se ha encendido.");
        } else {
            System.out.println("Sin batería para encender el celular " + marca + ".");
        }
    }

    void apagar() {
        prendido = false;
        System.out.println("El celular " + marca + " se ha apagado.");
    }

    void cargarBateria(int cantidad) {
        bateria += cantidad;
        if (bateria > 100) bateria = 100;
        System.out.println("Celular " + marca + " cargado. Batería actual: " + bateria + "%");
    }

    public static void main(String[] args) {
        Celular c = new Celular("Samsung", 15);
        c.encender();
        c.cargarBateria(30);
        c.apagar();
    }
}