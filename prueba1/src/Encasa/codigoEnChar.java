/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 *Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
 * @author josea
 */
public class codigoEnChar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char caracter;
        int codigo;
        
        
        
        System.out.println("\"Programa de conversión a código ASCII\"\n Por favor introduzca el carácter que desea convertir");
        caracter=sc.next().charAt(0);
        codigo=(int)caracter;
        System.out.println("El caracter de "+caracter+" es "+codigo);
        
        
    }
}
