/* DiseÃ±ar un programa que solicite al usuario una frase e indique, para cada letra 
 * que aparece en la frase, cuÃ¡ntas veces se repite. Las letras mayÃºsculas y 
 * minÃºsculas se consideran iguales a la hora de realizar la cuenta */
package tema_6;
import java.util.Scanner;
public class Ejercicio_10 {
   public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String frase="",contabilizada="";
        int n=0;
        System.out.println("Introduce una frase");
        frase=entrada.nextLine();
        
        for(int i=0;i<frase.length();i++){
            if((contabilizada.indexOf(frase.toLowerCase().charAt(i))==-1) && (frase.charAt(i)!=' ')){
               contabilizada+=frase.toLowerCase().charAt(i);
               n = contarLetras(frase.toLowerCase(), frase.toLowerCase().charAt(i));
               System.out.println("La letra "+frase.charAt(i)+ " aparece "+ n + " veces");
        }
        }
    }
       static int contarLetras(String frase, char c){
        int numero=0,posicion=0;
        posicion=frase.indexOf(c,posicion);
        while(posicion!=-1){
            numero++;
            posicion= frase.indexOf(c,posicion+1);
        }
        return numero;
    }
    
}  
