/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mama
 */
public class LeyendoEscribiendoBuffers {
    public static void main(String[] args){
        byte buf[]= new byte[1024];
        try{
        File leer = new File("C:/Users/maite/Desktop/Imagen.jpg");
        File escribir = new File("C:/Users/maite/Desktop/ImagenCopia1.jpg");
        InputStream entrada=new FileInputStream(leer);
        OutputStream escribirLineas=new FileOutputStream(escribir);
        int c=entrada.read(buf);
        
        while(c>=0)
        {
        escribirLineas.write(buf);
       
       // System.out.println(c);
        c=entrada.read(buf);
         }
         entrada.close();
         escribirLineas.close();
         }catch(IOException e){
             System.out.println("Error al abrir el fichero");
        }
        }
        
    
}
