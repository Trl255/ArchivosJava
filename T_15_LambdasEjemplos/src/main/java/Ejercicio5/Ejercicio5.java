/*
5.  A partir de una lista con los enteros del 1 al 100, crea un Stream con los múltiplos
de 7 y muéstralos por pantalla.*/
package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

/**
 * A partir de una lista con los enteros del 1 al 100, crea un Stream con los
 * múltiplos de 7 y muéstralos por pantalla.
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        
        
        
        
        
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numeros.add((int) Math.floor(Math.random() * (100 - 0 + 1) + (0)));
        }
        numeros.stream()
                .filter(e -> e % 7 == 0)
                .sorted()
                .distinct()
                .forEach(System.out::println);

    }

}
