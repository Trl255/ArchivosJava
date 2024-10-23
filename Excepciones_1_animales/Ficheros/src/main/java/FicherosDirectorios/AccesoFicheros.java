/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FicherosDirectorios;
import java.io.*;

public class AccesoFicheros {
    public static void main(String[] args){
        File archivo=new File("C:"+File.separator+"Serializacion");
        System.out.println(archivo.getAbsoluteFile());
        String nombreFicheros []=archivo.list();
        
        for(int x=0;x<nombreFicheros.length;x++){
            System.out.println(nombreFicheros[x]);
            File fic= new File(archivo.getAbsolutePath(),nombreFicheros[x]);
            if (fic.isDirectory()){
                String [] subfich=fic.list();
                for(int j=0;j<subfich.length;j++)
                {
                    System.out.println(subfich[j]);
                }
        }
        }
    }
}
