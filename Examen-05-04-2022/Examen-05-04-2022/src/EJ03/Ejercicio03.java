/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ03;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Un programa que pida al usuario un fichero y que compruebe si existe. 
 * Si el fichero existe que lo elimine
 * @author IFC303-1
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //PEDIMOS EL NOMBRE DEL FICHERO
        //EN LA RAIZ DEL PROYECTO HAY UN ARCHIVO "pruebaEJ03.txt" para hace la comprobacion
        System.out.println("Introduce el nombre del fichero para comprobar si existe, en caso de que exista se eliminará");
        String ficheroName = sc.nextLine();
        File archivo = new File(ficheroName);
        
        //SI EL FICHERO EXISTE SE BORRARA, DE LO CONTRARIO SE MUESTRA UN MENSAJE DE QUE NO SE HA ENCONTRADO
        if(archivo.exists()){
            System.out.println("El fichero se ha encontrado, se borrará");
            archivo.delete();
        }else{
            System.out.println("El archivo no existe");
        }
    }
}
