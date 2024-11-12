/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

/**
A partir de una lista con los enteros del 1 al 100, crea un Stream con los múltiplos
de 7 y muéstralos por pantalla.
 */
public class Ejercicio5 {
    public static void main(String [] args){
     List <Integer> todosNumeros = new ArrayList<>();
     int valor=0;
    for(int i=0;i<100;i++){
            valor=(int)(Math.random()*99+1);
            todosNumeros.add(valor);
}
    todosNumeros.stream().filter(e->e%7==0).forEach(System.out::println);
   
}
    
}
