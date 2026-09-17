package ejercicio39;

public class Automovil {
    String marca;
    String modelo;
    int velocidadActual;

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }

    void acelerar(int incremento) {
        velocidadActual += incremento;
        System.out.println("Acelerando. Velocidad actual: " + velocidadActual + " km/h");
    }

    void frenar(int decremento) {
        velocidadActual -= decremento;
        if (velocidadActual < 0) velocidadActual = 0;
        System.out.println("Frenando. Velocidad actual: " + velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", "Corolla");
        auto.acelerar(40);
        auto.frenar(15);
    }
}