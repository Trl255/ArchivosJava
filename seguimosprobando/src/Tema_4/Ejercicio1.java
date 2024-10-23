/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema_4;
/*Ejercicio1: Diseñar una función a la que le pasaremos como parámetro un número entero n, y nos muestre
n veces el mensaje “Estoy probando cómo funciona el paso de variables a una función”.*/
/**
 *
 * @author IFC303-1
 */
import java.util.Scanner;
public class Ejercicio1 {
  public static void main (String args[]){  
      Scanner sc=new Scanner(System.in);
      int saludos;
      System.out.println("Introduzca las veces que quiera que le muestre la función");
      saludos=sc.nextInt();
     
variosSaludos(saludos);      


      
  }     
 static void variosSaludos(int x){
    for (int i=0; i<x; i++){
  System.out.println("Estoy probando cómo funciona el paso de variables a una función por "+x+" veces");
}
 }  
}