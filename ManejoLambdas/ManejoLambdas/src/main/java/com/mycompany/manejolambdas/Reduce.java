/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manejolambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author IFC303-1
 */
public class Reduce {
    public static void main(String[] args) {
            List <Cliente> misClientes = new ArrayList<>();
        misClientes.add(new Cliente("91111111P","Manolo",22));
        misClientes.add(new Cliente("12547896S","Beatriz",35));
        misClientes.add(new Cliente("11111112Q","Luis",45));
        misClientes.add(new Cliente("24555556W","Arturo",46));
        misClientes.add(new Cliente("21111111A","Ana",66));
        Stream<Cliente> clientes=misClientes.stream();
        
        int valor=clientes.mapToInt(e->e.edad).reduce(0,(a,b)->a+b);
        System.out.println("El reduce es:\n"+valor);
        
        
        
}
}
