/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 4.	A partir de una lista de 100 enteros aleatorios menores que 1000:
a.	Determina cuales son primos
b.	Determina cual es el mayor, el menor, la suma de todos ellos y el valor promedio.

 */
public class Ejercicio4 {
     public static void main(String[]args){
        List <Integer> todosNumeros = new ArrayList<>();
        int valor=0;
        for(int i=0;i<100;i++){
            valor=(int)(Math.random()*998+2);
            todosNumeros.add(valor);
        }
        //Cuales son primos está hecho en el ejercicio 1
        int numeroMayor = todosNumeros.stream()
                                        .mapToInt(e->e).max().getAsInt();
        int numeroMenor = todosNumeros.stream()
                                        .mapToInt(e->e).min().getAsInt();
        int suma = todosNumeros.stream()
                                        .mapToInt(e->e).sum();
        int otraSuma = todosNumeros.stream().reduce(0,(a,b)-> (a+b));
        double media =todosNumeros.stream()
                                        .mapToInt(e->e).average().getAsDouble();
         System.out.println("El maximo es: "+numeroMayor +" El mínimo es: "+numeroMenor +" la suma es "+suma
         +" y la media es: "+media);
         System.out.println("La otra suma es "+otraSuma);
                                       
     }
}
