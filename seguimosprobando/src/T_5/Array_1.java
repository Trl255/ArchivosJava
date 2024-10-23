/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra 
por consola el índice y el valor al que corresponde. */
package T_5;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class Array_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
    int []numero= new int [10];
    int x=0;
    for (x=0; x<10; x++){
    System.out.println("Introduzca el número "+(x+1));
    numero[x]=sc.nextInt();
    }
    for (x=0; x<10; x++){
    System.out.println("El número "+(x+1)+ " introducido es: " +numero[x]);
    }
    }
    }

