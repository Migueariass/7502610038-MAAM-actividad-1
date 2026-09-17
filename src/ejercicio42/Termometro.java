package ejercicio42;

public class Termometro {
    double temperaturaCelsius;

    public Termometro(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    double convertirAFahrenheit() {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    double convertirAKelvin() {
        return temperaturaCelsius + 273.15;
    }

    void mostrarTemperaturas() {
        System.out.println("Celsius: " + temperaturaCelsius + " °C");
        System.out.println("Fahrenheit: " + convertirAFahrenheit() + " °F");
        System.out.println("Kelvin: " + convertirAKelvin() + " K");
    }

    public static void main(String[] args) {
        Termometro t = new Termometro(25.0);
        t.mostrarTemperaturas();
    }
}