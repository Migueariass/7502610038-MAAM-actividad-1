package ejercicio29;

class Persona {
    String nombre;
    int edad;
}

class Empleado extends Persona {
    double salario;

    void mostrarInfoEmpleado() {
        System.out.println("Empleado: " + nombre + " | Edad: " + edad + " | Salario: $" + salario);
    }

    public static void main(String[] args) {
        Empleado emp = new Empleado();
        emp.nombre = "Carlos";
        emp.edad = 30;
        emp.salario = 2500000;
        emp.mostrarInfoEmpleado();
    }
}