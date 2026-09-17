package ejercicio59;

public class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    public UsuarioSistema(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = true;
    }

    public void activar() {
        activo = true;
        System.out.println("El usuario " + nombreUsuario + " ha sido ACTIVADO.");
    }

    public void desactivar() {
        activo = false;
        System.out.println("El usuario " + nombreUsuario + " ha sido DESACTIVADO.");
    }

    public static void main(String[] args) {
        UsuarioSistema usr = new UsuarioSistema("jjarrieta", "sec123");
        usr.desactivar();
        usr.activar();
    }
}