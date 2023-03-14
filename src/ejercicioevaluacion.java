import java.util.Scanner;
public class ejercicioevaluacion {
    public static void main(String[]args) {
    Scanner leer = new Scanner(System.in);
    String programa;
    int repetir, adso, redes;
    repetir=1;
    adso=0;
    redes=0;
    while(repetir==1){
        System.out.println("Digite las siglas del programa en el que pertenece (ADSO , REDES): ");
        programa =leer.next();
        System.out.println("Desea repetir? (1.si 2.no): ");   
        repetir =leer.nextInt(); 
    if(programa.equalsIgnoreCase("adso") ){
        adso=adso+1;
    }
    else if(programa.equalsIgnoreCase("redes")){
        redes=redes+1;
    }
    }
    System.out.println("El numero de persona en adso son: " + adso + " Y la cantidad de persona en redes son: " + redes );    
    leer.close();
   }
}
