package ejercicio32;

class Figura {
    void dibujar() {
        System.out.println("Dibujando una figura genérica.");
    }
}

class lass Circulo extends Figura {
    @Override
    void dibujar() {
        System.out.println("Dibujando un círculo perfecto.");
    }

    public static void main(String[] args) {
        Figura miFigura = new Circulo();
        miFigura.dibujar();
    }
}