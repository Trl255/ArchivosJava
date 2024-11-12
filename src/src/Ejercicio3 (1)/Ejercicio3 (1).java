/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 3.	Crea una lista con 40 números enteros aleatorios entre -20 y 20. A partir de ella
 * crea dos Stream, uno con los números positivos y otro con los negativos todos ellos sin 
 * repetir. Muestra por pantalla el número de elemento de cada Stream. Crear otro Stream 
 * para contar los números entre -10 y 10 incluidos, sin repeticiones.
 */
public class Ejercicio3 {
    public static void main(String [] args){
        List <Integer> numerosAleatorios = new ArrayList<>();
        int valor=0;
           for(int i=0;i<40;i++){
            valor=(int)((Math.random()*41)-20);
            
            numerosAleatorios.add(valor);}
            Stream <Integer> positivos =numerosAleatorios.stream();
               System.out.println("Los numeros positivos son");
            
                           positivos.filter(e->e>0)
                           .distinct()
                           .forEach(e->System.out.println(""+e));
                   System.out.println("Los numeros negativos son");    
                     numerosAleatorios.stream()
                           .filter(e->e<0)
                           .distinct()
                           .forEach(e->System.out.println(""+e));
            Stream <Integer> entreDos = numerosAleatorios.stream();
               long contados= entreDos.filter(e-> (e<=10 && e>=-10))
                       .distinct()
                        .count();
               System.out.println("Los valores entre 10 y -10 son "+contados);
        }
    }
    
