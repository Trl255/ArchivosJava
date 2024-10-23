       /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class caracter {
    public static void main(String args[]){
        Scanner scc=new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero=scc.nextInt();
        
        char caracter=(char)numero;
        System.out.println("tu número"+numero+ "convertido den caracter es;\n"+caracter);
    }
}
