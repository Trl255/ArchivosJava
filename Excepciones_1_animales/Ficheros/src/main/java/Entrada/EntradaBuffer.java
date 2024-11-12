/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EntradaBuffer {public static void main(String[] args) {
        LeerFichero1 lectura = new LeerFichero1();
        lectura.lee();

    }
}

class LeerFichero1 {
    FileReader entrada;

    public void lee() {
        try {
          entrada = new FileReader("C:/Probando.txt");
          BufferedReader leerbuffer=new BufferedReader(entrada);
          String linea=leerbuffer.readLine();
          while(linea!=null){
              System.out.println(linea);
              linea=leerbuffer.readLine();
          }
            entrada.close();
        } catch (IOException ex) {
            System.out.println("Error al acceder al fichero");
        }
    }
}