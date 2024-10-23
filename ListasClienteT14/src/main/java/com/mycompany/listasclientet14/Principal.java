/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listasclientet14;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


/**
 *
 * @author profesor
 */
public class Principal {
    public static void main(String []args){
        List <Cliente> clientes= new LinkedList<>();
        clientes.add(new Cliente("11111111A","Mario"));
        clientes.add(new Cliente("99999999V","Elena"));
        clientes.add(new Cliente("23456869T","Lara"));
        clientes.add(new Cliente("12547854W","Oliver"));
        clientes.add(new Cliente("11111111A","Mario"));
       /* for(Cliente valor:clientes){
            System.out.println(valor.toString());
        }*/
     //  mostrarLista(clientes);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el dni del usuario que quieres borrar");
        String valor=entrada.nextLine();
        ListIterator <Cliente> it= clientes.listIterator();
        while(it.hasNext()){
            Cliente borrar=it.next();
            if(valor.equals(borrar.dni))
                it.remove();
        }
        while(it.hasPrevious()){
            System.out.println("Recorrido hacia atrás");
            System.out.println(it.previous().toString());
        }
        /*it=clientes.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }*/
       mostrarLista(clientes);
       Collections.sort(clientes);
        System.out.println("Ordenados por dni");
       mostrarLista(clientes);
     //  OrdenarPorNombre objeto= new OrdenarPorNombre();
       Collections.sort(clientes, new OrdenarPorNombre());
        System.out.println("Ordenado por nombre");
       mostrarLista(clientes); 
       
    }
    static void mostrarLista(List <Cliente> clientesPasados){
        Iterator <Cliente> ite = clientesPasados.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next().toString());
        }
    }
    
}
