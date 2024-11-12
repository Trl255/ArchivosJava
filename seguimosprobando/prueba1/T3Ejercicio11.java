/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;
import java.util.Scanner;
/**
 *
 * @author josea
 Ejercicio11. Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación solicitará
el aforo máximo del local, el precio por entrada (supondremos que todas las entradas tienen el mismo
precio) y el número de entradas vendidas. Hay que tener en cuenta que si 
* el número de entradas vendidas no supera el 20% del aforo del local, se cancela el concierto. 
* Si el número de entradas vendidas no supera el 50% del aforo, se realizará una rebaja del 25% del precio de la entrada.*/

public class T3Ejercicio11 {
    public static void main(String args[]){
      
Scanner sc=new Scanner(System.in);

System.out.println("Por favor, introduzca el aforo total del concierto");
int local=sc.nextInt();
System.out.println("Introduzca el precio de cada entrada: ");
int precio=sc.nextInt();
System.out.println("Introduzca el número de entradas vendidas");
int entradas=sc.nextInt();
double recaudado=entradas*precio;
double descuento=0;

    if (entradas>=(local*0.50)){
        System.out.println("El total recaudado es:\n €"+recaudado);
    }        
    else     
        if  (entradas<(local*0.20)){    
        System.out.println("Se cancela el concierto por no llegar al porcentaje minimo vendido de entradas");
        } else {
            descuento=recaudado-(entradas*0.25);
            System.out.println("El total recaudado con descuento del 25% aplicado por vender menos del 50% es €: "+descuento);
            
            System.out.println("Gracias por contactarnos");
           
        }
           
        }}