import java.util.Scanner;
public class reto5 {
    public static void main(String[]args) {
        Scanner leer=new Scanner (System.in);
        String Nombre,Apellido,nombrecompleto;
        System.out.println("Escriba su Nombre:");
        Nombre=leer.next();
        System.out.println("Escriba su Apellido:");
        Apellido=leer.next();
        nombrecompleto=Nombre+Apellido;    
        System.out.println("Longitud del nombre: " + Nombre.length());           
        System.out.println("Longitud del apellido : " + Apellido.length()); 
        System.out.println("El nombre en mayusculas:" + Nombre.toLowerCase());           
        System.out.println("El apellido en minusculas:" + Apellido.toUpperCase());
        System.out.println("El nombre completo es: " + nombrecompleto); 
        System.out.println(Nombre.substring(0,2)+Apellido);
        leer.close();
    }
}
