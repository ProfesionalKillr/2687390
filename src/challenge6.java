import java.util.Random;
import java.util.Scanner;
public class challenge6 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Bienvenido presione Enter para lanzar los dados:");
        input .nextLine();
        Random random  = new Random();
        int dice1  = random .nextInt(6) + 1;
        int dice2  = random .nextInt(6) + 1;
        int sum  = dice1  + dice2 ;
        System.out.printf("Ha obtenido un %d y un %d, lo que suma %d.%n", dice1, dice2, sum );
        if (sum  == 2 || sum  == 12) {
            System.out.println("¡Ha perdido!");
        } else if (sum  == 3 || sum  == 11) {
            System.out.println("¡Ha ganado!");
        } else if (dice1  == 1 && dice2  == 1) {
            System.out.println("¡Ha ganado!");
        } else if (sum  == 7) {
            System.out.println("¡Ha ganado!");
        } else {
            System.out.println("¡Ha perdido!");
        }
        input .close();
    }
}