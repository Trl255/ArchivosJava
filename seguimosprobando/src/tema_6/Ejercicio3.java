
import java.util.Scanner;

/**
 Introducir dos frases por teclado e indicar cuál de ellas es la más corta, es decir,
 * la que contiene menos caracteres.
 */
public class Ejercicio3 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String frase1, frase2;
        System.out.println("Introduzca la primera frase");
        frase1=entrada.nextLine();
        System.out.println("Introduzca la segunda frase");
        frase2=entrada.nextLine();
        
        if (frase1.length()>frase2.length()){
            System.out.println("La frase 1 es más larga");
        }else{
            System.out.println("La frase 2 es más larga");
        }
        
        
    }
    
}
