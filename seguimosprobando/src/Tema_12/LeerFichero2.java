
package Tema_12;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerFichero2 {
     public static void main(String[] args) {
    
         
        String informacion="";
      
        try{
            FileReader conexion = new FileReader ("x.txt");
            int c=conexion.read();
            while (c!=-1){
                informacion+=(char)c;
                c=conexion.read();
                }
        }catch (IOException ex){
            System.out.println("El fichero no existe "+ex.getMessage());
        }System.out.println(informacion);
     }
}
