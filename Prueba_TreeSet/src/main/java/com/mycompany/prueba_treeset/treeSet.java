/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_treeset;
import java.util.*;
/**
 *
 * @author josea
 */
public class treeSet {
    public static void main(String[] args) {
        
        
        TreeSet<String> ordenaPersona= new TreeSet<String>(); 
//      treeSet<String> ordenaPeronas= new treeSet<String>();

        
        ordenaPersona.add("Sandra");
        ordenaPersona.add("Maria");
        ordenaPersona.add("Patricia");
        ordenaPersona.add("Sandra");
        ordenaPersona.stream()
                .sorted()
                .filter(e->e.equalsIgnoreCase("sandra"))
                .forEach(e->System.out.println(e));
        
        
                
    }
    
    
}
