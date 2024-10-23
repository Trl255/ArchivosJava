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
public class numero_de_cifras {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numero=0;
System.out.println("Sistema para evaluar cuantos digitos tiene el número introducido\n Introduzca un número del \"0\" al \"99999\"");        
     numero=sc.nextInt();
     
     if (numero<0){
         System.out.println("El número introducido es negativo");
        }else if(numero<10){
            System.out.println("El número introducido tiene 1 digito");
        }else if(numero<100){
             System.out.println("El número introducido tiene 2 digito");
        }else if(numero<1000){
             System.out.println("El número introducido tiene 3 digito");
        }else if(numero<10000){
         System.out.println("El número introducido tiene 4 digito");
        }else if(numero<100000){
         System.out.println("El número introducido tiene 5 digito");
         
     }
        
    }
}


