import java.util.Scanner;
public class challenge2 {
    public static void main(String[]args) {
        Scanner input =new Scanner(System.in);
        double babyWeight,vaccineDose;
        int babyMonths;
        System.out.println("Digite cuantos meses tiene el bebe: Recuerde que tiene que tener menos de 12");
        babyMonths=input.nextInt();
        System.out.println("Digite el peso del bebe:");
        babyWeight=input.nextDouble();
        vaccineDose= (babyWeight+10)/(babyMonths*10)*8;
        System.out.println("La dosis de vacuna del bebe es: " + vaccineDose);
        input.close();
    }
}
