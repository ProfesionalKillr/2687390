import java.util.Random;
import java.util.Scanner;
public class challenge3 {
    public static void main(String[] args) throws Exception {
        Scanner input =new Scanner (System.in);
        Random random =new Random ();
        boolean headsOrTails;
        String option;
        System.out.println("digite cara o sello");
        option=input .nextLine();
        headsOrTails=random .nextBoolean();
        input .close();
        if(option.equals("cara")&& headsOrTails==true){
            System.out.println("Usted ha ganado al escoger cara");
        }
        else if (option.equals("sello") && headsOrTails==false){
            System.out.println("Usted ha ganado al escoger sello");
        }
        else{
            System.out.println("Usted ha perdido");
        }
    }
}
