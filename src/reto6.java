import java.util.Random;
import java.util.Scanner;
public class reto6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido presione Enter para lanzar los dados:");
        entrada.nextLine();
        Random aleatorio = new Random();
        int dado1 = aleatorio.nextInt(6) + 1;
        int dado2 = aleatorio.nextInt(6) + 1;
        int suma = dado1 + dado2;
        System.out.printf("Ha obtenido un %d y un %d, lo que suma %d.%n", dado1, dado2, suma);
        if (suma == 2 || suma == 12) {
            System.out.println("¡Ha perdido!");
        } else if (suma == 3 || suma == 11) {
            System.out.println("¡Ha ganado!");
        } else if (dado1 == 1 && dado2 == 1) {
            System.out.println("¡Ha ganado!");
        } else if (suma == 7) {
            System.out.println("¡Ha ganado!");
        } else {
            System.out.println("¡Ha perdido!");
        }
        entrada.close();
    }
}