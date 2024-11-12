/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada;

import java.io.*;
public class LeyendoEscribiendoBytes {
    public static void main(String[] args){
        
        try{
        FileInputStream leer = new FileInputStream("C:/Users/maite/Desktop/Imagen.jpg");
        FileOutputStream escribir = new FileOutputStream("C:/Users/maite/Desktop/ImagenCopia.jpg");
        int c=leer.read();
        while(c!=-1)
        {
        escribir.write(c);
        System.out.println(c);
        c=leer.read();
         }
         leer.close();
         escribir.close();
         }catch(IOException e){
             System.out.println("Error al abrir el fichero");
        }
        }
        
    }
    
