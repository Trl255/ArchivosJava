/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
//Ejercicio1: Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.
public class Ejercicio1tema3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número");
       int numero=sc.nextInt();
        if(numero %2 ==0)
            System.out.println("Es par");
        else if(numero %2 !=0)
            System.out.println("Es inpar");
        
    }
    
}
