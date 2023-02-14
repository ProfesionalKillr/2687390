import java.util.Scanner;
public class sumayresta {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
        Double num1, num2;
        System.out.println("Digite el numero 1:");
        num1 = lectura.nextDouble();
        System.out.println("Digite el numero 2:");
        num2 = lectura.nextDouble();
        if (num1>num2)
        {
            Double resultado1 = num1+num2;
            System.out.println("El resultado es: " + resultado1);
        }
        else 
        {
            Double resultado2 = num1-num2;
            System.out.println("El resultado es: " + resultado2);

        }
        lectura.close();
    }
}
