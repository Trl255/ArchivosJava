/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;
import java.util.Scanner;


/**
 *
 * @author IFC303-1Ejercicio14. Realizar un programa que pida como entrada un número decimal y lo muestre
redondeado al entero más próximo.
 */
public class Ejercicio14 {
    public static void main(String args[]){
        Scanner ss=new Scanner(System.in);
        System.out.println("Introduce un número");
        float numero= ss.nextFloat();
        int valor=Math.round(numero);
        System.out.println("Tu numero redondeado es "+ valor);
       
        
        
    }
}
