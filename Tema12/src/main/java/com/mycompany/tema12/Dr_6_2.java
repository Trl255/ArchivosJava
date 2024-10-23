package com.mycompany.tema12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class Dr_6_2 {
    public static void main(String[] args) {
        File f = new File("numeros.txt");
        File fSalida= new File ("Mayores.txt");
       
        int num, numUsuario;

        try (Scanner sc = new Scanner(f);
            Scanner scUsuario= new Scanner(System.in);
            PrintWriter pw= new PrintWriter (fSalida)){
            
            
            System.out.println("Introduce un numero");
            numUsuario=scUsuario.nextInt();
            
            System.out.println("");
            System.out.println("Fichero");

            while (sc.hasNext()) {
                num = sc.nextInt();
                
                if (numUsuario<num){
                    pw.println(num);
                    
                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error, archivo no encontrado" + ex.getMessage());
        }
        
    }

}
