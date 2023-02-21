import java.util.Scanner;
public class ejerciciofor {
    public static void main(String[] args) {
        int precio,cantidad,contador,subtotal,acumulador,billete, vueltas;
        String telefonia;
        contador=0;
        acumulador=0;
        Scanner leer=new Scanner (System.in);
        for(int x=1; x<=5; x++)
        {
            System.out.println("Digite el precio del producto: ");
            precio=leer.nextInt();
            System.out.println("Digite la cantidad del producto: ");
            cantidad=leer.nextInt();
            contador=contador+1;
            subtotal=precio*cantidad;
            acumulador=acumulador+subtotal;
            
        }
        System.out.println("El valor total a pagar es: " + acumulador);
        System.out.println("Billete con el que va a pagar: ");
        billete=leer.nextInt();
        vueltas=billete-acumulador;
        System.out.println("Sus vueltas son: " + vueltas + "¿Cuenta con telefonia movil exito?");
        telefonia=leer.next();
        if (telefonia.equalsIgnoreCase("si")){
            System.out.println("Los minutos adquiridos en su compra son: " + contador);
        }
        else{
            System.out.println("No pierdas mas minutos, adquiere ya tu telefonia movil exito");
        }
        leer.close();
    }
}
