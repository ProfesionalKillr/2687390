import java.util.Scanner;
public class anidacion {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
        Double num1;
        System.out.println("Digite un numero:");
        num1 = lectura.nextDouble();
        if (num1 > 0)
        {
            System.out.println("El numero " + num1 + " es positivo");
        }
        else if(num1 == 0)
        {
            System.out.println("El numero " + num1 + " es neutro");
        }
        else 
        {
            System.out.println("El numero " + num1 + " es negativo");

        }
        lectura.close();
}
}