package ejercicio36;

interface Camara {
    void tomarFoto();
}

interface Reproductor {
    void reproducirMusica();
}

public class Smartphone implements Camara, Reproductor {
    @Override
    public void tomarFoto() {
        System.out.println("Tomando foto con la cámara del teléfono...");
    }

    @Override
    public void reproducirMusica() {
        System.out.println("Reproduciendo canción...");
    }

    public static void main(String[] args) {
        Smartphone sp = new Smartphone();
        sp.tomarFoto();
        sp.reproducirMusica();
    }
}