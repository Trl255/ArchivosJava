/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excepciones;

/**
 *
 * @author mama
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Errores {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        int  decision;
        System.out.println("Introduce una opción");
        System.out.println("1. Introduce datos");
        System.out.println("2. Salir");
        
        decision=entrada.nextInt();
        if(decision==1){
            try{
            getPedirDatos();
            
            }catch(InputMismatchException e)
            {
             System.out.println("La edad es un número entero");   
            }
        }
        else
        {
            System.out.println("Adios");
            System.exit(0);
        }
    }
     static void getPedirDatos() throws InputMismatchException{
         Scanner datos=new Scanner(System.in);
         System.out.println("Introduce un nombre");
         String nombre=datos.nextLine();
         System.out.println("Introduce tu edad");
         int edad=datos.nextInt();
      }
}
