
import java.util.Random;
import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner (System.in);
        Random aleatorio=new Random ();
        boolean cara_cruz;
        String opcion;
        System.out.println("digite cara o sello");
        opcion=lectura.nextLine();
        cara_cruz=aleatorio.nextBoolean();
        lectura.close();
        if(opcion.equals("cara")&& cara_cruz==true){
            System.out.println("Usted ha ganado al escoger cara");
        }
        else if (opcion.equals("sello") && cara_cruz==false){
            System.out.println("Usted ha ganado al escoger sello");
        }
        else{
            System.out.println("Usted ha perdido");
        }
    }
}
