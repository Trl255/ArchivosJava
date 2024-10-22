/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class mayoromenor {
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     
     
     System.out.println("Hola Patricia, introduzca un número");
     int numero1=sc.nextInt();
     System.out.println("Introduzca otro número");
     int numero2=sc.nextInt();
     
     if (numero1>=numero2){
           if (numero1==numero2){
         System.out.println("Patricia, el número "+numero1+" es igual que "+numero2);
           }else{
         System.out.println("Pattricia, el número "+numero1+" es mayor que "+numero2);
           }
     }else{
         System.out.println ("Patricia, el número "+numero1+" es menor que "+numero2);
                         
         
         
     }
     
     
  }  
}
