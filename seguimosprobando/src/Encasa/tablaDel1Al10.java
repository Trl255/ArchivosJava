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
public class tablaDel1Al10 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int numero;
    
    System.out.println("\"Programa para mostrarte la tabla de multiplicar del 1 al 10\"\n Introducir un número entre el 1 y el 10");
    numero=sc.nextInt();
    
    if (numero<0)
            System.out.println("El número introducido no es valido porque negativo");
    {
    if (numero<11 && numero>0){
        System.out.println("La tabla de multiplicar del "+numero+" es:");
        for (int y=1; y<=10; y++)            
            System.out.println(+numero+" X "+y+" = "+numero*y);
        
        
    }else if (numero>10)
        System.out.println("El número introducido no es valido porque es mayor que 10");

    }
}
}
       