package ejercicio47;

/*
 * ERROR ORIGINAL: Manipular una variable de tipo objeto sin haberla instanciado.
 * MENSAJE DE ERROR: "variable miAuto might not have been initialized" / NullPointerException
 * EXPLICACIÓN: Es indispensable reservar memoria con el operador 'new' antes de acceder a sus miembros.
 */

public class Auto {
    String marca;

    public static void main(String[] args) {
        Auto miAuto = new Auto();
        miAuto.marca = "Toyota";
        System.out.println("Marca del auto: " + miAuto.marca);
    }
}