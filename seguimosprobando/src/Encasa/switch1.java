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
public class switch1 {
public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    String dias; int numero;
    
    System.out.println("Introduzca un número del día de la semana");
    numero=sc.nextInt();
    
    switch (numero){
        case 1->
            System.out.println("El día es lunes");
        case 2->
            System.out.println("El día es martes");
        case 3->
            System.out.println("El día es miercoles");
        case 4->
            System.out.println("El día es jueves");
        case 5->
            System.out.println("El día es viernes");
        case 6->
            System.out.println("El día es sabado");
        case 7->
            System.out.println("El día es domingo");
        default->{
            System.out.println("El número introducido  no pertenece a ninún día de la semana");
            
        }    
    }
    
}
    
}    
