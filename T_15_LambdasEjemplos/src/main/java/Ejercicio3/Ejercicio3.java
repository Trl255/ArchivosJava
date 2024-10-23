/*
    3. Crea una lista con 40 números enteros aleatorios entre -20 y 20. A partir de ella
    crea dos Stream, uno con los números positivos y otro con los negativos todos
    ellos sin repetir. Muestra por pantalla el número de elemento de cada Stream.
    Crear otro Stream para contar los números entre -10 y 10 incluidos, sin
    repeticiones. */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio3 {
    public static void main(String [] args){
        ArrayList <Integer> numerosAleatorios= new ArrayList<>();
        
        for (int i=0; i<=40 ; i++ ){
            numerosAleatorios.add(generarNumeroAleatorio(-20, 20));
            }
        
        Stream <Integer> positivos=numerosAleatorios.stream();
                System.out.println("Los numeros positivos son");
                
                    positivos.filter(e-> e>0)
                    .sorted()
                    .distinct()
                    .forEach(e->System.out.println(e));
        
        Stream <Integer> negativos=numerosAleatorios.stream();
                System.out.println("Los numeros negativos son");
                
                    negativos.filter(e-> e<0)
                    .sorted()
                    .distinct()
                    .forEach(e-> System.out.println(e));
       Stream <Integer> posYneg= numerosAleatorios.stream();
               long contados=posYneg
               .filter(e->(e>=-10 && e<=10))
               .sorted()
               .distinct()
               .count();
               long igualAcero=numerosAleatorios.stream()
                       .filter(e ->e==0)
                       .distinct()
                       .count();
               boolean hayCero= igualAcero>0 ? true: false;
               
               System.out.println(hayCero ? "La cantidad de números no repetidos entre 10 y -10 son:\n"+contados+ " y existe un cero en la lista" : "La cantidad de números no repetidos entre 10 y -10 son:\n"+contados+", no hay ceros en la lista");
               
        }
    static int generarNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }
    }
    
