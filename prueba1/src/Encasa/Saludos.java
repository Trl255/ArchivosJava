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
public class Saludos {
public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    String nombre;
    
    System.out.println("Introduzca su nombre");
    nombre=sc.next();
    System.out.println("Hola "+nombre+" buenos días.");
}    
}
