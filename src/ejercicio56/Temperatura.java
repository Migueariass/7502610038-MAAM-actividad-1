package ejercicio56;

public class Temperatura {
    double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double convertirAFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Temperatura t = new Temperatura(25.0);
        System.out.println(t.celsius + "°C equivale a " + t.convertirAFahrenheit() + "°F");
    }
}
