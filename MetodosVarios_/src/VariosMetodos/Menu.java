/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodosvarios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Menu {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    boolean salir=false;
    int opcion=0;
            
    while (!salir){
    
        System.out.println("--------------1. Opción 1-----------------------");
        System.out.println("--------------2. Opción 2-----------------------");
        System.out.println("--------------3. Opción 3-----------------------");
        System.out.println("--------------4. Opción 4-----------------------");
        System.out.println("--------------5. Opción 5-----------------------");
        System.out.println("--------------6. Opción 6-----------------------");
        System.out.println("--------------7. Opción 7-----------------------");
        System.out.println("--------------8. Opción 8-----------------------");
        System.out.println("--------------9. salir-----------------------");
        
    try{
        
        
        System.out.println("Introducela opción a realizar");
        opcion=sc.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Esta es la opcion 1");
                
                break;
            case 2:
                System.out.println("Esta es la opcion 2");
                
                break;
            case 3:
                System.out.println("Esta es la opcion 3");
                
                break;
            case 4:
                System.out.println("Esta es la opcion 4");
                
                break;
            case 5:
                System.out.println("Esta es la opcion 5");
                
                break;
            case 6:
                System.out.println("Esta es la opcion 6");
                
                break;
            case 7:
                System.out.println("Esta es la opcion 7");
                
                break;
            case 8:
                System.out.println("Esta es la opcion 8");
                
                break;
            case 9:
                
                
                System.out.println("Has elegido salir");
                salir=true;
                break;
                
        }
    }catch(InputMismatchException e){
         System.out.println("Debes introducir un número de las opciones"+e.getMessage());   
         sc.next();
            }
    
}
        System.out.println("Fin del menú");
    }
    
    
}
