package Ejercicio1y2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
1.1-Crear un método estático que compruebe si un número entero que le pasamos
como argumento es primo o no lo es.

1.2-Aprovechando el ejercicio anterior crear una aplicación que genere una lista de
100 números aleatorios entre 2 y 1000 y a partir de ella cree otra lista con los
números primos sin repetir*/
public class ListaNumerosPrimos {

    public static void main(String[] args) {
        List<Integer> todosNumeros = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
        todosNumeros.add(generarNumeroAleatorio(2,1000));
            
        }
        /*   List <Integer> numerosPrimos = todosNumeros.stream()
                .filter(e->Metodos.esPrimo(e))
                .distinct()
                .collect(Collectors.toList());*/
        //AQUI ESTA CON LISTA ARRAYLIST
        
        ArrayList<Integer> numerosPrimos = todosNumeros.stream()
                .filter(e -> esPrimo(e))
                .sorted()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println("Todos los valores ");
        for (Integer valorTodos : todosNumeros) {
            System.out.println(valorTodos.toString());
        }
        
        System.out.println("ArrayList de primos "+numerosPrimos);
        
        //AQUI ESTA CON ARRAY
        
        Integer[] arrayPrimos = todosNumeros.stream()
                .filter(e -> Metodos.esPrimo(e))
                .sorted()
                .distinct()
                .toArray(Integer[]::new);
        System.out.println("Primos con Array    "+Arrays.toString(arrayPrimos));

    }

    static boolean esPrimo(int n) {
        boolean primo = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                primo = false;
            }
            break;
        }
        return primo;
    }
   static int generarNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

}
