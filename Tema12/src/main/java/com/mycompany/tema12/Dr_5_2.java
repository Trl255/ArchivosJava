
package com.mycompany.tema12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Dr_5_2 {
    public static void main(String[] args) {
        String linea="";
        Scanner sc= new Scanner (System.in);
        
        
        System.out.println("Introduzca el nombre del fichero a leer");
        String fichero= sc.nextLine();
        try (BufferedReader br= new BufferedReader (new FileReader(fichero+".txt"))){
            
            while ((linea= br.readLine()) != null){
                System.out.println(linea);
                
            }
        }catch(IOException e){
            System.out.println("Error al abrir el archivo");
        }
        
        
        
        
    }
    
}
