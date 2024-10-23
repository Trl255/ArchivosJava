package com.mycompany.tema12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author josea
 */
public class Dr_4 {

    public static void main(String[] args) {
        String ruta = JOptionPane.showInputDialog(null, "Inserta la ruta"
                + "del fichero", " Insercion", JOptionPane.INFORMATION_MESSAGE);
            int c = 0;
            String resultado = "";

        try ( FileReader fr = new FileReader(ruta);  FileWriter fw = new FileWriter("Probando2.txt")) {
            //Importante se puede leer y escribir el archivo, en FILEREADER o se le asigna un archivo nuevo,
            //o darle TRUE para que no lo borre.
            
            

            while ((c = fr.read()) != -1) {

                if (c >= 97 && c <= 122) {
                    resultado += ((char) (c - 32));

                } else if (c != 32) {//32 es el código de espacio " "
                    resultado += (char) (c);

                }
            }
            fw.write(resultado); //escribimos en el fichero las lineas que 
            //se han formado en resultado
            

        } catch (IOException e) {
            System.out.println("Error " + e);

        }
        System.out.println(resultado);
    }
}
