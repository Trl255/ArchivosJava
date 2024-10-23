/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ02;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Crear un archivo TXT llamado "numeros" donde guardaresmos en cada linea un valor numerico entero que pediremos al usuario.
 * Despues el programa abrira el archivo y con su contenido crearemos un array que guardaremos en otro fichero llamado "datosArray.dat"
 * @author IFC303-1
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        BufferedWriter fichero=null;
        
        /*ESCRIBIMOS EN EL ARCHIVO "numeros.txt"*/
        try {
            fichero = new BufferedWriter( new FileWriter("numeros.txt"));
            System.out.println("Introduzca numeros para el archivo, 0 para salir");
            int linea = Metodos.readInt();
            while(linea != 0){      
                    //info += linea+"\n";    
                    fichero.write(linea+"\n");
                    System.out.println("Introduzca numeros para el archivo, 0 para salir");
                    linea = Metodos.readInt();                                      
            }
            
        } catch (IOException ex) {
            System.out.println("El fichero no se puede abrir. tenemos el error: "+ex);
        } finally {
            if(fichero != null)
                try {
                    fichero.close();
                } catch (IOException ex) {
                    System.out.println("ERROR al cerrar el fichero");
                }
        }
        
       
        /*USO UN BUFFERED READER PARA COMPROBAR QUE SE HA ESCRITO EN EL ARCHIVO CORRECTAMENTE*/
        BufferedReader archivo = null;
        String info="";
        try{
            archivo = new BufferedReader(new FileReader("numeros.txt"));
            String linea = archivo.readLine();
            while(linea != null){      
                info += linea+" ";    
                linea = archivo.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El fichero no se ha encontrado");
        } catch (IOException ex) {
            System.out.println("El archivo no se puede leer"+ex.getMessage());
        }
        /*FIN DE LA COMPROBACION*/
        
        
        //CON ESTO CREAMOS UN ARRAY CON EL STRING CON CADA ESPACIO
        String [] numeros=info.split(" ");
        
        
        /*CREAMOS UN FLUJO PARA GRABAR EN EL ARCHIVO "datosArray.dat" EL ARRAY*/
        ObjectOutputStream salida = null;
        try{
            salida = new ObjectOutputStream(new FileOutputStream("datosArray.dat"));
            for(int i=0; i<numeros.length;i++){
                salida.writeObject(numeros[i]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo");
        } catch (IOException ex) {
            System.out.println(ex);
        }finally{
            if(salida!=null){
                try{
                    salida.close();
                } catch(IOException ex){
                    System.out.println(ex);
                }
            }
        }
        
    }
}
