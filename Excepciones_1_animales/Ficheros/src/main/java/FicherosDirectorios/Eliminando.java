/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FicherosDirectorios;

import java.io.File;
import java.io.IOException;


public class Eliminando {
     public static void main(String[] args) throws IOException{
       File archivo=new File("C:"+File.separator+"Serializacion"+File.separator+"carta.txt");
       archivo.delete();
     }
    
}
