/*

 */
package com.mycompany.manejolambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author IFC303-1
 */
public class Funtion {
         public static void main(String[] args){
          List <Cliente> misClientes = new ArrayList<>();
        misClientes.add(new Cliente("91111111P","Manolo",22));
        misClientes.add(new Cliente("12547896S","Beatriz",35));
        misClientes.add(new Cliente("11111112Q","Luis",45));
        misClientes.add(new Cliente("21111111A","Ana",66));
        System.out.println("Los clientes son "+ misClientes.toString());
        Collections.sort(misClientes);
        
        List <String> listarNombres= new ArrayList<>();
        
        
        Function <Cliente, String> sacarNombre= e-> e.nombre;
        
        for (Cliente e: misClientes){
        
            listarNombres.add(sacarNombre.apply(e));
                }
                    System.out.println(listarNombres);

        }
     }


