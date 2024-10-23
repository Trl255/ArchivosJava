/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manejolambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author profesor
 */
public class CreandoInterfaceFuncional {
     public static void main(String[] args){
          List <Cliente> misClientes = new ArrayList<>();
        misClientes.add(new Cliente("91111111P","Manolo",22));
        misClientes.add(new Cliente("12547896S","Beatriz",35));
        misClientes.add(new Cliente("11111112Q","Luis",45));
        misClientes.add(new Cliente("21111111A","Ana",66));
        //System.out.println("Los clientes son "+ misClientes.toString());
        //Collections.sort(misClientes);
        //SumarEdad <Cliente> listado = e->(e.edad)+1;
        SumarEdad <Cliente> listado = e-> (e.edad);
        int sumaTotal=0;
        for(Cliente valor:misClientes)
           valor.edad+=valor.edad;             //listado.sumaUno(valor);
            
//System.out.println("Los clientes son "+ misClientes.toString());
     }
}
interface SumarEdad <T>{
    int sumaUno(T t);
    
}

