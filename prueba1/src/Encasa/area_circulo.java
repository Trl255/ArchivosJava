/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 * Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar 
 * de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math
 * @author josea
 */
public class area_circulo {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double radio=0, area=0;
    System.out.println("\"Programa para calacular el áre de un circulo\"\n Introduzca el número a calcular ");
    radio=sc.nextDouble();
    /*area=Math.PI *Math.pow(radio,2);*/
    
    area=Math.PI*(radio*radio);
    System.out.println("El área del circulo es: \n"+area);
}    
}
