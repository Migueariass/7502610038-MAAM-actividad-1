package ejercicio31;

class Vehiculo {
    String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }
}

class Coche extends Vehiculo {
    int numeroPuertas;

    public Coche(String marca, int numeroPuertas) {
        super(marca);
        this.numeroPuertas = numeroPuertas;
    }

    void mostrarDetalles() {
        System.out.println("Marca: " + marca + " | Puertas: " + numeroPuertas);
    }

    public static void main(String[] args) {
        Coche c = new Coche("Chevrolet", 4);
        c.mostrarDetalles();
    }
}