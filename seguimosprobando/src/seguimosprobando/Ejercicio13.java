/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;
import java.util.Scanner;
/**
 *
 * @author IFC303-1Ejercicio13. Escribir un programa que solicite las notas del primer, segundo y tercer trimestre
(notas enteras que se solicitarán al usuario). El programa debe mostrar la nota media del curso
como se usa en el boletín de calificaciones (solo la parte entera) y como se usa en el expediente
académico (con decimales).

 */
public class Ejercicio13 {
    public static void main (String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la nota del primer trimestre");
        double nota1=sc.nextDouble();
        System.out.println("Introduce la nota del segundo trimestre");
        double nota2=sc.nextDouble();
        System.out.println("Introduce la nota del tercer trimestre");
        double nota3=sc.nextDouble();
        double resultado=(nota1+nota2+nota3)/3;
        System.out.println("Tú nota media del trimestre es\n"+resultado);
        
}
    
}
