package com.mycompany.tema12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Dr_1 {

    public static void main(String[] args) {
        FileReader ficheroL = null;
        Scanner sc = new Scanner(System.in);
        String linea = "";

        try ( FileWriter fichero = new FileWriter("Hola mundo.txt", true)) {

            System.out.println("Escriba una palabra/linea");
            linea = sc.nextLine();

            fichero.write(linea);

        } catch (IOException ex) {
            System.out.println("Ha habido un error a la hora de ejecutar " + ex);

            
            
            System.out.println(linea);

        }
    }
}
