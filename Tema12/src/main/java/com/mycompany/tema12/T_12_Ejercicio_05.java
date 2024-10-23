/*Ejercicio5. Escribe un texto en un archivo de texto, línea a línea leídas
del teclado, hasta que introduzca la cadena “fin”.*/
package com.mycompany.tema12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T_12_Ejercicio_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BufferedWriter fichero = null;
        BufferedReader lectura = null;
        //   String texto="";
        //if(char(i).equals("\n")) contador++;

        try {
            fichero = new BufferedWriter(new FileWriter(("Erjercicio5.txt"), true));

            System.out.println("Introduce una linea");
            String linea = sc.nextLine();

            while (!linea.equalsIgnoreCase("fin")) {

                fichero.write(linea);
                fichero.newLine();
                System.out.println("Introduce una nueva linea");
                linea = sc.nextLine();
            }

            if (linea.equalsIgnoreCase("fin")) {
                System.out.println("Has acabado de escribir");
            }
        } catch (IOException ex) {
            System.out.println("Error a la hora de escribir el texto" + ex);
        } finally {
            if (fichero != null) {
                try {
                    fichero.close();
                } catch (IOException e) {
                    System.out.println(e);
                }

            }
        }

        try {

            lectura = new BufferedReader(new FileReader("Ejercicio5.txt"));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(T_12_Ejercicio_05.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
