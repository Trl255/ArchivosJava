/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;
import java.util.Scanner;

//Ejercicio11. Escribir un programa que pida un número al usuario e indique mediante un literal booleano
//(true o false) si el número es par.
/**
 *
 * @author IFC303-1
 */
public class Ejercicio11 {
    public static void main(String args[]){
        Scanner ss=new Scanner(System.in);
        Boolean x; 
         int y;
        System.out.println("Introduce un número");
        y=ss.nextInt();
        x=(y%2==0)?true:false;
        System.out.println("Tu número es par"+x);
        
        
        
        
        
        
        
    }
    
}
