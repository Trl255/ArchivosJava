/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manejolambdas;

import java.util.function.Predicate;

/**
 *
 * @author IFC303-1
 */
public class OtroPredicate {
    public static void main(String[] args) {
        
        
        Predicate<Integer> esDivSeis= e->(e%6)==0;
        Predicate <Integer> mayorTreinta= e->e>30;
        System.out.println(esDivSeis.test(36));
        
        
        
        
        System.out.println("-----------------");
        
        
        Predicate <Integer> esPositivo= e->e>0;
        Predicate <Integer> esPar= e->(e%2)==0;
        
         System.out.println(esPositivo.test(8));
         System.out.println(esPar.test(7));
         
         System.out.println(esPar.and(esPositivo).test(7));
        
        
    }
    
}
