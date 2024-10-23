/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;

/**Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular
el importe que hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo
número será introducido por el usuario). Existen dos tipos de entrada: infantil, que cuestan
15,50€; y de adultos, que cuestan 20€.
En el caso de que el importe sea igual o superior a 100€, se aplicará automáticamente un bono
descuento del 5%.

 *
 * @author josea
 */
import java.util.Scanner;
public class Taquilla {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double entradaAdulto=0, entradaInfantil=0, total=0, descuento=0;
    System.out.println("Introduzca la cantidad de entrada de adulto");
    entradaAdulto=sc.nextInt();
    System.out.println("Introduzca la cantidad de entrada de niños");
    entradaInfantil=sc.nextInt();    
    total=(entradaAdulto*20)+(entradaInfantil*15.5);
    if (total<=100){
    System.out.println("Total a pagar es:\n"+" € "+total);
      
    }else{ 
     descuento=total*0.05;
    System.out.println("El total a pagar con el descuento del 5% es: \n"+"€"+(total-descuento));
    }    
    }
}