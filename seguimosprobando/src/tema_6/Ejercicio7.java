
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales
(mayúsculas, minúsculas y acentuadas).
 */
public class Ejercicio7 {
    public static void main(String[]args){
        //Para no tener problemas con los acentos, las ñ, etc.
        //usaremos este segundo parámetro para la clase Scanner
         //Se puede usar en el resto de ejercicios que también pueden
        //dar problemas
       Scanner entrada = new Scanner(System.in,"ISO-8859-1");
        String nombre="";
        System.out.println("Introduce tu nombre");
        nombre=entrada.nextLine();
        String sinVocales=quitarVocales(nombre);
        System.out.println("El nombre sin vocales es "+ sinVocales);
    }
    
    static String quitarVocales(String nomCompleto){
        String resultado="";
        String vocales="AEIOUáéíóúÁÉÍÓÚaeiou";
        for(int i=0;i<nomCompleto.length();i++){
            if(vocales.indexOf(nomCompleto.charAt(i))<=0)
                resultado+=nomCompleto.charAt(i);
            
        }
        return resultado;
  }
}
