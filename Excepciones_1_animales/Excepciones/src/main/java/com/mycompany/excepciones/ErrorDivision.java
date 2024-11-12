/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excepciones;

import javax.swing.JOptionPane;

public class ErrorDivision {
    public static void main(String[] args){
        
        try{
        division();
        }catch(ArithmeticException e)
        {
            System.out.println("Has dividido por cero");
        }catch (NumberFormatException e){
            System.out.println("No has introducido un valor entero");
            System.out.println(e.getMessage());
            System.out.println("Se ha produciro un error de este tipo: "+e.getClass().getName());
        }
        
    }
static void division(){
    int dividendo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el denominador"));
    int divisor=Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor")); 
    System.out.println("El resultado es: " + dividendo/divisor);
}
    
}

