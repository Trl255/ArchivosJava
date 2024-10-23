/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema_4;
import java.util.Scanner;
/**Ejercicio4. Escribir una función a la que le pasemos dos enteros y nos devuelva el más pequeño de ellos.
 *
 * @author IFC303-1
 */
public class Ejercicio4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Introducir el número 1");
        num1=sc.nextInt();
        System.out.println("Introducir el número 2");
        num2=sc.nextInt();
  numeroPequeño(num1,num2);
    }
static void numeroPequeño(int x1, int x2){
    if (x1<x2)
        System.out.println("El número más pequeño es:" +x1);
    else if (x1==x2)
        System.out.println("El número"+ x1+ " es igual a " +x2);
else
        
      System.out.println("El número más pequeño es: "+x2);
 
    
}


}

