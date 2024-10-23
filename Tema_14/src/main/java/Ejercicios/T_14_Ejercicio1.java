/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Ejercicio1. Implementa una aplicación donde se piden por consola números reales hasta que
introduzcamos el valor 0. Se crearán dos listas, una con los números positivos y otra con los números
negativos. Al final se mostrará la suma de ambas colecciones. Luego se eliminan de la lista todos los
valores mayores que 5 y todos los menores que -5, después las listas se vuelven a mostrar. 
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author IFC303-1
 */
public class T_14_Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Collection<Integer> numPositivos = new ArrayList<>();
        Collection<Integer> numNegativos = new ArrayList<>();
        System.out.println("Introduce un valor");
        Integer x = sc.nextInt();

        while (x != 0) {
            System.out.println("Introduce un valor");
            x = sc.nextInt();

            if (x < 0) {
                numNegativos.add(x);

            } else if (x > 0) {
                numPositivos.add(x);
            }

        }
        System.out.println("Lista positivos " + numPositivos);
        System.out.println("Lista negativos " + numNegativos);

        Collection<Integer> nuevaLista = new ArrayList<>();

        nuevaLista.addAll(numPositivos);
        nuevaLista.addAll(numNegativos);
        System.out.println("Lista total " + nuevaLista);
        
        Iterator <Integer> it= nuevaLista.iterator();
        
        while (it.hasNext()){
            Integer variable=it.next();
            if (variable>5 || variable <-5){
                it.remove();
            }
            
        }
        for (Integer e: nuevaLista){
            System.out.println(e);
        }
        
    }
    

}
