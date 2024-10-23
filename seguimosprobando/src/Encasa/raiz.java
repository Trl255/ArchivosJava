/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class raiz {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double raiz;
        int select, num1, num2, suma, resta, multiplicacion, division;
       
        System.out.println("Por favor introducir una de las siguientes opciones:\n 1-suma\n 2-resta\n 3-multiplicación\n 4-división");
        select=sc.nextInt();
        System.out.println("Por favor introducir primer número");
        num1=sc.nextInt();
        System.out.println("Por favor introducir segundo número");
        num2=sc.nextInt();
        
        if (select<1 || select>4)
             System.out.println("La opción escrita no está disponible");
        else if(select==1){
            System.out.println("el resultado de la suma es "+(num1+num2));
        }else if (select==2){
            System.out.println("el resultado de la resta es "+(num1-num2));
        }else if (select==3){
            System.out.println("el resultado de la multiplicación es "+(num1*num2));
        }else if (select==4){
            System.out.println("el resultado de la división es "+(num1/num2));
    
        }   
    }
}
