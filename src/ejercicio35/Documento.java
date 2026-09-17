package ejercicio35;

interface Imprimible {
    void imprimir();
}

public class Documento implements Imprimible {
    String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento: " + contenido);
    }

    public static void main(String[] args) {
        Documento doc = new Documento("Informe Final POO");
        doc.imprimir();
    }
}