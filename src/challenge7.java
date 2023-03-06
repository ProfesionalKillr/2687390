import java.util.Scanner;
public class challenge7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double purchaseValue, discount, finalValue;
        String ballColor;
        System.out.print("Ingrese el valor de la compra: ");
        purchaseValue  = sc.nextDouble();
        if (purchaseValue  > 50000) {
            System.out.print("Ingrese el color de la bolita (roja, azul, amarilla o blanca): ");
            ballColor  = sc.next();
            switch (ballColor .toLowerCase()) {
                case "roja":
                discount  = 0.1 * purchaseValue;
                finalValue  = purchaseValue - discount ;
                    System.out.println("¡Felicidades! Obtuvo un descuento del 10%.");
                    System.out.printf("Valor de descuento: %.0f%n", discount );
                    System.out.printf("Valor final a pagar: %.0f%n", finalValue );
                    break;
                case "azul":
                discount  = 0.3 * purchaseValue;
                finalValue  = purchaseValue - discount ;
                    System.out.println("¡Felicidades! Obtuvo un descuento del 30%.");               
                    System.out.printf("Valor de descuento: %.0f%n", discount );
                    System.out.printf("Valor final a pagar: %.0f%n", finalValue );
                    break;
                case "amarilla":
                discount  = 0.5 * purchaseValue;
                finalValue  = purchaseValue - discount ;
                    System.out.println("¡Felicidades! Obtuvo un descuento del 50%.");              
                    System.out.printf("Valor de descuento: %.0f%n", discount );
                    System.out.printf("Valor final a pagar: %.0f%n", finalValue );
                    break;
                case "blanca":
                discount  = purchaseValue;
                finalValue  = 0;
                    System.out.println("¡Felicidades! Su compra ha sido completamente gratis.");
                    System.out.printf("Valor de descuento: %.0f%n", discount );
                    System.out.printf("Valor final a pagar: %.0f%n", finalValue );
                    break;
                default:
                    System.out.println("El color de la bolita ingresado no es válido.");
            }
        } else {
            System.out.println("Lo siento, para poder obtener un descuento, el valor de la compra debe ser mayor a 50.000.");
        }
        sc.close();
    }
}