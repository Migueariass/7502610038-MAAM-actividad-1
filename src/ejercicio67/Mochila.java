package ejercicio67;

public class Mochila {
    String marca;
    String color;
    int capacidadLitros;
    boolean estaLlena;

    public Mochila(String marca, String color, int capacidadLitros) {
        this.marca = marca;
        this.color = color;
        this.capacidadLitros = capacidadLitros;
        this.estaLlena = false;
    }

    public void guardarObjetos() {
        this.estaLlena = true;
        System.out.println("Guardando cuadernos y portátil en la mochila " + marca + " " + color);
    }

    public void mostrarEstado() {
        System.out.println("Mochila " + marca + " | Capacidad: " + capacidadLitros + "L | Estado: " + (estaLlena ? "Llena" : "Vacía"));
    }

    public static void main(String[] args) {
        Mochila miMochila = new Mochila("Totto", "Negro", 25);
        miMochila.mostrarEstado();
        miMochila.guardarObjetos();
        miMochila.mostrarEstado();
    }
}