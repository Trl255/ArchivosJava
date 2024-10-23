/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class clase1 {
 public static void main(String []args){
        Scanner entrada=new Scanner(System.in);
        int primer,segundo;
        System.out.println("Introduce el primer valor");
        primer=entrada.nextInt();
        System.out.println("Introduce el segundo valor");
        segundo=entrada.nextInt();
        if(primer>segundo){
            System.out.println("El primer valor es mayor que el segundo");
            int suma=primer+segundo;
            System.out.println("La suma vale "+suma);
        }
        else if(primer<segundo)
            System.out.println("El primer valor es menor que el segundo");
        else 
            System.out.println("Los dos nÃºmeros son iguales");
        
    }
    
}