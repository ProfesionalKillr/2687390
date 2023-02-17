import java.util.Scanner;
public class promedio {
    public static void main (String[] args) {
        Scanner lectura = new Scanner (System.in);
        double Nota1,Nota2,Nota3,P_Asistencia;
        System.out.println("Digite la primera nota: ");
        Nota1 = lectura.nextDouble();
        System.out.println("Digite la segunda nota: ");
        Nota2 = lectura.nextDouble();
        System.out.println("Digite la tercera nota: ");
        Nota3 = lectura.nextDouble();
        System.out.println("Ahora digite el promedio de asistencia: ");
        double P_notas=Nota1+Nota2+Nota3/3;
        P_Asistencia = lectura.nextDouble();
        if ( P_notas>=35 && P_Asistencia>=70 )
        {
            System.out.println("Aprobo :D!");
        }
        else {
            System.out.println("No Aprobo D:");
        }
        lectura.close();
    }
}