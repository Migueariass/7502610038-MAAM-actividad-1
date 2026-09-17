package ejercicio48;

/*
 * ERROR ORIGINAL: Declarar un método omitiendo el tipo de retorno o void.
 * MENSAJE DE ERROR: "invalid method declaration; return type required"
 * EXPLICACIÓN: En Java, cada método debe especificar qué tipo de dato devuelve o usar 'void' si no retorna nada.
 */

public class Calculadora {

    int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Resultado: " + calc.sumar(8, 12));
    }
}