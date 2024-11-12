/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Programa Java que guarda en un array 10 números enteros que se leen por teclado. A 
continuación se recorre el array y calcula cuántos números son positivos, cuántos 
negativos y cuántos ceros.*/
package T_5;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class Ejercicio_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numero[]=new int [10], x=0, ContP=0, ContN=0, ceros=0, contador=1;
        
        for (x=0; x<numero.length; x++){
            System.out.println("Introduzca el valor "+(x+1));
            numero[x]=sc.nextInt();
                     
            if (numero[x]>0)
                ContP++;       
            else if (numero[x]==0)
                ceros++;
            else if (numero[x]<0)
                ContN++;      
            
                
        
            }      
        System.out.println("Los número positivos son "+ContP);
        System.out.println("Los número negativos son "+ContN);
        System.out.println("Los ceros introducidos son "+ceros);
    }
    
}
