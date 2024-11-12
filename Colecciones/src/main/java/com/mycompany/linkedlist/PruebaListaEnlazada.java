/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author josea
 */
public class PruebaListaEnlazada {

    public static void main(String[] args) {
        LinkedList<String> paises = new LinkedList<String>();

        paises.add("España");
        paises.add("Nicaragua");
        paises.add(("Mexico"));
        paises.add("Perú");

        LinkedList<String> capitales = new LinkedList<String>();
        capitales.add("Madrid");
        capitales.add(("Managua"));
        capitales.add("DF");
        capitales.add("Lima");

        //System.out.println(paises);
        //System.out.println(capitales);

        //ListIterator<String> itPaises = paises.listIterator();
        ListIterator<String> itP= paises.listIterator();
        ListIterator<String> itC= capitales.listIterator();
        
            while(itC.hasNext()){
                if(itP.hasNext()){
                    itP.next();
                }
                itP.add(itC.next());
            }
        
        System.out.println("Estos son los paises con sus capitales:\n"+paises);
        
        itC= capitales.listIterator();
        
        while (itC.hasNext()){
            itC.next();
            if(itC.hasNext()){
                itC.next();
                
                itC.remove();
            }
        }
        System.out.println(capitales);
        
        paises.removeAll(capitales);
        System.out.println(paises);
        
        
        
    }

}
