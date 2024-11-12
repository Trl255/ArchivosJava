/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horastema4;

import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Principal {
    public static void main(String []args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Dime la hora");
        int hora=entrada.nextInt();
        while(hora<0 && hora>23){
            System.out.println("La hora esta entre 0 y 23");
            hora=entrada.nextInt();
        }
        
        System.out.println("Dime el minuto");
        int minuto = entrada.nextInt();
        while(hora<0 && hora>59){
            System.out.println("Dime el minuto");
            minuto = entrada.nextInt();
           }
        System.out.println("Dime los segundos");
        int segundo = entrada.nextInt();
        while(hora<0 && hora>59){
         System.out.println("Dime los segundos");
         segundo = entrada.nextInt();
         }
        Horas hora1 = new Horas(hora,minuto,segundo);
        
        System.out.println("Introduce los segundos a incrementar");
        int segundosMas=entrada.nextInt();
        hora1.incrementarSegundos(segundosMas);
       //Horas hora1=new Horas();
       
     
        
    }
    
}
