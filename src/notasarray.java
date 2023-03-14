import java.util.Scanner;
public class notasarray {
    public static void main(String[]args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Digite la cantidad de notas");
        int total,c = leer.nextInt();
        float notas[] = new float [c];
        for (c=0;c<notas.length;c++){
            System.out.println("Digite las notas:");
            notas[c]=leer.nextFloat();
        }
        total = (int) (notas[c]+notas[c])/c;
        
        if(total<=3.0){
            System.out.println("Reprobaste");
        }
        else if(total>=3.0 && total<=4.0){
            System.out.println("Pasaste raspando");
        }
        else if(total>4.0){
            System.out.println("Aprovaste con buenos resultados");
        }
        leer.close();
    }
    
}
