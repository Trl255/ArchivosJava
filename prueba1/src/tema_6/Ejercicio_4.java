/*Ejercicio 4. Diseñar el juego “Acierta la contraseña”. La mecánica del juego es la siguiente: el primer
jugador introduce la contraseña; a continuación, el segundo jugador debe teclear palabras hasta que
la acierte. Realizar dos versiones; en la primera se facilita el juego indicando si la palabra introducida
es mayor o menor alfabéticamente que la contraseña. En la segunda, el programa mostrará la longitud
de la contraseña y una cadena con los caracteres acertados en sus lugares respectivos y asteriscos en
los no acertados.
*/
package tema_6;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main (String args[]){
       Scanner sc=new Scanner(System.in);
        String contraseña="", intContra="";
        
        
        while (contraseña==""){
        System.out.println("Introduzca la palabra a guardar como contraseña");
        contraseña=sc.nextLine();
        }
        boolean intento=true;
        
        while (intento==true){
            intContra="";
        while (intContra==""){
            System.out.println("Introduza la palabra que cree que es la contraseña");
            intContra=sc.nextLine();
                    }
                if (contraseña.equals(intContra)){
                System.out.println("En horabuena la palabra \""+intContra+ "\" corresponde a la contraseña");
                    }
                else{
                System.out.println("La palabra \""+intContra+"\" no es la contraseña");
                opcion1mayorOmenorA(contraseña, intContra);
                opcion2longitudCarateres (contraseña, intContra);
                    }
                    }
           
    }static void opcion1mayorOmenorA(String contra, String intento){
            if (contra.compareTo(intento)<0){
                System.out.println("La contraseña es alfabeticamente mayor que "+intento);
                    }
            else 
                System.out.println("La contraseña es alfabeticamente menor que "+intento);
                    
    }static void opcion2longitudCarateres( String contra2, String intento2){
        int longitud=contra2.length();
        String asterisco="";
            System.out.println("La longitud de la contraseña es: "+longitud);
       if (intento2.length()>=contra2.length()){
         for (int i=0; i<contra2.length(); i++){
            if (contra2.charAt(i)==intento2.charAt(i)){
                    asterisco+=contra2.charAt(i);
                    }
            else{
                asterisco+="*";
                }
                }     
            System.out.println(asterisco);
           
}else{
           System.out.println("La palabra introducida tiene menos longidtud que la contrseña, la contraseña tiene "+contra2+" de longitud");
       }
}
}
        
