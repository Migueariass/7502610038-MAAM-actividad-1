package ejercicio24;

public class Vehiculo {
    String marca;
    int velocidadActual;

    void acelerar() {
        this.velocidadActual += 10;
        System.out.println("Aceleración estándar. Velocidad actual: " + velocidadActual + " km/h");
    }

    void acelerar(int incremento) {
        this.velocidadActual += incremento;
        System.out.println("Aceleración personalizada. Velocidad actual: " + velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        v.marca = "Mazda";
        v.velocidadActual = 30;

        v.acelerar();
        v.acelerar(25);
    }
}
