package ejercicio39;

enum EstadoPedido {
    PENDIENTE, PROCESANDO, ENVIADO, ENTREGADO
}

public class Pedido {
    EstadoPedido estado;

    public Pedido() {
        this.estado = EstadoPedido.PENDIENTE;
    }

    void actualizarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El estado del pedido cambió a: " + estado);
    }

    public static void main(String[] args) {
        Pedido p = new Pedido();
        p.actualizarEstado(EstadoPedido.ENVIADO);
    }
}