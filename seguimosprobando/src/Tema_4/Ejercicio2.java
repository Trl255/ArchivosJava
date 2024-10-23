/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 

Ejercicio2. Escribir una función a la que le pasemos dos enteros y nos muestre todos los números
comprendidos entre ellos.*/
package Tema_4;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class Ejercicio2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Introduzca el número 1");
        num1=sc.nextInt();
        System.out.println("Introduzca el número 2");
        num2=sc.nextInt();
        diferencia(num1, num2);
        
 }static void diferencia(int x, int y)
 {
      if (x<y)
      for (x=x; x<=y; x++){
          System.out.println(""+x);
      }
      if (y<x)
      for (y=y; y<=x; y++){
          System.out.println(""+y);    
}
 }           
}
       
        