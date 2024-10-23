/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 /*. Un economista te ha encargado un programa para realizar cálculos con el IVA. La aplicación
debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla el importe
correspondiente al IVA y el total.
*/
package Encasa;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class IVA {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        double baseI=0, iva=0, calculo=0, resultado=0;
        
        System.out.println("Introduzca la base imponible a calcular");
        baseI=sc.nextDouble();
        System.out.println("Introduzca el IVA a calcular");
        iva=sc.nextDouble();
        
        
    calculo=((baseI*iva)/100)+baseI;
    System.out.printf("El monto total a cobrar es: € %.2f\n",calculo);    
   
    /*resultado=cIva(baseI, iva);*/
    
    }
    /*static double cIva (double xbase, double xiva){
   return ((xbase*xiva)/100)+xbase;*/
    }
        