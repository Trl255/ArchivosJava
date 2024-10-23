package Arrays;
import java.util.Scanner;
public class Examen_2_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int z=0;
        System.out.println("Introduzca la cantidad de valores a introducir");
        z=sc.nextInt();
        int arry[]=new int [z];
        numeros(arry);
        reves(arry);
            
        
    }    static void numeros(int [] pet){
        
        Scanner sc=new Scanner(System.in);
        for (int x=0; x<pet.length; x++){
            System.out.println("Introduzca el valor "+(x+1));
            pet[x]=sc.nextInt();
            }
    }static void reves(int []pet){
        for (int i=0; i<pet.length; i++){
            for (int y=i+1; y<pet.length; y++){
                int aux=0;
                aux=pet[i];
                pet[i]=pet[y];
                pet[y]=aux;
                
            }System.out.println(""+pet[i]);
        }
    }
}
