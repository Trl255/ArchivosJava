/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
     
/**Solicita un número real y calcula su raíz cuadrada. Implementa el programa usando el nombre
cualificado de las clases, en lugar de usar ninguna importación.
 *
 * @author josea
 */
public class raizSinImportacion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double raiz;
        int numero;
        
        System.out.println("\"Programa para mostrar raíz cuadrada\"\n Introduzca el número");
        numero=sc.nextInt();
        
        raiz=Math.sqrt(numero);
        System.out.printf("La raíz cuadrada de "+numero+ " es%.2f\n ", raiz);
    }
}
