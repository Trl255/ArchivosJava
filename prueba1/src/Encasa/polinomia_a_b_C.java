/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
Dado el polinomio del ejercicio anterior, crea un programa que nos pida los coeficientes a, b y
c y calcule las soluciones de dicho polinomio.*/
package Encasa;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class polinomia_a_b_C {
       public static void main(String args[]){
        float a, b, c;
    Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el termino cuadrado");
        a=entrada.nextFloat();
        System.out.println("Introduce el termino en x");
        b=entrada.nextFloat();
        System.out.println("Introduce el termino independiente");
        c=entrada.nextFloat();
        if ((b*b-4*a*c)<0)
            System.out.println("Las raices no existen");
        else{
        double raiz1= ((-1)*b+ Math.sqrt(b*b-4*a*c))/(2*a);
        double raiz2= ((-1)*b- Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Las raices son: "+raiz1+ " y "+raiz2);}
    }
}
 

