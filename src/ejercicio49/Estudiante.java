package ejercicio49;

/*
 * ERROR ORIGINAL: Intentar acceder a atributos de otro objeto sin contar con una referencia explícita a este.
 * EXPLICACIÓN: Para que un objeto pueda inspeccionar los datos de otro, debe recibirlo como parámetro en el método.
 */

public class Estudiante {
    String nombre;
    double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Corrección: Se pasa el objeto 'otro' como parámetro para acceder a sus atributos de forma segura
    public void compararNota(Estudiante otro) {
        if (this.nota > otro.nota) {
            System.out.println(this.nombre + " tiene nota superior a " + otro.nombre);
        } else {
            System.out.println(otro.nombre + " tiene nota mayor o igual que " + this.nombre);
        }
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", 4.5);
        Estudiante e2 = new Estudiante("Carlos", 3.8);
        e1.compararNota(e2);
    }
}
