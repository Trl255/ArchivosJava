/*Ejercicio11. 
Un libro de firmas es útil para recoger los nombres de todas las personas que han pasado
por un determinado lugar. Crea una aplicación que permita mostrar el libro de firmas e insertar un
nuevo nombre (comprobando que no se encuentre repetido). Llamaremos al fichero firmas.txt.
Ejercicio12. Escribe un programa que compare dos archivos y nos diga si son iguales o distintos. El
programa deberá decirnos en qué línea y carácter se encuentra la primera diferencia. Usa los ficheros
texto1.txt y texto2.txt.*/
package com.mycompany.tema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T_12_Ejercicio11 {
    public static void main(String[] args) {
        BufferedReader flujo =null;
        String informacion="";
        
        try {
            flujo = new BufferedReader (new FileReader("libreta.txt"));
            String linea=flujo.readLine();
            
            while (informacion!=null){
            informacion+=linea;
            linea=flujo.readLine();
            }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(T_12_Ejercicio11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
}
