/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 *Realiza una aplicación que nos pida un número de ventas a introducir, 
 * después nos pedirá tantas ventas por teclado como número de ventas se 
 * hayan indicado. Al final mostrara la suma de todas las ventas. 
 * Piensa que es lo que se repite y lo que no.
 * @author josea
 */
public class ventas {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nVentas=0, contador=0, suma=0, total=0;
        
        System.out.println("Introduzca el número de ventas");
        nVentas=sc.nextInt();
        int limite=nVentas;
        if (nVentas>0){
        for (nVentas=0; nVentas<limite; nVentas++){
            System.out.println("Introduzca la cantidad de la venta ");
            suma=sc.nextInt();
            total+=suma;
            
            contador++;
        }
    System.out.println("La venta total ha sido de; €"+total+" en las "+contador+ " ventas efectuadas");
        }else{
        System.out.println("Ha sido un mal día, no ha efectuado ninguna venta");
        }
        }
}