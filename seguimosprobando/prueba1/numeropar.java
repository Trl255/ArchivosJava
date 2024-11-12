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
public class numeropar {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introducir un número");
    int numero=sc.nextInt();
    if (numero%2==0){
        System.out.println("El número "+numero+" es par ");
    }else{ 
          System.out.println("El´número "+numero+" es impar");
                }
    
    
     
    
}    
}
