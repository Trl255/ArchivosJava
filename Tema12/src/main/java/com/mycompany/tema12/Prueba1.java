/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Prueba1 {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        int decision=0;
        boolean comprobacion=false;
        //Todo auto generar metodo Stub
        
        try {
            while (!comprobacion==true){
            
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Introducir datos");
            System.out.println("2. Salir del programa");
            decision = sc.nextInt();
            comprobacion=true;

        }} catch (InputMismatchException e) {
            System.out.println("No has introducido un dato valor correcto"+e);
        }
        
        

        

        if (decision == 1) {
            
            try(ObjectInputStream ois= new ObjectInputStream(new FileInputStream("prueba1.dat"))){
            pedirDatos();
            
            }catch(InputMismatchException e){
               System.out.println("Que has introducido en la edad " + e.getMessage());
            }
        } else {

            System.out.println("Adios");

            System.exit(0);
        }
        sc.close();
    
    }
    static void leerDatos(){
        try(ObjectOutputStream oos=new ObjectOutputStream (new FileOutputStream("prueba1.dat"))){
            while(true){
                
                        }
            }catch(IOException ex){
                    System.out.println("Error de lectura "+ex.getMessage());
                    }
        }
        
    

    static void pedirDatos() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int edad = 0;

        //try {

            System.out.println("Indtroduce tu nombre");
            String nombreUsuario = sc.nextLine();

            System.out.println("Introduce tu edad");
            edad = sc.nextInt();

            System.out.println("Hola, " + nombreUsuario + ", el año que viene tendrás, " + (edad + 1) + " años");
            sc.close();

        //} catch (InputMismatchException e) {
           // System.out.println("Que has introducido en la edad " + e.getMessage());

        //}

        System.out.println("hemos terminado");

    }

}
