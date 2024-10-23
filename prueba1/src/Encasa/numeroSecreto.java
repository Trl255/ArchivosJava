/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;

import java.util.Scanner;
/**
 *
 * @author josea
 */
public class numeroSecreto {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int x=0, y, intentos=0; 
    y=(int)(Math.random()*99+1);
System.out.println("\"JUEGO DEL NÚMERO SECRETO\"");
do
{ 
    System.out.println("Introduzca otro número del 1 al 100");
        x=sc.nextInt();               
    if (y<x)
        System.out.println("Lo siento el número " +x+ " es mayor que el número secreto, sigue inténtandolo, estas muy cerca de conseguirlo");
    else if (y>x)
       System.out.println("Lo siento el número " +x+ " es menor que el número secreto, sigue inténtandolo, estas muy cerca de conseguirlo");
        intentos++;
}
while (x!= y);
System.out.println("¡¡En horabuena!!, has acertado el número secreto es: "+y+" lo has acertado en > "+intentos+" <- intentos");
    }
}
           
        



