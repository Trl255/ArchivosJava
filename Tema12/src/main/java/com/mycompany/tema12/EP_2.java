/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema12;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Crea una aplicación donde pidamos la ruta de un fichero por teclado y un
 * texto que queramos a escribir en el fichero. Deberás mostrar por pantalla el
 * mismo texto pero variando entre mayúsculas y minúsculas, es decir, si escribo
 * “Bienvenido” deberá devolver “bIENVENIDO”. Si se escribe cualquier otro
 * carácter, se quedara tal y como se escribió. Deberás crear un método para
 * escribir en el fichero el texto introducido y otro para mostrar el contenido
 * en mayúsculas. IMPORTANTE: cuando pidas por teclado una ruta con JOptionPane,
 * no es necesario que insertes caracteres de escape.
 */
public class EP_2 {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduce la ruta del fichero");
        String ruta =sc.nextLine();
        
        System.out.println("Introduce el texto que quieras escribir en el fichero");
        String texto =sc.nextLine();
                
                //opcion con JOptionPane
        //String ruta = JOptionPane.showInputDialog("Introduce la ruta del fichero");
        //String texto=JOptionPane.showInputDialog("Introduce el texto que quieras escribir en el fichero");

        estableceRuta(ruta, texto);
        ReemplazaPrimerCarac(ruta);

    }

    public static void estableceRuta(String rutaNombre, String texto) throws IOException {

        try ( FileWriter fw = new FileWriter(rutaNombre)) {

            fw.write(texto);

        } catch (IOException ex) {
            System.out.println("Error al escribir el archivo " + ex.getMessage());
        }

    }

    public static void ReemplazaPrimerCarac(String rutaNombre) {

        try ( FileReader fr = new FileReader(rutaNombre)) {
            int valor = fr.read();
              
            while (valor != -1) {
                char caracter = (char) valor;

                if (caracter >= 97 && caracter <= 122) {
                    caracter -= 32;
                } else if (caracter >= 65 && caracter <= 90) {
                    caracter += 32;
                }

                System.out.print(caracter);
                valor = fr.read();
            
            }
        } catch (IOException ex) {
            System.out.println("Error de lectura, E/S " + ex.getMessage());
        }

    }
}
