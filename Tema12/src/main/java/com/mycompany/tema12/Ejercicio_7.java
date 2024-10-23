/*Diseña una aplicación que pida al usuario su nombre y edad. Estos datos deben guardarse
en el fichero datos.txt. Si este fichero existe, deben añadirse al final en una nueva línea, y en caso de
no existir, debe crearse.*/
package com.mycompany.tema12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author IFC303-1
 */
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int edad=0; String nombre="", contenido="";
        
        System.out.println("Introducir el nombre");
        nombre=sc.nextLine();
        
        System.out.println("Introduce la edad");
        edad= sc.nextInt();
        
        BufferedWriter fichero= null;
        try{
            fichero=new BufferedWriter (new FileWriter ("datos.txt", true));
            fichero.write(nombre+" "+edad);
            fichero.close();
        }catch(IOException ex){
            try{
                fichero.write("\n"+nombre+edad);
            }catch(IOException e){
                
                
            }
                
                }
            
        
    }
    
}
