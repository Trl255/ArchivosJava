/*Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos entre los números deseados, por último nos indica cual es el mayor de todos.

Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo métodos que necesites.*/
package Encasa;

import java.util.Scanner;

public class DD_ejercicio_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de valores");
        int a = sc.nextInt();
        int array[] = new int[a];
        int[] valores = datos(array);
        System.out.println("Los números primos de la anterior lista son:");
        int[] Lprimos = primos(valores);
        mayor(valores);

    }

    public static int[] datos(int[] valores) {
        int[] arrayL = new int[valores.length];
        int a = 0;
        for (int i = 0; i < valores.length; i++) {
            a = (int) (Math.random() * 99);
            arrayL[i] = a;
            System.out.println("" + arrayL[i]);
        }

        return arrayL;

    }

    public static int[] primos(int[] valores) {
        int cont = 0;
        for (int x = 0; x < valores.length; x++) {
            if (valores[x] % 2 == 1) {
                cont++;
            }

        }
        int[] primosArray = new int[cont];
        int indice = 0;
        for (int y = 0; y < valores.length; y++) {
            if (valores[y] % 2 == 1) {
                primosArray[indice] = valores[y];
                System.out.println(+primosArray[indice]);
            }

        }
        return primosArray;
    }

    public static void mayor(int[] primos) {
        int mayor = 0;
        for (int i = 0; i < primos.length; i++) {
            if (primos[i] > mayor) {
                mayor = primos[i];

            }

        }
        System.out.println("El número mayor es: " + mayor);

    }
}
