package Arrays;
import java.util.Scanner;
/*Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen una altura 
superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe ser entero positivo.
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        do { 
        System.out.println("Introduzca la cantidad de personas");
         n=sc.nextInt();
       }while(n<0);
        int []arry=new int[n];
        solicitud(arry);
        valoracionM(arry);
        
        
    }static void solicitud(int sol []){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<sol.length; i++){
            System.out.println("Introduzca el valor "+(i+1));
            sol[i]=sc.nextInt();
            }        
            
        
    }static void valoracionM(int med[]){
        int media=0, contP=0, contN=0, suma=0, cont=0;
        for (int i=0; i<med.length; i++){
            suma+=med[i];
            cont++;
          }media=suma/cont;
    for (int i=0; i<med.length; i++){
        if (media>med[i]){
        contN++;
    }if (media<med[i]){
        contP++;
    }
    
}System.out.println("Las personas encima de la media es: "+contP);
    System.out.println("Las personas debajo de la media es: "+contN);
    }    
}
