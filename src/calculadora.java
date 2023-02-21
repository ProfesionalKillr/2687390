import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
    Scanner lectura = new Scanner (System.in);
    int Num1,Num2,Operacion,Total;
    double total1,total2;
    System.out.println("Digite que operacion desea ejecutar 1.Suma 2.Resta 3.Multiplicacion 4.Division 5.Potencia 6.Raiz Cuadrada:");
    Operacion= lectura.nextInt();
    System.out.println("Digite el primer numero: ");
    Num1= lectura.nextInt();
    System.out.println("Digite el segundo numero: ");
    Num2= lectura.nextInt();
    switch (Operacion) {
    case 1:
    Total = Num1+Num2;
    System.out.println("Es resultado de la suma es: " + Total );
    Total=lectura.nextInt();
    break;
    case 2:
    Total = Num1-Num2;
    System.out.println("Es resultado de la resta es: " + Total );
    Total=lectura.nextInt();
    break;
    case 3:
    Total = Num1*Num2;
    System.out.println("Es resultado de la multiplicacion es: " + Total );
    Total=lectura.nextInt();        
    break;
    case 4:
    Total = Num1/Num2;
    System.out.println("Es resultado de la division es: " + Total );  
    Total=lectura.nextInt();      
    break;
    case 5:
    total1 = Math.pow(Num1, Num2);
    System.out.println("Es resultado de la potencia es: " + total1 );   
    total1=lectura.nextDouble();     
    break;
    case 6:
    total1 = Math.pow(Num1,0.5);
    total2 = Math.pow(Num2,0.5);
    System.out.println("Es resultado de la raiz cuadrada del numero 1 es: " + total1 + " Y el resultado de la raiz cuadrada del numero 2 es: " +total2 );
    total1=lectura.nextDouble();
    total2=lectura.nextDouble();
    break;
    default:
    System.out.println("Error, vuelva a intentar");
    break;
    }
    lectura.close();
    }
}
