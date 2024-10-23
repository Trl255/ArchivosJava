/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_5;
import java.util.Scanner;
/**
 *Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas 
tienen una altura superior a la media y cuántas tienen una altura inferior a la media.
El valor de N se pide por teclado y debe ser entero positivo.
 * @author IFC303-1
 */
public class Ejercicio_5arrays {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("introduzca la cantidad de valores a introducir");
        int n=sc.nextInt();
        int array[]=new int [n] ;
        llamada (array);
         
        double med=mediasAlturas(array);
        comparacion(array, med);
        
    }
    static void llamada(int []numS){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<numS.length; i++){
            System.out.println("introduzca la cantidad de valores a introducir "+(i+1));
            numS[i]=sc.nextInt();
            
        }
   }static double mediasAlturas(int []numS){
       double media=0;
       int suma=0, cont=0;
       for (int i=0; i<numS.length; i++){
           suma+=numS[i];
           cont++;
       }media=suma/cont;
       return media;
   }static void comparacion(int []numS, double media){
       int contMayor=0, contMenor=0;
       for (int i=0; i<numS.length ; i++){
       if (numS[i]<media){
           contMenor++;
           }
       else if (numS[i]>media){
           contMayor++;
       }
       }System.out.println("La cantidad de personas debajo de la media es "+contMenor);
       System.out.println("La cantidad de personas encima de la media es "+contMayor);
   }
    
}
