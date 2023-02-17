import java.util.Scanner;
public class usuarioycontraseña {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        String usuario, contraseña;
        System.out.println("Escriba su usuario:");
        usuario=lectura.next();
        System.out.println("Escriba su contraseña:");
        contraseña=lectura.next();
        if (usuario.equals("Santiago") && contraseña.equals("santi123"))
        {
            System.out.println("Bienvenido al SI");
        }
        else if (usuario.equals("Santiago") && contraseña!="santi123")
        {
            System.out.println("Parece que olvidaste tus credenciales de acceso");
        }
        else if (usuario!=("Santiago") && contraseña.equals("santi123"))
        {
            System.out.println("Algo paso con tus datos de acceso");
        }
        else
        {
            System.out.println("Acceso Denegado");
        }
        lectura.close();
    }
}
