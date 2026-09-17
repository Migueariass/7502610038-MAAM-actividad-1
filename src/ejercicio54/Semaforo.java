package ejercicio54;

public class Semaforo {
    String colorActual;

    public Semaforo() {
        this.colorActual = "Rojo";
    }

    public void cambiarColor(String nuevoColor) {
        this.colorActual = nuevoColor;
        System.out.println("El semáforo ha cambiado a color: " + colorActual);
    }

    public static void main(String[] args) {
        Semaforo s = new Semaforo();
        s.cambiarColor("Verde");
        s.cambiarColor("Amarillo");
        s.cambiarColor("Rojo");
    }
}