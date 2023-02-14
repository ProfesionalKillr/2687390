import java.util.Scanner;
public class discoteca {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
        int Edad;
        System.out.println("Ingrese su edad: ");
        Edad = lectura.nextInt();
        if (Edad >= 18)
        {
            System.out.println("Puede entrar a la discoteca");
        }
        else {
            System.out.println("Restringido el paso");
        }
        lectura.close();
    }
}