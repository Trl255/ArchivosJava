/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class Ejercicio_5_crtes {
     public static void main(String[] args) {
      Scanner sn=new Scanner(System.in);

         
        //Pido al usuario que escriba una frase
        System.out.println("Escriba una frase");
         
        //Recomiendo usar nextLine en lugar de next por los espacios
        String frase=sn.nextLine(); 
         
        //Creamos un array de caracteres
        char caracteres[]=new char[frase.length()];
         
        //Recorremos la frase y cogemos cada caracter y lo metemos en el array
        for(int i=0;i<frase.length();i++){
            caracteres[i]=frase.charAt(i);
            System.out.println(caracteres[i]);
        }
         
    }
     
}