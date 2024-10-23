
package Tema_12;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        String informacion="";
            FileReader conexion =null;
        
      
        try{
            conexion  = new FileReader ("NumerosReales.txt");
            int c=conexion.read();
            while (c!=-1){
                informacion+=(char)c;
                c=conexion.read();
                }
        }catch (IOException ex){
            System.out.println("El fichero no existe "+ex.getMessage());
        
        }finally{
        if (conexion!=null){
            try{
                conexion.close();
            }catch(IOException ex){
                System.out.println(ex);
            }
    }
         System.out.println(informacion);   
        }
}
}

        
        
        
