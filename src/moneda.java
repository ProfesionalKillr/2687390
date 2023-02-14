import java.util.Scanner;
import java.util.Random;
public class moneda {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Cara o Sello:");
        lectura.nextInt();
        lectura.close();
        Random numAleatorio = new Random();
        boolean moneda = numAleatorio.nextBoolean();
        if (moneda) {
            System.out.println("Cara");
        } else {
            System.out.println("Sello");
        }
        
    }
}