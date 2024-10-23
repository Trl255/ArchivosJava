/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;
import java.util.Scanner;
/**Ejercicio28. Implementar una aplicación para calcular datos estadísticos 
 * de las edades de los alumnos de un centro educativo. Se introducirán 
 * datos hasta que uno de ellos sea * negativo, y se mostrará: la suma de 
 * todas las edades introducidas, la media
* , el número de alumnos y cuántos son mayores de edad.
 *
 * @author IFC303-1
 */
public class Ejercicio28 {
public static void main(String args[]){
    int edad=0, suma=0, contador=0;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Introducir una edad");
    edad=sc.nextInt();
    while (edad>=0){
            suma=suma+edad;
             contador++;
    System.out.println("Introducir una edad");
    edad=sc.nextInt();
   } 
    System.out.println("La suma de las edades introducidas es "+suma);

    
}           
   
     
    
}        
            
            /*if (edad>=0)
        contador=1;   
        System.out.println("La suma de todas las edades es"edad=edad+edad);
        
        else
        {System.out.println("La edad introducida no es valida");
                
                */
                
