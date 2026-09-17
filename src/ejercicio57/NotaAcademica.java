package ejercicio57;

public class NotaAcademica {
    String asignatura;
    double nota1;
    double nota2;
    double nota3;

    public NotaAcademica(String asignatura, double nota1, double nota2, double nota3) {
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularDefinitiva() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public void mostrarResumen() {
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Definitiva: " + calcularDefinitiva());
    }

    public static void main(String[] args) {
        NotaAcademica nota = new NotaAcademica("Programación Orientada a Objetos", 4.0, 3.5, 4.5);
        nota.mostrarResumen();
    }
}