import java.util.Scanner;
public class challenge1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        double gradef;
        System.out.println("Digite los grados fahrenheit a convertir a celcius:");
        gradef= input.nextInt();
        double gradec = (gradef-32)/1.8;
        System.out.println("El resultado es : " + gradec);
        input.close();
    }
}