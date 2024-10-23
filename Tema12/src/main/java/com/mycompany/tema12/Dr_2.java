package com.mycompany.tema12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author josea
 */
public class Dr_2 {

    public static void main(String[] args) {
        FileReader frL = null;
        String contenido = "";
        int c;

        try {
            frL = new FileReader("Hola mundo.txt");

            while ((c = frL.read()) != -1) {

                contenido += (char) +c;

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex);

        } catch (IOException ex) {
            System.out.println("Error a la hora de acceder al archivo " + ex);

        } finally {
            try {
                frL.close();
                System.out.println("Se ha cerrado correctamente");
            } catch (IOException ex) {
                System.out.println("Error a la hora de cerrar de archivo");
            }

        }
        System.out.println("El contenido del fichero es " + contenido);
    }

}
