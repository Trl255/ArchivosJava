/*
Pedir al usuario su nombre. Comprobaremos si el nombre es compuesto, para ello buscaremos un espacio en blanco y
extraeremos en dos cadenas distintas el primer y segundo nombre (vamos a considerar que no hay más
de dos nombres
 */
package tema_6;
import java.util.Scanner;
public class ejemplo_1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int spc=0;
    char t='\n';
    String c="1234.5678";
    double n;
    float precio=3.3f;
    String salida=String.format("El precio es %.2f", precio);
        System.out.println(""+salida);
    
    
    
    
        System.out.println("Introduzca un nombre ");
        String nombre=sc.nextLine();
        
        char []vector=new char [nombre.length()];
        for (int i=0;  i<nombre.length(); i++){
            vector [i]=nombre.charAt(i);
        if  (vector [i]==' '){
            spc=i;
            
        }
        }
    String nombre1=nombre.substring(0,spc);
    String nombre2=nombre.substring(spc+1);
    
    if (spc!=0){
        System.out.println("Tienes nombre compuesto");
        System.out.println("Tu primer nombre es: "+nombre1+t+" tu segundo nombre es: "+nombre2);
        
    }else 
            System.out.println("Sólo tienes un nombre "+nombre1);
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*int spc=0;
    char t='\n';
    
    
        System.out.println("Introduzca su nombre");
        String nombre=sc.nextLine();
        
        char []vector=new char[nombre.length()];
        for (int i=0; i<nombre.length(); i++){
            vector [i]=nombre.charAt(i);
            if (vector[i]==' '){
            spc=i;
        }
        }
    
    String nombre1=nombre.substring(0, spc);
    String nombre2=nombre.substring(spc+1);
    
    if (spc!=0){
        System.out.println("Tienes nombre compuesto"+t);
        System.out.println("El primero nombre es: "+t+nombre1 );
        System.out.println("El segundo nombre es: "+t+nombre2);
    }else
            System.out.println("Sólo tienes 1 nombre "+nombre1);
       
*/   
    }
}
