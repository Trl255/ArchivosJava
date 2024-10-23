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
public class factorial {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
        long factorial=1;
     int numero, i;
     
     System.out.println("Introduzca un número para mostrarle el factorial");
     numero=sc.nextInt();
     
     for (i=numero; i>0; i--)
         factorial=factorial*numero;
     System.out.println("El factorial de "+numero+" es "+-factorial);
        
      }
    }
    

