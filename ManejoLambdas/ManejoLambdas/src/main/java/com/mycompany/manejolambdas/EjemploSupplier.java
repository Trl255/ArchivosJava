/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manejolambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author profesor
 */
public class EjemploSupplier {
     public static void main(String[] args){
          List <Cliente> misClientes = new ArrayList<>();
        misClientes.add(new Cliente("91111111P","Manolo",22));
        misClientes.add(new Cliente("12547896S","Beatriz",35));
        misClientes.add(new Cliente("11111112Q","Luis",45));
        misClientes.add(new Cliente("21111111A","Ana",66));
        System.out.println("Los clientes son "+ misClientes.toString());
        Collections.sort(misClientes);
        Supplier <Cliente> usuarioNuevo = ()->{return new Cliente("1254879P","Pepe",38);};
        misClientes.add(usuarioNuevo.get());
        System.out.println("Los clientes son "+ misClientes.toString());
        
        }
     }

