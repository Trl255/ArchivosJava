/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1y2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author profesor
 */
public class ListaNumerosPrimos {
     public static void main(String[]args){
        List <Integer> todosNumeros = new ArrayList<>();
        int valor=0;
        for(int i=0;i<100;i++){
            valor=(int)(Math.random()*998+2);
            todosNumeros.add(valor);
        }
     /*   List <Integer> numerosPrimos = todosNumeros.stream()
                .filter(e->Metodos.esPrimo(e))
                .distinct()
                .collect(Collectors.toList());*/
     ArrayList <Integer> numerosPrimos = todosNumeros.stream()
                                .filter(e->Metodos.esPrimo(e))
                                .sorted()
                                .distinct()
                                .collect(Collectors.toCollection(ArrayList::new));
        for(Integer valorTodos:todosNumeros)
            System.out.println(valorTodos.toString());
        System.out.println(numerosPrimos);
        Integer [] arrayPrimos = todosNumeros.stream()
                                 .filter(e->Metodos.esPrimo(e))
                                 .toArray(Integer[]::new);
         System.out.println(Arrays.toString(arrayPrimos));
         
    }
       
}
