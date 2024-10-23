
import java.util.Scanner;



/**
Diseñar una aplicación que pida al usuario que introduzca una frase por teclado
* e indique cuántos espacios en blanco tiene.
 */
public class Ejercicio5 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String frase1;
        System.out.println("Introduce la frase");
        frase1=entrada.nextLine();
        int espacios=contarespacios(frase1);
        System.out.println("El número de espacios en blanco es "+ espacios);
    }
    static int contarespacios(String frase){
        int numero=0,posicion=0;
        posicion=frase.indexOf(" ",posicion);
        while(posicion!=-1){
            numero++;
            posicion= frase.indexOf(" ",posicion+1);
        }
        return numero;
    }
}
