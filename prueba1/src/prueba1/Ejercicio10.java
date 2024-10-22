/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;
import java.util.Scanner;
/**
 *Ejercicio 10. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que tener en cuenta
que existen meses con 28, 30 y 31 días (no se considerará los años bisiestos).

 * @author josea
 */
public class Ejercicio10 {
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int dia, mes=0, anne=0, fecha=0;   
     System.out.println("Introduzca un dia del año");
     dia=sc.nextInt();
     System.out.println("Introduzca un mes del año");
     mes=sc.nextInt();
     System.out.println("Introduzca un año");
     anne=sc.nextInt();
     if (anne<1 && anne>12){
        System.out.println("El año introducido no es un año valido");
     
     }else{
            switch (fecha)
            {
                  case 1,3,5,7,8,10,12-> 
             {
                        if (dia>0 && dia<=31)
                        System.out.println("La fecha introducida es correcta");
             else
                System.out.println("La fecha introducida no es correcta");
              }
                  
                    case 2-> 
             {
                        if (dia<29 && dia>0)
                System.out.println(" La fecha introducida es correcta");
              }
                    
                    default->
             {
                    if (dia>0 && dia<31)
                    System.out. println("La fecha introducida es correcta"); 
            else
                System.out.println("La fecha introducida no es correcta");
                   
                    }}}       }}                
                
                
     
     
     
     
     
  

