package com.mycompany.tema12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author josea
 */
public class Dr_5 {

    public static void main(String[] args) throws IOException {
        String texto = "Vamos a irnos el fin de semana";
        String texto2 = "Esta es la segunda linea";

        try ( BufferedWriter bw = new BufferedWriter(new FileWriter("Probando.txt"))) {
            bw.write(texto);
            bw.newLine();
            bw.write(texto2);

            
            
            
        } catch (IOException e) {
            System.out.println("error"+e);
        }
        System.out.println(texto+texto2);
    }

}
