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
public class calificaciones6 {
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int aprobados=0, suspensos=0, x=0, nota=0, fuera_rango=0;
   for (x=1; x<=6; x++)
   {
       System.out.println("Introduzca una nota");
       nota=sc.nextInt();
       
       if (nota<5)
           suspensos++;
       if (nota>10)
           fuera_rango++;
       else
           aprobados++;
   }
        if (suspensos>0)
            System.out.println("Hay "+suspensos+" suspensos y " +aprobados+" aprobados y "+fuera_rango+" fuera de notas válidas");
        if (nota>10){
            System.out.println("Hay "+fuera_rango+" notas introducidas no validas");
        }else
            System.out.println("Hay "+aprobados+" aprobados");
   }
        
 }       
        
        
        
        
        /* Scanner sc=new Scanner(System.in);
    int x, nota=0, aprobados=0, suspensos=0;
    for (x=1; x<=6; x++)
    {
        System.out.println("Introduce tu nota");
        nota=sc.nextInt();
        
        if (nota>4)
            aprobados++;
        else 
            suspensos++;                
    }
        if (suspensos>0)
            System.out.println("Existen "+suspensos+" supensos y " +aprobados+ "aprobados");
        else
            System.out.println("Existen " +aprobados+ " aprobados");*/
    
        

