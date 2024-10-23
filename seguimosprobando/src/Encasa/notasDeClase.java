/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class notasDeClase {
    public static void main(String args[]){
    double media,nota1, nota2, nota3;
    
     
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Por favor introduzca la nota del primer trimestre");
    nota1=sc.nextDouble();
    System.out.println("Por favor introduzca la nota del segundo trimestre");
    nota2=sc.nextDouble();
    System.out.println("Por favor introduzca la nota del tercer trimestre");
    nota3=sc.nextDouble();
 
    media=(nota1+nota2+nota3)/3;
    System.out.println("Su nota de calificaciones de boletin es:" +Math.round(media));
        
    media=(nota1+nota2+nota3)/3;
    System.out.printf("%nSu nota de calificaciones en expediente académico es %.2f",media);
    
    /*  %n   lkñajdsñlkjfa %.2f
        %n      %.2f    %n      %.2f
   */
    
    
    
    /*System.out.printf("%nEl valor de la variable cantidad es %.2f", cantidad);    */
    }
    
}
