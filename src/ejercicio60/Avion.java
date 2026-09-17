package ejercicio60;

public class Avion {
    String aerolinea;
    String destino;
    int pasajeros;

    public Avion(String aerolinea, String destino) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = 0;
    }

    public void abordar(int cantidad) {
        pasajeros += cantidad;
        System.out.println("Abordaron " + cantidad + " pasajeros con destino a " + destino + ". Total a bordo: " + pasajeros);
    }

    public static void main(String[] args) {
        Avion av = new Avion("Avianca", "Bogotá");
        av.abordar(45);
        av.abordar(30);
    }
}
