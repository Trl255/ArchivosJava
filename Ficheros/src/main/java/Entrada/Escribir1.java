/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada;

import java.io.FileWriter;
import java.io.IOException;
public class Escribir1 {
    public static void main(String[] args){
        Escribiendo fichero = new Escribiendo();
        fichero.escribir();
    }
}class Escribiendo{
    public void escribir(){
        String frase="Estoy escribiendo";
        try {
           FileWriter escritura = new FileWriter("C:/Usuarios/maite/Escritorio/Probando.txt");
           for(int x=0;x<frase.length();x++)
               escritura.write(frase.charAt(x));
           escritura.close();
        } catch (IOException ex) {
            System.out.println("Error al abrir el fichero "+ex);
        } 
     }
}
        
