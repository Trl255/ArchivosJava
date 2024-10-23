/*Que lea 5 números por teclado, los copie a otro array multiplicados por 2 y muestre el segundo array. */
package Arrays;
import java.util.Scanner;
public class Ejercicio_10 {
    public static void main(String[] args) {
        int []arry=new int [5];
        rellenar(arry);
        copia(arry);
 }static void rellenar(int rell[] ){
    Scanner sc=new Scanner(System.in);
    for (int i=0; i<rell.length; i++){
        System.out.println("Introduzca el valor "+(i+1));
        rell[i]=sc.nextInt();
        
    }
}static void copia(int cop []){
    int []copia=new int [5];
    for (int i=0; i<cop.length; i++){
        copia [i]=cop[i];
    }for (int c=0; c<copia.length; c++){
        copia[c]=copia[c]*2;
     System.out.println("la posición "+(c+1)+"  que es multiplicado por 2 es: "+copia[c]);   
    }
}
}
