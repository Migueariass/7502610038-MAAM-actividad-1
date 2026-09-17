package ejercicio53;

public class Reserva {
    String nombreCliente;
    String fecha;
    boolean activa;

    public Reserva(String nombreCliente, String fecha) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = false;
    }

    public void confirmar() {
        activa = true;
        System.out.println("Reserva de " + nombreCliente + " para el " + fecha + " ha sido CONFIRMADA.");
    }

    public void cancelar() {
        activa = false;
        System.out.println("Reserva de " + nombreCliente + " ha sido CANCELADA.");
    }

    public static void main(String[] args) {
        Reserva r = new Reserva("María Gómez", "20/10/2026");
        r.confirmar();
        r.cancelar();
    }
}