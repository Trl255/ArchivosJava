/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *Escribir una función a la que le pasemos dos enteros y nos devuelva el más pequeño
 * @author IFC303-1
 */
public class ejercicio4 {
    public static void main(String args[]){
        
        
 Scanner sc=new Scanner(System.in);
 int num1, num2;
 
 System.out.println("Introduzca un número");
 num1=sc.nextInt();
 System.out.println("Introduzca otro número");
 num2=sc.nextInt();
 
 mayor(num1, num2);
 
    }
    static void mayor(int numero1,int numero2){
        if (numero1<numero2);
        System.out.println("El número "+numero1+" \n Es menor que "+numero2);
                int aux=numero1;
                    numero1=numero2;
                    numero2=numero1;
                    
         while (numero1>numero2){
            System.out.println("El número" +numero1+" es mayor que "+numero2);
            
       
    }
}
}