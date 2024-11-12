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
public class cantidadDeAlumnos {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int alumnos, mayoredad=0, contador=0, edad, menoredad=0, total=0;
        
       while (contador<10){
           contador++;
        System.out.println("Introduzca la edad del alumno "+contador);
                edad=sc.nextInt();
                total+=edad;
                if (edad>=18)
                    mayoredad++;
                    else 
                    menoredad++;
                
    }System.out.println("La suma total de años de los alumnos es: "+total+" de los cuales son "+menoredad+" menores de edad y "+mayoredad+" mayores de edad");
                
    }
    
}
