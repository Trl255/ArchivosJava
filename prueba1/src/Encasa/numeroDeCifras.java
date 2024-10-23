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
public class numeroDeCifras {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int numero=1;
        
        System.out.println("\"Programa para mostrar las cifras de un número\"\n Introduzca un número");
        numero=sc.nextInt();
        
        if (numero<0){
            System.out.println("El número "+numero+ " introducido es negativo");
        }else if (numero<10){
            System.out.println("El número "+numero+" introducido tiene 1 digitos");
        }else if (numero<100){
            System.out.println("El número "+numero+" introducido tiene 2 digitos");
        }else if ( numero<1000){
            System.out.println("El número "+numero+" introducido tiene 3 digitos");
        }else if (numero<10000){
            System.out.println("El número "+numero+" introducido tiene 4 digitos");
        }else if (numero<100000){
            System.out.println("El número "+numero+" introducido tiene 5 digitos");
        }else if (numero<1000000){
            System.out.println("El número "+numero+" introducido tiene 6 digitos");
        }else{ 
            System.out.println("El número "+numero+" tiene más de 6 digitos");
        }
    }
}