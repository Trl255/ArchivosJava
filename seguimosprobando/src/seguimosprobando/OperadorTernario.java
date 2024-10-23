/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class OperadorTernario {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int primer=sc.nextInt();
        System.out.println("Introduce otro número");
        int segundo=sc.nextInt();
        String valor=(primer>segundo)?"mayor":"menor";
        System.out.println("El primer número es mayor\n"+valor+"El segundo número es mayor");
        
    }
    
}
