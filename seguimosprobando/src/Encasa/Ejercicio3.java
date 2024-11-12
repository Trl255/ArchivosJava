/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Encasa;
import java.util.Scanner;
/**Solicitar el largo y el ancho de un rectángulo y realizar una función que calcule el área de ese
rectángulo.
 *
 * @author IFC303-1
 */
public class Ejercicio3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Introduzca el número 1");
        num1=sc.nextInt();
        System.out.println("Introduzca el número 2");
        num2=sc.nextInt();
       area(num1, num2);
        
        
    }static void area(int x1,int x2)
    {
        double area=((double)x1+x2)/2;
        System.out.printf("El area de los números "+x1+" y "+x2+" es: " +area);
    }
}
