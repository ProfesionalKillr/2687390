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
        if ( P_notas>=3.5 && P_Asistencia>=70 )
        {
            System.out.println("Su promedio de notas fue :" + P_notas +" Y su porcentaje de asistencia fue: " + P_Asistencia + " Felicitaciones Aprobo!");
        }
        else {
            System.out.println("Su promedio de notas fue :" + P_notas +" Y su porcentaje de asistencia fue: " + P_Asistencia + " Desafortunadamente no Aprobo");
        }
        lectura.close();
    }
}