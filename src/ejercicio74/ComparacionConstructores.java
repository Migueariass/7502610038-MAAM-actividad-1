package ejercicio74;

public class ComparacionConstructores {
    public static void main(String[] args) {
        /*
         * COMPARACIÓN ARGUMENTADA DE CONSTRUCTORES:
         * 1. Constructor por Defecto (Sin Parámetros): Inicializa campos con valores nulos o 0.
         *    - Ventaja: Sencillo de invocar.
         *    - Desventaja: Deja el objeto en un estado incompleto o indeterminado.
         *
         * 2. Constructor Parametrizado: Recibe datos directos al instanciar.
         *    - Ventaja: Garantiza la integridad del objeto desde el instante de su creación.
         *
         * 3. Constructor Copia: Clona los atributos de una instancia previa en un objeto nuevo.
         *    - Ventaja: Duplica instancias de forma independiente en memoria sin compartir referencias.
         *
         * VERDICTO PARA PRINCIPIANTES:
         * El "Constructor Parametrizado" es la opción más clara para principiantes, pues conecta
         * de manera directa la definición de la clase con la necesidad real de darle valores a los
         * atributos al momento de invocar el operador 'new'.
         */
        System.out.println("Análisis comparativo de constructores completado exitosamente.");
    }
}