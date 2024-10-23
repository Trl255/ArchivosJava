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
public class numeromayor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1, num2;
         
        System.out.println("Introduzca el primer número");
        num1=sc.nextInt();
        System.out.println("Introduzca el segundo número");
        num2=sc.nextInt();
           
        if (num1>num2)
                {     
            System.out.println("el número "+num1+" es mayor que el número " +num2);
                        if (num1==num2)
                        System.out.println("el número "+num1+" igual que " +num2);
                }else{
               System.out.println("El número "+num2+" es mayor que "+num1);
        }
                }
}
    /*System.out.println("Introduzca el primer número");
        num1=sc.nextInt();
        System.out.println("Introduzca el segundo número");
        num2=sc.nextInt();
        
       while (num1<num2)
           System.out.println("El número "+num1+" es menor que número "+num2);
           int aux=num1;
                num1=num2;
                num2=num1;
                
                if  (num1<num2)
                    System.out.println("El número "+num1+" es menor que "+num2);*/

