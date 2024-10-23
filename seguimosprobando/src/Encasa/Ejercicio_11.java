/*Que lea 5 números por teclado, los copie a otro array multiplicados por 2 y los muestre todos ordenados usando un tercer array.
 */
package Arrays;
import java.util.Scanner;
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numeros[]=new int [5];
        solicitud(numeros);
        copia(numeros);
        ordenar(numeros);
        
    }static void solicitud(int sol []){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<sol.length; i++){
            System.out.println("Introduzca el valor "+(i+1));
            sol[i]=sc.nextInt();
        }
    }static void copia (int original[]){
        int []copia=new int [5];
        for (int i=0; i<original.length; i++){
            copia[i]=original[i] *2;
            System.out.println(+original[i]+" x "+" 2= "+copia[i]);
        }
    } static void ordenar(int num[]){
    for (int x=0; x<num.length; x++){
        for (int y=x+1; y<num.length; y++){
            if (num[y]<num[x]){
                int aux=0;
                aux=num[y];
                num[y]=num[x];
                num [x]=aux;
            }
        }
        }System.out.println("Y el orden de menor a mayor es: ");
        for (int i=0; i<num.length; i++){
            System.out.println(+num[i]*2);
    
    }
        
    }
    
}
          
            
