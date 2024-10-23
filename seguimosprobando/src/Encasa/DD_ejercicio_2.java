/*Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9, 
al final muestra por pantalla el valor de cada posición y la suma de todos los valores. Haz un método para rellenar el array 
(que tenga como parámetros los números entre los que tenga que generar), para mostrar el contenido y la suma del array y un método privado 
para generar número aleatorio (lo puedes usar para otros ejercicios)*/
package Encasa;

import java.util.Scanner;

public class DD_ejercicio_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        System.out.println("Introduzca la cantidad de valores a introducir");
        a = Metodos.comprobarEntero();
        int nArray[] = new int[a];
        int[] valores = rellenar(nArray);
        mostrar(valores);

    }

    public static int[] rellenar(int[] valores) {
        int[] valor = new int[valores.length];
        int suma = 0;

        for (int i = 0; i < valores.length; i++) {
            valor[i] = (int) (Math.random() * 9 + 1);
        }
        for (int x = 0; x < valores.length; x++) {
            System.out.println("" + valor[x]);
            suma += valor[x];
        }
        System.out.println("Los número sumado son: " + suma);

        return valor;

    }

    public static void mostrar(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("El " + valores[i] + " tiene el indice: " + i);
        }

    }

}
