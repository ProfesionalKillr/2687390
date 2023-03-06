import java.util.Scanner;
public class challenge8 {
    public static void main(String[] args) {
        final int WHITE_BALL_DISCOUNT  = 10;
        final int GREEN_BALL_DISCOUNT  = 20;
        final int BLUE_BALL_DISCOUNT  = 50;
        int ball, price, quantity,total, subtotal = 0;
        double discount  = 0, amountPaid, change;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos a comprar: ");
        int numProducts  = scanner.nextInt();
        for (int i = 1; i <= numProducts ; i++) {
            System.out.println("Producto #" + i);
            System.out.print("Ingrese el precio del producto: ");
            price  = scanner.nextInt();
            System.out.print("Ingrese la cantidad del producto: ");
            quantity  = scanner.nextInt();
            subtotal += price  * quantity;
        }
        ball  = (int) (Math.random() * 6) + 1;
        switch (ball) {
            case 1:
            case 2:
            case 3:
            discount  = WHITE_BALL_DISCOUNT ;
                break;
            case 4:
            case 5:
            discount  = GREEN_BALL_DISCOUNT ;
                break;
            case 6:
            discount  = BLUE_BALL_DISCOUNT ;
                break;
        }
        total = subtotal - (int) discount ;
        System.out.println("Usted ha obtenido un descuento de " + discount  + " colones.");
        System.out.println("El total a pagar es de " + total + " colones.");
        System.out.print("Ingrese el valor con el que desea pagar: ");
        amountPaid  = scanner.nextDouble();
        change  = amountPaid  - total;
        System.out.println("Su cambio es de " + change  + " colones.");
        scanner.close();
    }
}