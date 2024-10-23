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
public class numerosEnteros10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, media;
        
        System.out.println("Introduzca el primer número");
        num1=sc.nextDouble();
        System.out.println("Introduzca el segundo número");
        num2=sc.nextDouble();
        System.out.println("Introduzca el tercer número");
        num3=sc.nextDouble();
        System.out.println("Introduzca el cuarto número");
        num4=sc.nextDouble();
        System.out.println("Introduzca el quinto número");
        num5=sc.nextDouble();
        System.out.println("Introduzca el sexto número");
        num6=sc.nextDouble();
        System.out.println("Introduzca el septimo número");
        num7=sc.nextDouble();
        System.out.println("Introduzca el octavo número");
        num8=sc.nextDouble();
        System.out.println("Introduzca el noveno número");
        num9=sc.nextDouble();
        System.out.println("Introduzca el décimo número");
        num10=sc.nextDouble();
        
        media=(num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/10;
        /*media=(num1+num2+num3)/3;*/
        System.out.printf("%nLa media de los números introducidos es: %.2f", media);
        
        
    }
    
}
