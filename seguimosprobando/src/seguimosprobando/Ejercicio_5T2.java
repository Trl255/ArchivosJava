/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;

import java.util.Scanner;

/**
 *ax^2+bx+c=0
 *
 * @author IFC303-1
 */
public class Ejercicio_5T2 {
    public static void main(String args[]){
        Scanner entradad=new Scanner(System.in);
        System.out.println("introduce el termino cuadrado");
        float b=entrada.nextFloat();
        System.out.println("introduce el termino en x");
        float a=entrada.nextFloat();
        System.out.println("introduce el termino independiente");
        float c=entrada.nextFloat();
        if ((b*b-4*a*c)<0)
            System.out.println("Las raices no existen");
        else{
            double raiz1=((-1)*b+Math.sqrt(b*b-4*a*c))/(2*a);
            double raiz2=((-1)*b-Math.sqrt(b*b-4*a*c))/(2*a);
        }
        
        
        
        
        
        
        
        
}}
