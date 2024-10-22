/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 * * @author josea. 
 * Pide dos números al usuario: a y b. Deberá mostrarse true si ambos números son iguales y false
en caso contrario.

 */
public class true_false_numero {
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     boolean iguales;
     int num1, num2;
     
     System.out.println("Introduzca el primer número");
     num1=sc.nextInt();
     System.out.println("Introduzca el segundo número");
     num2=sc.nextInt();
     iguales=true;
     if (num1==num2){
         System.out.println("Los número son iguales");
     }else{
     
     System.out.println("Los números son diferentes");
 }   
}
}