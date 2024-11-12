/*
Realizar una aplicación donde a partir de dos listas de enteros ordenadas en
sentido creciente, obtengamos una única lista, también ordenada, fusión de las
dos anteriores. 
 */
package Ejercicio9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio9 {
     public static void main(String []args){
     List <Integer> lista1 = new ArrayList<>();
     int valor=0;
    for(int i=0;i<20;i++){
            valor=(int)(Math.random()*99+1);
            lista1.add(valor);
     }
    lista1 = lista1.stream().sorted().collect(Collectors.toCollection((ArrayList::new)));
    List <Integer> lista2 = new ArrayList<>();
    for(int i=0;i<20;i++){
            valor=(int)(Math.random()*99+1);
            lista2.add(valor);}
    lista2 = lista2.stream().sorted().collect(Collectors.toCollection((ArrayList::new)));
    //En este caso los valores pueden estar repetidos, si no los quisieramos asi podemos usas
    //distinct
     ArrayList <Integer> unida = Stream.concat(lista1.stream(), lista2.stream())
             .sorted()
             .collect(Collectors.toCollection((ArrayList::new)));
     for(Integer numeros:unida)
             System.out.println("Numeros: "+numeros);

    }
}
