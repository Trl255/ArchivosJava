package Arrays;
/*Que lea 10 números por teclado, los almacene en un array y los ordene de forma ascendente.
 */
import java.util.Scanner;
public class Ejercicio_9 {
    public static void main(String[] args) {
        int numeros[]=new int [10];
        solicitud(numeros);
        ordenar(numeros);
        
    }static void solicitud(int sol []){
        Scanner sc=new Scanner (System.in);
        for (int i=0; i<sol.length; i++){
            System.out.println("Introducir el varlor "+(i+1));
            sol[i]=sc.nextInt();
    }
        
    }static void ordenar (int ord[]){
        for (int x=0; x<ord.length; x++){
            for (int y=x+1; y<ord.length; y++){
                int aux=0;
                if (ord[y]<ord[x]){
                    aux=ord[y];
                    ord[y]=ord[x];
                    ord[x]=aux;
                }
            }
        }for (int y=0; y<ord.length; y++){
            System.out.println(""+ord[y]);
        }
    }
            
    
}
