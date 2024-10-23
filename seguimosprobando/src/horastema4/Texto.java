/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horastema4;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author profesor
 */
public class Texto {
    String texto;
    int longitud;
    LocalDate fechaCreacion;
    LocalDateTime fechaModificacion;
    
   /* Texto(int longitud){
        this.texto="";
        this.longitud=longitud;
        this.fechaCreacion=LocalDate.now();
    }*/
    Texto(int longitud,String texto){
        this.texto=texto;
        this.longitud=longitud;
        this.fechaCreacion=LocalDate.now();
    }
    Texto(int longitud){
        this(longitud,"");
    }
    void masUnCaracterFinal(char c){
        if(texto.length()<longitud){
        texto=texto+c;
        fechaModificacion=LocalDateTime.now();}
        else
            System.out.println("El texto ya tiene la longitud máxima");
        
    }
     void masUnCaracterPrincipio(char c){
        if(texto.length()<longitud){
        texto=c+texto;
        fechaModificacion=LocalDateTime.now();}
        else
            System.out.println("El texto ya tiene la longitud máxima");
        
    }
       void masCadenaFinal(String c){
        if(texto.length()+c.length()<longitud){
        texto=texto+c;
        fechaModificacion=LocalDateTime.now();}
        else
            System.out.println("El texto ya tiene la longitud máxima");
        
    }
         void masCadenaPrincipio(String c){
        if(texto.length()+c.length()<longitud){
        texto=c+texto;
        fechaModificacion=LocalDateTime.now();}
        else
            System.out.println("El texto ya tiene la longitud máxima");
        
    }
         int contarVocales(){
             String vocales="aeiouAEIOUáéíóúÁÉÍÓÚ";
             int contador=0;
             for(int i=0;i<texto.length();i++){
                 if(vocales.indexOf(texto.charAt(i))>=0)
                     contador++;
             }
             return contador;
         }
         
         void mostrarInformacion(){
             System.out.println("El texto es: "+texto);
             System.out.println("El número máximo de caracteres es: "+longitud);
             System.out.println("La fecha de creacion es: "+fechaCreacion);
             System.out.println("La última modificación es: "+fechaModificacion);
         }
}
