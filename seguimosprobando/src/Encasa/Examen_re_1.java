/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;

import java.util.Scanner;

public class Examen_re_1 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        
        System.out.println("Introduzca un número");
        a=sc.nextInt();
        
        int valor=a;
        verificacion (valor);
        
        
        
        
        
    } public static void verificacion(int valores){
            if (valores%2==1){
                System.out.println("El número "+valores+" es impar");
            }if (valores%2==0 &&valores>0){
                System.out.println("El número "+valores+" es par");
            }if (valores==0 )
                System.out.println("El número introducido es o");
                
            
        }
    
        
    
}
    

