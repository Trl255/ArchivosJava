/*Ejercicio6. Escribe un programa que solicite al usuario el nombre de un fichero de texto y muestre su
contenido en pantalla. Si no se proporciona ningún nombre de fichero, la aplicación usará por defecto
prueba.txt. */
package com.mycompany.tema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IFC303-1
 */
public class T_12_Ejercicio_06 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String peticion = "", contenido = "";
        int c=0;

        System.out.println("Introduzca el nombre del fichero");
        peticion = sc.nextLine();

        try ( FileReader fUsuario = new FileReader (peticion + ".txt");  BufferedReader fDefecto = new BufferedReader(new FileReader("numeros.txt"))) {

            //if ((peticion=fUsuario.readLine()).equalsIgnoreCase("null")) {
            if ((c= fUsuario.read()) !=-1) {

                while ((contenido = fDefecto.readLine()) != null) {
                    System.out.println(contenido);
                System.out.println("OPCION 1");    
                }
                
            } else {
                while ((c= fUsuario.read()) != -1) {
                 contenido+=(char)c;
                }
                System.out.println(contenido);
                System.out.println("OPCION 2");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error E/S" + ex.getMessage());

        }

    }
}
