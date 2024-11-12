/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manejolambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author profesor
 */
public class Principal {
     public static void main(String[] args){
          List <Cliente> misClientes = new ArrayList<>();
        misClientes.add(new Cliente("91111111P","Manolo",22));
        misClientes.add(new Cliente("12547896S","Beatriz",35));
        misClientes.add(new Cliente("11111112Q","Luis",45));
        misClientes.add(new Cliente("21111111A","Ana",66));
        System.out.println("Los clientes son "+ misClientes.toString());
        Collections.sort(misClientes);
        System.out.println("Los clientes son "+ misClientes.toString());
      /*  Comparator <Cliente> ordenaNombre=new Comparator<>() {
              @Override
              public int compare(Cliente o1, Cliente o2) {
          return o1.nombre.compareTo(o2.nombre);    }
          };*/
     
        Collections.sort(misClientes,(o1,o2)-> o1.nombre.compareTo(o2.nombre));
       // Collections.sort(misClientes,new comparaNombre() );
        System.out.println("Los clientes son "+ misClientes.toString());
        
        Collections.sort(misClientes,(e,f)-> e.edad-f.edad);
       
     }
    
}
