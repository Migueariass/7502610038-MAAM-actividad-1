package ejercicio69;

class Materia {
    String nombre;
    public Materia(String nombre) { this.nombre = nombre; }
}

class Mochila {
    String color;
    public Mochila(String color) { this.color = color; }
}

class Plato {
    String nombre;
    public Plato(String nombre) { this.nombre = nombre; }
}

public class CincoObjetos {
    public static void main(String[] args) {
        // 5 Objetos de Académico
        Materia m1 = new Materia("POO");
        Materia m2 = new Materia("Bases de Datos");
        Materia m3 = new Materia("Calculo I");
        Materia m4 = new Materia("Física General");
        Materia m5 = new Materia("Estructuras de Datos");

        // 5 Objetos de Vida Cotidiana
        Mochila moc1 = new Mochila("Roja");
        Mochila moc2 = new Mochila("Azul");
        Mochila moc3 = new Mochila("Verde");
        Mochila moc4 = new Mochila("Gris");
        Mochila moc5 = new Mochila("Negra");

        // 5 Objetos de Negocio
        Plato p1 = new Plato("Hamburguesa");
        Plato p2 = new Plato("Pizza");
        Plato p3 = new Plato("Lasagna");
        Plato p4 = new Plato("Ensalada Caesar");
        Plato p5 = new Plato("Sopa de Mariscos");

        System.out.println("Instanciación masiva de 15 objetos (5 por cada clase) realizada exitosamente.");
    }
}
