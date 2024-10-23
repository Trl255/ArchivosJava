/*Ejercicio3. Crear con un editor un archivo de texto con un conjunto de números reales, uno por línea.
Abrirlo con un flujo de texto para lectura y leerlo línea a línea. Convertir las cadenas leídas en números
de tipo double por medio de Scanner, y mostrar al final la suma de todos ellos.*/

package Tema_12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Ejercicio_3 {
    public static void main(String[] args){
        BufferedReader flujo=null;
        
        
        try{
            flujo= new BufferedReader ( new FileReader("NumerosReales.txt"));
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());   
            
        }
        
        Scanner sc= new Scanner (flujo);
        double suma=0;
        
        while (sc.hasNext()){
            int n =sc.nextInt();
            System.out.println(n+" ");
            suma+= n;
            
        }
            
        
        System.out.println("suma= "+suma);
            
        
        
    }
    
}
