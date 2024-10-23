/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class examen_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=0, num2=0, i=0, aux=0;
        System.out.println("\"Programa que muestra por orden descendete dos valores\"\n Por favor introducir el primer valor");
        num1=sc.nextInt();
        System.out.println("Por favor introducir el segundo valor");
        num2=sc.nextInt();
        if (num1>num2)
            for (i=num1; i>=num2 ; i--){
               if(i%2==0){
                   aux=i;
                   System.out.println("Los números de diferencias pares son: "+aux);
               }
            }
        else if (num2>num1){
           for (i=num2; i>num1 ; i--){
               if (i%2==0){
               aux=i;
        System.out.println("Los números de diferencias pares son: "+aux);    
         }}}
               
        else{
        System.out.println("Los número introducidos son iguales");
        }}
}
        
    


        
        
        
        
        
        
        
        
        
        
     
        
        
        
        
                
