/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 

Ejercicio22. Implementar una aplicación que pida al usuario un número comprendido entre 1 y 10. Hay
que mostrar la tabla de multiplicar de dicho número, asegurándose de que el número introducido se
encuentra en el rango establecido.
package seguimosprobando

/**
 *
 * @author IFC303-1
 */
import java.util.Scanner;

public class Ejercicio22 {
public static void main (String args[]){
  Scanner entrada=new Scanner(System.in);    
      int y;
   
    System.out.println("introduzca un número entre el 1 y el 10");
    int x=entrada.nextInt();
       if (x<=10 && x>=1){
        for (y=x-1;y>=1;y--){  
      
        x=x*y;        
     
        }System.out.println("El factorial del número introducido es:"+x);
       }else{
           System.out.println("El númermo "+x+ " es mayor que 10, por favor introduce un número comprendido entre el 1 y el 10");
           
       }
  }  
}    

