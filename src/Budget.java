import java.util.Scanner;
public class Budget {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
        double ancho;
        System.out.println("Digite el ancho:");
        ancho= lectura.nextDouble();
        double largo;
        System.out.println("Digite el largo:");
        largo= lectura.nextDouble();
        double area = ancho*largo;
        double presupuesto = area*45000;
        System.out.println("La superficie a cubrir tiene " + ancho + " metros de ancho, " + largo + " metros de largo, con " + area + " metros cuadrados. El presupuesto del proyecto es " + presupuesto);
        lectura.close();
    }
}
