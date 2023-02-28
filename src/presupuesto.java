import java.util.Scanner;
public class presupuesto {
    public static void main(String[]args) {
        Scanner leer= new Scanner(System.in);
        int spent,budget,op,x;
        op=1;
        x=1;
        budget=100000;
        while(op==1 && x<=3){
            System.out.println("Ingrese el gasto");
            spent=leer.nextInt();
            x=x+1;
            budget = budget - spent;
            System.out.println("El gasto fue: " + spent + " y el presupuesto que queda es: " + budget  );
            System.out.println("Desea registrar otro gasto 1.Si 2.No" );
            op=leer.nextInt();
        }
        leer.close();   
    }
}
