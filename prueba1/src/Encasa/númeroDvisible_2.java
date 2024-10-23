/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 *Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
 * @author josea
 */
public class númeroDvisible_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numero, div2;
        
        System.out.println("\"Programa que indica el número divisible entre 2\"\n Por favor introduzca un número");
        numero=sc.nextInt();
        if (numero%2==0){
        
            System.out.println("El número "+numero+ " es divisible a 2");
        }else{
            System.out.println("El número "+numero+ " no es divisible a 2");
        
        
    }
}
}