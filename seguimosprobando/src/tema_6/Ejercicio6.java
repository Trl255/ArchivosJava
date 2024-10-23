
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 Diseñar una función a la que se le pase una cadena de caracteres y la devuelva 
 * invertida. Por ejemplo, “Hola mundo”, se convertirá en “odnum aloH”
 */
public class Ejercicio6 {
    public static void main(String [] args){
       Scanner entrada = new Scanner(System.in);
        String frase1;
        System.out.println("Introduce la frase");
        frase1=entrada.nextLine();
        String invertida="";
        for(int i=frase1.length()-1;i>=0;i--){
            invertida+=frase1.charAt(i);
        }
        System.out.println(invertida);
            
    }
}
