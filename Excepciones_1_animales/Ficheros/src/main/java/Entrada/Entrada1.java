/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mama
 */
public class Entrada1 {
    public static void main(String[] args) {
        LeerFichero lectura = new LeerFichero();
        lectura.lee();

    }
}

class LeerFichero {

    public void lee() {
        try {
            FileReader entrada = new FileReader("C:/Probando.txt");
            int c = entrada.read();
            while (c != -1) {
                char s = (char) c;
                System.out.print(s);
                c = entrada.read();
            }
            entrada.close();
        } catch (IOException ex) {
            System.out.println("Error al acceder al fichero");
        }
    }
}
