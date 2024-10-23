/*  
    4.	A partir de una lista de 100 enteros aleatorios menores que 1000:
     a.	Determina cuales son primos
     b.	Determina cual es el mayor, el menor, la suma de todos ellos y el valor promedio.
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ejercicio4 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            numeros.add(generarNumeroAleatorio(1, 100));
        }
        ArrayList<Integer> primos = numeros.stream()
                .filter(e -> esPrimo(e))
                .sorted()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(primos);//esta con lista, Si fuera un Array para mostrar se necesitaria Arrays.toString(primos)

        int mayor = numeros.stream()
                .mapToInt(e -> e).max().getAsInt();

        int menor = numeros.stream()
                .mapToInt(e -> e).min().getAsInt();

        int suma = numeros.stream()
                .mapToInt(e -> e).sum();
        int deOtraManeraSuma = numeros.stream()
                .reduce(0, (a, b) -> (a + b));
        double media =numeros.stream()
                .mapToDouble(e -> e).average().getAsDouble();
        
        System.out.printf("El valor menor es: "+menor+"\nEl valor mayor es: "+mayor+"\nLa suma total es: "+suma+"\nLa media es : "+media);
        
        System.out.println("La otra suma es: "+deOtraManeraSuma);
        


        /*
        List<Integer> todosNumeros = new ArrayList<>();
        int valor = 0;
        for (int i = 0; i < 100; i++) {
            valor = (int) (Math.random() * 998 + 2);
            todosNumeros.add(valor);
        }
        //Cuales son primos está hecho en el ejercicio 1
        int numeroMayor = todosNumeros.stream()
                .mapToInt(e -> e).max().getAsInt();
        int numeroMenor = todosNumeros.stream()
                .mapToInt(e -> e).min().getAsInt();
        int suma = todosNumeros.stream()
                .mapToInt(e -> e).sum();
        int otraSuma = todosNumeros.stream().reduce(0, (a, b) -> (a + b));
        double media = todosNumeros.stream()
                .mapToInt(e -> e).average().getAsDouble();
        System.out.println("El maximo es: " + numeroMayor + " El mínimo es: " + numeroMenor + " la suma es " + suma
                + " y la media es: " + media);
        System.out.println("La otra suma es " + otraSuma);
         */
    }

    static int generarNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
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

}
