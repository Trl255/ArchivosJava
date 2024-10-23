/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mama
 */
public class Ejercicio8 {
       public static void main(String []args){
         Scanner entrada = new Scanner(System.in);
         System.out.println("Introduce un texto");
         String cadena = entrada.nextLine();
         String []tabla= cadena.split(" ");
         Arrays.stream(tabla).sorted().forEach(System.out::println);

    }
}
