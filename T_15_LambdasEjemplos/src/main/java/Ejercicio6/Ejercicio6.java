/*
6.  Fusiona dos listas, cada una con 20 números aleatorios del 1 al 100, en un Stream
ordenado sin repeticiones. Muestra los elementos del Stream
 */
package Ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Fusiona dos listas, cada una con 20 números aleatorios del 1 al 100, en un
 * Stream ordenado sin repeticiones. Muestra los elementos del Stream.
 *
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista1.add(generarNumeroAleatorio(1, 100));
        }
        for (int i = 0; i < 20; i++) {
            lista2.add(generarNumeroAleatorio(1, 100));
        }
        Stream fusion= Stream.concat(lista1.stream(), lista2.stream())
                .sorted()
                .distinct();
                fusion.forEach(System.out::println);
                
                long  contar= Stream.concat(lista1.stream(), lista2.stream())
                .mapToInt(e->e).count();
               System.out.println(" hay "+contar);
        
        

       /* List<Integer> lista1 = new ArrayList<>();
        int valor = 0;
        for (int i = 0; i < 20; i++) {
            valor = (int) (Math.random() * 99 + 1);
            lista1.add(valor);
        }
        List<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            valor = (int) (Math.random() * 99 + 1);
            lista2.add(valor);
        }
        Stream unido = Stream.concat(lista1.stream(), lista2.stream()).distinct().sorted();
        unido.forEach(System.out::println);*/

    }

    static int generarNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }
}
