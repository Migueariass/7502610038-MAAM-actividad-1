package ejercicio43;

public class Computador {
    String marca;
    String procesador;
    int ramGB;

    public Computador(String marca, String procesador, int ramGB) {
        this.marca = marca;
        this.procesador = procesador;
        this.ramGB = ramGB;
    }

    void mostrarInfo() {
        System.out.println("Computador " + marca + " | CPU: " + procesador + " | RAM: " + ramGB + "GB");
    }

    public static void main(String[] args) {
        Computador pc = new Computador("Dell", "Intel i7", 16);
        pc.mostrarInfo();

        /*
         * Explicación Conceptual (Ejercicio 43):
         * La clase 'Computador' es la plantilla teórica que no ocupa memoria de datos.
         * El objeto 'pc' es la instancia concreta que existe en memoria con valores definidos.
         */
    }
}