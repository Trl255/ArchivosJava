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
public class Ejercicio8 {
public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduzca un número");
    int radio=sc.nextInt();
    double longitud=2*Math.PI*radio;
    double area=Math.PI*Math.pow(radio, 2);
    System.out.println("La longitud de la circunsferencia es\n"+longitud);
    System.out.printf("El area es: %.2f", area);
}    
}
