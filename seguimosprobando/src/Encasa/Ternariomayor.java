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
public class Ternariomayor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        
System.out.println("Introduzca el primner número");
num1=sc.nextInt();
System.out.println("Introduzca el segundo número");
num2=sc.nextInt();

int maximo=num1>num2 ? num1:num2;

System.out.println("El número con más valor es "+maximo);


    }
    
}
