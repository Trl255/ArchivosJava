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
public class ejerciciodoWhile {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=0, x=0, contador=1, total=0;
        System.out.println("Introduza un número para mostrar la multiplicación");
        num1=sc.nextInt();
        do
        {   
        for (x=1; x<=10; x++)
            System.out.println(""+x+" x "+num1+" = "+num1*x );
           }while  (x<=10);
        System.out.println("Se ha multiplicado "+ (x-1)+ " veces");
}
}