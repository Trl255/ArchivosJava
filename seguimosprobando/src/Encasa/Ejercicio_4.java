package Arrays;
import java.util.Scanner;
/**Programa Java que llene un array con 10 números enteros que se leen por teclado. A
continuación calcula y muestra la media de los valores positivos y la de los valores negativos del array.
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la cantidad de valores");
        int n=sc.nextInt();
        int arry[]=new int[n];
        llamada(arry);
       media (arry);
             
    }static void llamada(int solicitud []){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<solicitud.length; i++){
            System.out.println("Introduzca el valor "+(i+1));
                    solicitud[i]=sc.nextInt();
        }
    }static void media(int med[]){
        double mediaP=0, mediaN; 
        int suma=0, contP=0, contN=0, cont0=0;
        for (int i=0; i<med.length; i++){
            if (med[i]<0){
                suma+=med.length;
                contN++;
            }if (med[i]>0){
                suma+=med.length;
                contP++;
            }if (med[i]==0){
                cont0++;
            }
                
    }mediaN=suma/contN;
    mediaP=suma/contP;
    if (contP>0){
      System.out.printf ("%nLa media de los números positivos es %.0f",mediaP);
    }
    if (contN>0){
      System.out.printf("%nLa media de los números negativos es:%.0f ", mediaN);
    }if (cont0>0){
        System.out.println("\nSe ha introducidos "+ cont0+" veces cero");
    }

}}