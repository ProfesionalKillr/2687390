import java.util.Scanner;
public class reto2 {
    public static void main(String[]args) {
        Scanner leer=new Scanner(System.in);
        double Pesobebe,dosisvacuna;
        int Mesesbebe;
        System.out.println("Digite cuantos meses tiene el bebe: Recuerde que tiene que tener menos de 12");
        Mesesbebe=leer.nextInt();
        System.out.println("Digite el peso del bebe:");
        Pesobebe=leer.nextDouble();
        dosisvacuna= (Pesobebe+10)/(Mesesbebe*10)*8;
        System.out.println("La dosis de vacuna del bebe es: " + dosisvacuna);
        leer.close();
    }
}
