package ejercicio65;

/*
 * DISEÑO PREVIO (Parte K):
 * 1. Atributos: nombre (String), ciudad (String), puntos (int)
 * 2. Métodos: ganarPartido(), empatarPartido(), mostrarTabla()
 * 3. Objetos reales a construir:
 *    - "Real Cartagena", Ciudad: "Cartagena", Puntos: 15
 *    - "Junior", Ciudad: "Barranquilla", Puntos: 20
 */

public class EquipoDeFutbol {
    String nombre;
    String ciudad;
    int puntos;

    public EquipoDeFutbol(String nombre, String ciudad, int puntos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
    }

    public void ganarPartido() {
        puntos += 3;
        System.out.println(nombre + " ganó el partido. Puntos acumulados: " + puntos);
    }

    public static void main(String[] args) {
        EquipoDeFutbol eq1 = new EquipoDeFutbol("Real Cartagena", "Cartagena", 15);
        EquipoDeFutbol eq2 = new EquipoDeFutbol("Junior", "Barranquilla", 20);
        eq1.ganarPartido();
        eq2.ganarPartido();
    }
}