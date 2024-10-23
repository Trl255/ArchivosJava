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
public class calificaciones5 {
    public static void main(String args[]){
        int suspensos=0, aprobados=0,nota=0,x;
        Scanner sc=new Scanner(System.in);
        for (x=1; x<=5; x++)
        {
            System.out.println("Introduce tu nota");
            nota=sc.nextInt();
            if (nota>=5)
                aprobados++;
            else
                suspensos++;
        }
        if (suspensos>0)
            System.out.println("Hay "+suspensos+" alumnos suspendidos");
        else
            System.out.println("Hay "+aprobados+" alumnos aprobados");
           
        
        
        /*System.out.println("Dime tu nota");
        for(x=1; x<=5;x++)
        {
            System.out.println("Dime tu nota");
            nota=sc.nextInt();
            if(nota>=5)
                aprobados++;
            else
                suspensos++;
        }
    if(suspensos>=1)System.out.println("Hay "+suspensos+ " alumnos suspendidos");
    else System.out.println("No hay suspensos");*/
        }
        
        
    }
