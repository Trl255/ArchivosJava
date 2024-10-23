/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;
import java.util.Scanner;

/**
 *
 * @author IFC303-1
 */
//Ejercicio2. Pedir dos números enteros y decir si son iguales o no.
public class Ejercicio2 {
public static void main(String args[]){
    int valor1, valor2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce un número");
    valor1=sc.nextInt();
    System.out.println("Introduce otro número");
    valor2=sc.nextInt();
    if (valor1==valor2)
        System.out.println("Tus dos número son iguales");
    else 
            System.out.println("Tus número son distintos");
            
}    
}
