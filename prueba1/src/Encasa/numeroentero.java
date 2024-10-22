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
public class numeroentero {
public static void main(String args[]){    
    Scanner sc=new Scanner(System.in);
    int numero1, numero2;
    /*boolean resultado;*/
    String cadena;
    
System.out.println("Introduzca un número");
numero1=sc.nextInt();
System.out.println("Introduzca otro número");
numero2=sc.nextInt();
/*
if (numero%2==0)
        System.out.println("El número introducido es par ");
else{
        System.out.println("El número introducido es impar");*/

cadena=(numero1==numero2)? "son iguales":"no son iguales";
System.out.println("¿Los dos número introducido son iguales?\n"+cadena);
}






}
