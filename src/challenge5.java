import java.util.Scanner;
public class challenge5 {
    public static void main(String[]args) {
        Scanner leer=new Scanner (System.in);
        String firstName,lastName,fullName;
        System.out.println("Escriba su Nombre:");
        firstName=leer.next();
        System.out.println("Escriba su Apellido:");
        lastName=leer.next();
        fullName=firstName+lastName;    
        System.out.println("Longitud del nombre: " + firstName.length());           
        System.out.println("Longitud del apellido : " + lastName.length()); 
        System.out.println("El nombre en mayusculas:" + firstName.toLowerCase());           
        System.out.println("El apellido en minusculas:" + lastName.toUpperCase());
        System.out.println("El nombre completo es: " + fullName); 
        System.out.println(firstName.substring(0,2)+lastName);
        leer.close();
    }
}
