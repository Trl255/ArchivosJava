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
import java.util.Scanner;
public class ErrorArray {
    public static void main(String[] args){
       int edad; 
       boolean acceso=true;
       while(acceso==true){
       // while(acceso) { 
       Scanner entrada = new Scanner(System.in);
       System.out.println("Introduce tu edad");
       try{
       edad= entrada.nextInt();
       acceso=false;
       }catch(Exception e){
       System.out.println("Error al introducir la edad");
        }
    }
    }
}
