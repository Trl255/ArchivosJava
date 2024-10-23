
package Tema_8;
import java.util.Scanner;
public class textoPrincipal {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int longitud=0;
        String texto1="";
        
        while(longitud==0 ){
        System.out.println("Intoduzca una longitud máxima");
        longitud=sc.nextInt();
        sc.nextLine();
        texto longitudMax=new texto(longitud);
        }      
        
        System.out.println("Intoduzca una cadena de texto, que no sea más grande de la longitud: "+longitud);
        texto1=sc.nextLine();
        
        texto texto2=new texto(texto1, longitud);
        
        System.out.println("Introduzca un caracter que no exceda la longitud: "+longitud);
        char c=sc.next().charAt(0);
        
        texto2.caracterFinal(c);
        texto2.caracterInicio(c);
        texto2.comprobacionVocales(longitud);
        texto2.mostrarInformacion();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

