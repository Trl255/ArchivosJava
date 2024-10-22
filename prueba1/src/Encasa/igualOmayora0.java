/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 *Lee un número por teclado y comprueba que este 
 * numero es mayor o igual que cero, si no lo es lo volverá 
 * a pedir (do while), después muestra ese número por consola.
 * @author josea
 */
public class igualOmayora0 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=0;
do{
    System.out.println("Introduzca un número");
        num1=sc.nextInt();
        if (num1<0)
            System.out.println("El número "+num1+ " es negativo, por favor introducir un valor positivo");
                
}while (num1<=0);
    System.out.println("El número "+num1+ " un valor positivo");
}            
    }
        

