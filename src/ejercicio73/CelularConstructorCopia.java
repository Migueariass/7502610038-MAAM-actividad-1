package ejercicio73;

class CelularConstructorCopia {
    String marca;
    int bateria;

    public CelularConstructorCopia(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
    }

    // Constructor copia
    public CelularConstructorCopia(CelularConstructorCopia otro) {
        this.marca = otro.marca;
        this.bateria = otro.bateria;
    }

    public void mostrarInfo() {
        System.out.println("Celular: " + marca + " | Batería: " + bateria + "%");
    }

    public static void main(String[] args) {
        CelularConstructorCopia original = new CelularConstructorCopia("Xiaomi", 85);
        CelularConstructorCopia copia = new CelularConstructorCopia(original);

        original.mostrarInfo();
        copia.mostrarInfo();
    }
}
