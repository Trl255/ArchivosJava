
import java.util.Random;
import java.util.Scanner;


/**
 El juego consistirá en que un jugador escribe una palabra y la aplicación muestra un
anagrama (cambio del orden de los caracteres) al azar. Luego otro jugador, debe acertar el texto
original. No se permitirá que el texto introducido por el jugador sea la cadena vacía
 */
public class Ejercicio11 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String palabra="";
        while(palabra==""){
        System.out.println("Introduce una palabra");
        palabra=entrada.next();
        }
        char []letras=palabra.toCharArray();
        String anagrama="";
        for(int i=0;i<palabra.length();i+=2)
            anagrama+=letras[i];
         for(int i=1;i<palabra.length();i+=2)
            anagrama+=letras[i];
         System.out.println("El anagrama de la palabra buscada es "+anagrama);
         String valor="";
         Boolean res=true;
         while(res==true){
             valor="";
         while(valor==""){
             System.out.println("Introduce la palabra que crees que es");
             valor=entrada.next();}
             if(valor.equals(palabra)){
                 System.out.println("Has acertado la palabra");
                 break;
             }
             int coinciden =0;
             char []introducido=valor.toCharArray();
             for(int i=0;i<letras.length;i++)
             if(introducido[i]==letras[i])coinciden++;
             System.out.println("Has acertado "+coinciden+ " letras");
             System.out.println("¿Quieres intentarlo de nuevo?(true/false)");
             res=entrada.nextBoolean();
         }
         
        }
    }
    
    
