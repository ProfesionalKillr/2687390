import java.util.Scanner;
public class reto1 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
        double gf;
        System.out.println("Digite los grados fahrenheit a convertir a celcius:");
        gf= lectura.nextInt();
        double gc = (gf-32)/1.8;
        System.out.println("El resultado es : " + gc);
        lectura.close();
    }
}