import java.util.Scanner;
public class challenge4 {
    public static void main(String[]args) {
        Scanner input =new Scanner(System.in);
        int computerSelection  = (int)(Math.random() * 3) + 1;
        System.out.print("Indique su seleccion 1=Piedra, 2=Papel, 3=Tijera: ");
        int userSelection  = input .nextInt();
        System.out.print("La computadora habia escogido: ");
        switch ( computerSelection  )
        {
            case 1:
                System.out.println("Piedra");
                switch ( userSelection  )
                {
                   case 1: 
                   System.out.println("Empate!"); 
                   break;
                   case 2: 
                   System.out.println("Gano!"); 
                   break;
                   case 3: 
                   System.out.println("Perdio"); 
                   break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( userSelection  )
                {
                   case 1: 
                   System.out.println("Perdio"); 
                   break;
                   case 2: 
                   System.out.println("Empate!"); 
                   break;
                   case 3: 
                   System.out.println("Gano!"); 
                   break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( userSelection  )
                {
                   case 1: 
                   System.out.println("Gano!"); 
                   break;
                   case 2: 
                   System.out.println("Perdio"); 
                   break;
                   case 3: 
                   System.out.println("Empate!"); 
                   break;
                }
                break;
        }
        input .close();
    }
}
