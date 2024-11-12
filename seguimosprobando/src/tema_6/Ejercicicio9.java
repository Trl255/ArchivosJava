
import java.util.Scanner;


/**
Introducir por teclado una frase palabra a palabra, y mostrar la frase completa 
* separando las palabras introducidas con espacios en blanco. Terminar de leer 
* la frase cuando alguna de las palabras introducidas sea la cadena “fin” 
* escriba en cualquier combinación de mayúsculas y minúsculas. 
* La cadena “fin” no aparecerá en la frase final.
 */
public class Ejercicicio9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String frase="",comprobacion="";
        System.out.println("Introduce una palabra de la frase");
        String palabra=entrada.next();
        comprobacion=palabra.toLowerCase();
        while(!comprobacion.equals("fin")){
            frase=frase+palabra+" ";
            System.out.println("Introduce la siguiente palabra");
            palabra=entrada.next();
            comprobacion=palabra.toLowerCase();
        }
        System.out.println(frase);
   }
}
