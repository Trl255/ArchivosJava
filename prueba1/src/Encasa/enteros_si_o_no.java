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
public class enteros_si_o_no {
    public static void main(String args[]){
        int num1=0, num2=0;

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca un número entero");
        num1=sc.nextInt();
        System.out.println("Introduzca otro número entero");
        num2=sc.nextInt();{

        if (num1==num2){
    
    System.out.println("Los dos número son iguales");
        
}else{    
    System.out.println("Los números introducidos no son iguales");
        }
}      }}
        /* 
int mayor=num1>num2 ? num1:num2;

    System.out.println("El número mayor es "+mayor);
    
    }
int igual=num1==num2 ? num1:num2;{

    System.out.println("Los número introducidos son iguales"+igual);

    }
        /*comparacion=(num1==num2)<0;     */
