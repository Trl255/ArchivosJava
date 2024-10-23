/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
//Solicitar dos números distintos y mostrar cuál es el mayor.
public class Ejercicio3 {
  public static void main(String args[]){
      int x, y;
      Scanner sc=new Scanner(System.in);
      System.out.println("Introduce un número");
      x=sc.nextInt();
      System.out.println("Introduce otro número");
      y=sc.nextInt();
      if (x>y)
          System.out.println("El primer número es mayor");
      else
          System.out.println("El segundo número es mayor");
      
      
     
  }
  
  
    
}
