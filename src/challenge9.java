import java.util.Scanner;
import java.util.Random;
public class challenge9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int betValue = 10;
        System.out.print("Ingrese la cantidad de dinero que desea apostar en cada jugada: ");
        int roundBet = input.nextInt();
        int moneyWon = 0;
        int numRounds = 0;
        boolean playAgain = true;
        while (playAgain) {
            System.out.print("Ingrese un número entre 1 y 6: ");
            int playerNumber = input.nextInt();
            int randomNum = rand.nextInt(6) + 1;
            if (playerNumber == randomNum) {
                moneyWon += roundBet * 2;
                betValue = roundBet * 2;
                System.out.println("Ganaste! Tu dinero acumulado es: " + moneyWon);
            } else {
                moneyWon -= roundBet;
                betValue = roundBet;
                System.out.println("Perdiste. Tu dinero acumulado es: " + moneyWon);
            }
            numRounds++;
            System.out.print("Deseas seguir jugando? (true/false) ");
            playAgain = input.nextBoolean();
        }
        System.out.println("Jugaste " + numRounds  + " veces y acumulaste " + moneyWon);
        input.close();
    }
}