import java.util.Random;
public class reto7 {
    public static void main(String[] args) {
        double totalCompra = 60000; 
        double descuento = 0;
        double valorFinal = 0;
        if (totalCompra > 50000) {
            int bolita = new Random().nextInt(4) + 1;
            switch (bolita) {
                case 1:
                    descuento = totalCompra * 0.1;
                    valorFinal = totalCompra - descuento;
                    System.out.println("¡Felicitaciones! Obtuvo una bolita roja y su descuento es del 10%. Valor final a pagar: " + valorFinal);
                    break;
                case 2:
                    descuento = totalCompra * 0.3;
                    valorFinal = totalCompra - descuento;
                    System.out.println("¡Felicitaciones! Obtuvo una bolita azul y su descuento es del 30%. Valor final a pagar: " + valorFinal);
                    break;
                case 3:
                    descuento = totalCompra * 0.5;
                    valorFinal = totalCompra - descuento;
                    System.out.println("¡Felicitaciones! Obtuvo una bolita amarilla y su descuento es del 50%. Valor final a pagar: " + valorFinal);
                    break;
                case 4:
                    descuento = totalCompra;
                    valorFinal = 0;
                    System.out.println("¡Felicitaciones! Obtuvo una bolita blanca y su compra es gratis. Valor final a pagar: " + valorFinal);
                    break;
                default:
                    System.out.println("Ha ocurrido un error.");
                    break;
            }
        } else {
            System.out.println("Lo siento, su compra debe ser mayor a 50.000 para poder beneficiarse de la promoción de aniversario.");
        }
    }
}