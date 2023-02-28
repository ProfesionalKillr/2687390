import java.util.Scanner;
public class promedionotas {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        Double Nota1,Nota2,Nota3,Nota4,Promedio;
        System.out.println("Digite la nota del primer taller:");
        Nota1=leer.nextDouble();
        System.out.println("Digite la nota del segundo taller:");
        Nota2=leer.nextDouble();
        System.out.println("Digite la nota del tercer taller:");
        Nota3=leer.nextDouble();
        System.out.println("Digite la nota del cuarto taller:");
        Nota4=leer.nextDouble();
        Promedio = (Nota1+Nota2+Nota3+Nota4)/4;
        if (Promedio <= 29) {
            System.out.println("Reprobaste la asignatura");
        }
        else if (Promedio >= 30 && Promedio<= 40){
            System.out.println("Pasate raspando la asignatura");
        }
        else if (Promedio >40){
            System.out.println("Aprobaste con buenos resultados");
        }
        else{
            System.out.println("Error, vuelva a intentar");
        }
        leer.close();
    }
}
