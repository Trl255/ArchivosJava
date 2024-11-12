/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Programa Java para leer la altura de N personas y calcular la altura media. Calcular 
cuántas personas tienen una altura superior a la media y cuántas tienen una altura 
inferior a la media. El valor de N se pide por teclado y debe ser entero positivo. */
package T_5;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class Ejercicio_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=0, y=0, contador=1, suma=0, j=0, mediaS=0, mediaI=0;
        double media=0;
        
        System.out.println("Introduzca la cantidad de personas a calcular la media");
        x=sc.nextInt();
        int array1[]=new int[x];
        for (y=0 ; y<array1.length ; y++){
            System.out.println("Introduzca la altura de la persona "+(j+1));
            suma+=y;
            media=(j/suma);
        }
        if (media>0){
            
        
        for (y=0 ; y<array1.length ; y++){
            if (y>media)
                mediaS++;
        }
        for (y=0 ; y<array1.length ; y++){
            if (y<media)
                mediaI++;
        }for (y=0 ; y<array1.length ; y++)
            if (y==media)
        
        System.out.println(+media);
}
        }
}
           
    

