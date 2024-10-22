/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FicherosDirectorios;

import java.io.*;
public class UtilizandoRutas {
    public static void main(String[] args){
        File archivo = new File("ejemplo.txt");
        //Si no especificamos la ruta, la carpeta donde va buscar el archivo
        //es donde tenemos guardados nuestros proyectos en nuestro caso Ficheros
        System.out.println(archivo.getAbsolutePath());
        //Para saber si existe utilizaremos
        System.out.println(archivo.exists());
    }
    
}
