/*
Crea un fichero de texto con el nombre y contenido que tu quieras. Ahora crea una aplicación que 
lea este fichero de texto carácter a carácter y muestre su contenido por pantalla  sin espacios. 
Por ejemplo, si un fichero tiene el siguiente texto “Esto es una prueba”, deberá mostrar “Estoesunaprueba”.
 */
package com.mycompany.tema12;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author IFC303-1
 */
public class EP_1 {
    public static void main(String[] args) throws IOException {
        String linea="";
        int c=0;
        
        
        try(FileReader fr=new FileReader("EP_1.txt")){
            
            while ((c=fr.read())!=-1){
                if (c!=32){
                linea += (char)c;
                }
            }
            
            
        }catch(IOException e){
            System.out.println("Error E/S "+e.getMessage());
        }
        
        System.out.println(linea);
        
        
        
        
        }
    }
    

