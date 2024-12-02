/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileReader_Writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Lectura_escritura {
    
    public static void main(String[] args) {
        //LEER file1.txt
        PrintWriter file1=null;
        Scanner readFile1=null;
        String[][]words;        
        
        try {
            readFile1=new Scanner(new FileReader("file1.txt"));
        } catch (IOException ex) {
            System.out.println("Error: "+ex.getMessage());
        }finally{
            if(file1!=null){
                file1.close();
            }
        }
        words=new String[3][3];
        for (int i = 0; i < words.length; i++) {
    for (int j = 0; j < words[i].length; j++) {
        if (readFile1.hasNext()) {  // Asegura que hay más palabras antes de leer
            words[i][j] = readFile1.next();
        } else {
            System.out.println("El archivo no tiene suficientes palabras.");
            return;  // Termina el programa si no hay suficientes palabras
        }
    }
}
        //CREAR Y RELLENAR file2.txt
        PrintWriter file2=null;
        int counter=0;        
        try{        
            file2 = new PrintWriter(new FileWriter("file2.txt"));
            for(int i=0;i<words.length;i++){
                for(int j=0;j<words[i].length;j++) {
                    String word=words[i][j].toString();
                    for(int x=0;x<word.length();x++){
                        counter++;                        
                    }
                    file2.print(counter+" ");
                    counter=0;
                }
                file2.println();
            }
        }catch(IOException ex){
            System.out.println("Error: "+ex.getMessage());
        }finally{
            if (file2!=null)
                file2.close();
        }        
    
        System.out.println("\nfile2.txt ha sido escrito.");
    }
}


