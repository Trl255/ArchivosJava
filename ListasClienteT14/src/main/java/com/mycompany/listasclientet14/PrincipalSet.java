/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listasclientet14;

import com.mycompany.listasclientet14.Cliente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author profesor
 */
public class PrincipalSet {
    public static void main(String []args){
        Set <Cliente> clientes= new TreeSet<>();
        clientes.add(new Cliente("11111111A","Mario"));
        clientes.add(new Cliente("99999999V","Elena"));
        clientes.add(new Cliente("23456869T","Lara"));
        clientes.add(new Cliente("12547854W","Oliver"));
        clientes.add(new Cliente("11111111A","Mario"));
       /* for(Cliente valor:clientes){
            System.out.println(valor.toString());
        }*/
       mostrarLista(clientes);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el dni del usuario que quieres borrar");
        String valor=entrada.nextLine();
        Iterator <Cliente> it= clientes.iterator();
        while(it.hasNext()){
            Cliente borrar=it.next();
            if(valor.equals(borrar.dni))
                it.remove();
        }
       /* while(it.hasPrevious()){
            System.out.println("Recorrido hacia atrás");
            System.out.println(it.previous().toString());
        }
       /* it=clientes.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
       mostrarLista(clientes);
       Collections.sort(clientes);*/
       mostrarLista(clientes);
        
    }
    static void mostrarLista(Set <Cliente> clientesPasados){
        Iterator <Cliente> ite = clientesPasados.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next().toString());
        }
    }
    
}
