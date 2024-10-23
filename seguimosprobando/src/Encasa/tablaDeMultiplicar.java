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
public class tablaDeMultiplicar {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int x=0, y=0;
    
    System.out.println("Introduzca el primer número");
    x=sc.nextInt();
    
    System.out.println("A continuación le muestro la tabla de multiplicar de: "+x);
 for (y=1; y<=10; y++){
     System.out.println(+y+" x "+x+" = "+y*x);
    
    }
}    }
    
    
    /*System.out.println("Tabla del " + x);
    for (y=1; y<=10; y++){
    System.out.println(+x+ " X " +y+ " = " +y*x);
           
    System.out.println("Le muestro la tabla de multiplicar del "+x);
    for (y=1; y<=10; y++){
    System.out.println(+y+" x "+x+" = "+y*x);
*/
    
