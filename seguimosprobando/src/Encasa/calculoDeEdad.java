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
public class calculoDeEdad {
    public static void main(String args[]){
     int annenacimiento, anneactual, edad;
     Scanner sc=new Scanner(System.in);
     
 System.out.println("Hola\n Por favor introduzca el año de su nacimiento");
 annenacimiento=sc.nextInt();
 System.out.println("Hola\n Por favor introduzca el año actual");
 anneactual=sc.nextInt();
 
 edad=anneactual-annenacimiento;
 
 System.out.println("Ahora tiene "+edad+" años\n buen día");
         
         
 

        
        
        
    }
    
}
