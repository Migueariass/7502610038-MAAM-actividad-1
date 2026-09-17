package ejercicio36;

public class Puerta {
    String material;
    boolean abierta;

    public Puerta(String material) {
        this.material = material;
        this.abierta = false;
    }

    void abrir() {
        abierta = true;
        System.out.println("La puerta de " + material + " se ha abierto.");
    }

    void cerrar() {
        abierta = false;
        System.out.println("La puerta de " + material + " se ha cerrado.");
    }

    void mostrarEstado() {
        System.out.println("Puerta de " + material + " | Estado: " + (abierta ? "Abierta" : "Cerrada"));
    }

    public static void main(String[] args) {
        Puerta p = new Puerta("Madera");
        p.mostrarEstado();
        p.abrir();
        p.mostrarEstado();
        p.cerrar();
    }
}
