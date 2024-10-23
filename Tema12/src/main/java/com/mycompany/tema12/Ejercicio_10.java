/*En el archivo números.txt disponemos de una serie de números (uno por línea). Diseña un
programa que procese el fichero y nos muestre el menor y el mayor. */
package com.mycompany.tema12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author IFC303-1
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        int numero =0, aux=0;
        
        
        try(FileReader lectura= new  FileReader("numeros.txt"); FileWriter escritura=new FileWriter("numeros.txt", true)){
            
            while ((numero=lectura.read())!=-1){
                
                
                if (numero<aux ){
                    numero=aux;
                    numero+=numero;
                    
                    
                }
                

        }
                            System.out.println(numero);
        
        
        }catch(IOException ex){
            
        }
        
        
        
        
    }
    
}
