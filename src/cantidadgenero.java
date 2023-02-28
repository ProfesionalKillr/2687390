import java.util.Scanner;
public class cantidadgenero {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        String cantidad;
        int men=0;
        for (int x=1;x<=10;x++)
        {
        System.out.println("¿Es Hombre o Mujer?:");
        cantidad=leer.next();
        if(cantidad.equalsIgnoreCase("hombre")){
            men=men+1;
        }
        }
        System.out.println("La cantidad de hombres es: " + men + " y la cantidad de mujeres es " + (10-men));
        leer.close();
    }
}
