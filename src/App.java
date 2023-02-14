import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
        int number1;
        int number2;
        System.out.println("Ingrese dos numeros:");
        number1= lectura.nextInt();
        number2= lectura.nextInt();
        int number3= number1 + number2;
        System.out.println("El numero que ingresaste es:" + number3);
        lectura.nextLine();//limpieza de buffer
        String name;
        System.out.println("Ingrese su nombre");
        name = lectura.nextLine();
        System.out.println("El nombre ingresado fue:" + name);
        lectura.close();
    }
}