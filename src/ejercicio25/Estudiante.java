package ejercicio25;

public class Estudiante {
    private String nombre;
    private double notaFinal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        est.setNombre("Mariana");
        est.setNotaFinal(4.5);

        System.out.println("Estudiante: " + est.getNombre() + " | Nota Final: " + est.getNotaFinal());
    }
}
