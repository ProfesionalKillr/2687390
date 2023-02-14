import java.util.Scanner;
public class todoa10 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
        double CantidadPedida;
        System.out.println("Digite la cantidad de productos que va a pedir: ");
        CantidadPedida= lectura.nextDouble();
        double ValorTotal= CantidadPedida*10000;
        double Dinero;
        System.out.println("La cantidad total fue: " + ValorTotal + " Con que cantidad va a pagar? ");
        Dinero= lectura.nextDouble();
        double ElCambio = Dinero-ValorTotal;
        System.out.println("Su Cambio es: " + ElCambio);
        lectura.close();
    }
}
