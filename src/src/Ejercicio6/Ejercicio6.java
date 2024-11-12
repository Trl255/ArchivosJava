/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/**
Fusiona dos listas, cada una con 20 números aleatorios del 1 al 100, en un Stream
ordenado sin repeticiones. Muestra los elementos del Stream.

 */
public class Ejercicio6 {
    public static void main(String []args){
         List <Integer> lista1 = new ArrayList<>();
     int valor=0;
    for(int i=0;i<20;i++){
            valor=(int)(Math.random()*99+1);
            lista1.add(valor);
}
        List <Integer> lista2 = new ArrayList<>();
    for(int i=0;i<20;i++){
            valor=(int)(Math.random()*99+1);
            lista2.add(valor);}
     Stream unido = Stream.concat(lista1.stream(), lista2.stream()).distinct().sorted();
     unido.forEach(System.out::println);

    }
    }

