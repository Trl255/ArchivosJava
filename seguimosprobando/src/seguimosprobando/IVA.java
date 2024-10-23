/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *//*n  economista  te  ha  encargado  un  programa  para  realizar  cálculos  con  el  IVA.  La  aplicación 
debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla el importe 
correspondiente al IVA y el total.*/
package seguimosprobando;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class IVA {
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int base=0, iva=0, total=0, porcentaje;
     
     System.out.println("Introduzca la base imponible a calcular el IVA");
     base=sc.nextInt();
     System.out.println("Introduzca el IVA a calcular");
     iva=sc.nextInt();
     if (base<=0)
         System.out.println("El valor introducido no es valido");
     else
         porcentaje=(int) ((double)(iva/100)*base);
         total=iva+base;
         System.out.println("El iva de "+base+" es "+total);
         
     
     
 }   
}
