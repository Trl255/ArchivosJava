/*Programa Java que guarda en un array 10 números enteros que se leen por teclado. A continuación se recorre el array y 
calcula cuántos números son positivos, cuántos negativos y cuántos ceros.*/
package Arrays;
import java.util.Scanner;
public class Ejercicio_3C {
public static void main (String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Introduzca la cantidad a introducir");
    int n=sc.nextInt();
    int arry[]=new int [n];
    rll(arry);
    posiNeg(arry);
}static void rll(int [] solicitud){
    Scanner sc=new Scanner (System.in);
    for (int i=0; i<solicitud.length; i++){
        System.out.println("Introduzca el valor "+(i+1));
        solicitud[i]=sc.nextInt();
    }
    }    static void posiNeg(int [] valoracion){
        int cont0=0,contP=0, contN=0;
        for (int i=0; i<valoracion.length; i++){
            if (valoracion[i]==0){
                cont0++;
            }else if (valoracion[i]<0){
                contN++;
            }else if (valoracion[i]>0){
                contP++;
            
            
        }
    
        }System.out.println("La cantidad de valores negativos es: "+contN);
        System.out.println("La cantidad de valores positivos es: "+contP);
        System.out.println("La cantidad de 0 introducidos son: "+cont0);
    }
}