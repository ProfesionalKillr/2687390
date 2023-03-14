import java.util.Scanner;
public class MisArrays {
    public static void main(String[]args) {
        //Declaracion e inicializacion de un array
        int[] vector1;
        vector1=new int[10];
        //int [] vector1=new int[10];
        //Rellenar vector
        int [] vector={30,50,25,85,12,6,32,41,23,63};
        vector1[6]=32;
        //Mostrar los datos del array con for
        /*for(int p=0;p<vector.length;p++){
            System.out.print(vector[p]+" ");
        }*/
        //Mostrar datos del arrar con for mejorado
        for(int i : vector){
            System.out.println(i);
        }
        Scanner leer=new Scanner(System.in);
        //rellenar un array de forma dinamica
        for(int p=0;p<vector.length;p++){
            System.out.print("Digite el dato de la posicion" + p);
            vector1[p]=leer.nextInt();
        }
        for(int i : vector){
            System.out.println(i);
        }
        leer.close();
    }
}
