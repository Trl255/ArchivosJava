/*Ejercicio4. Crear con un editor el fichero de texto Jugadores.txt en la carpeta del proyecto de NetBeans
actual y escribir en él los nombres, edades y estaturas de los jugadores de un equipo, cada uno en una
línea.
Implementa un programa que lea del fichero los datos, muestre los nombres y calcula la media de la
edad y de las estaturas, mostrándolas por pantalla.*/
package Tema_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio_4 {
    public static void main(String[] args) {
        String informacion="";
        BufferedReader flujo = null;
         
        
        try{
            flujo= new BufferedReader(new FileReader("Jugadores.txt"));
            String linea=flujo.readLine();
            
            while (linea!=null){
                informacion+=linea+" ";
                linea=flujo.readLine();
            }
            
        }catch(IOException es){
            System.out.println("Error de lectura"+es.getMessage());
            
        }
        finally{
        if (flujo!=null){
            try{
                flujo.close();
                System.out.println("Ya hemos cerrado el fichero");
            }catch (IOException es){
                System.out.println("Error al cerrar el fichero"+es);
            }
        }
    }
        System.out.println(informacion);
        String []array=informacion.split(" ");
        System.out.println(array);
        System.out.println("Los nombres son: "+array[0]+", "+array[3]+", "+array[6]);
        //procedimiento para realizar las medias de las edades
        double sumaE=0, cont=0;
        
        for (int i=1; i<array.length; i+=3){
        sumaE+=Double.valueOf(array[i]).doubleValue();
        cont++;
            //System.out.println(array[i]);
         }
               
        double mediaE=0;
        mediaE=(double)(sumaE/cont);
        System.out.printf("Las medias de las edades es: %.2f", mediaE);
        //procedimiento para sacar las medias de las altura
        double sumaA=0, mediaA=0;
        
        for (int i=2; i<=array.length; i+=3){
        sumaA+=Double.valueOf(array[i]).doubleValue();
         //System.out.println(array[i]);
         }
        mediaA=sumaA/cont;
        System.out.printf("La media de la altura es: %.2f",mediaA);
        
        
        }
    
}
