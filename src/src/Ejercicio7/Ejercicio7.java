/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
Repetir el ejercicio anterior, pero construyendo una cadena con las palabras de
más de tres letras.
 */
public class Ejercicio7 {
       public static void main(String []args){
         Scanner entrada = new Scanner(System.in);
         System.out.println("Introduce un texto");
         String cadena = entrada.nextLine();
         String []tabla= cadena.split(" ");
         Arrays.stream(tabla).filter(e->e.length()>3).forEach(System.out::println);

    }
}
