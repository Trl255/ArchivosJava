/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 
0 y 9, al final muestra por pantalla el valor de cada posición y la suma de todos los valores. Haz un método para rellenar el array 
(que tenga como parámetros los números entre los que tenga que generar), para mostrar el contenido y la suma del array y un método 
privado para generar número aleatorio (lo puedes usar para otros ejercicios).*/
package Arrays;
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la cantidad de valore que quiere introducir");
        int n=sc.nextInt();
        int arry[]=new int [n];
       /* rellenar (arry);*/
        aleatorio(arry);
        mostrar(arry);
        
        
    }/*   static void rellenar (int arr []){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
        System.out.println("Introduzca el valor de "+(i+1));
        arr[i]=sc.nextInt();
        }
    }*/
    static void aleatorio (int lista[]){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<lista.length; i++){
          int n=(int)(Math.random()*9);
          System.out.println("introduzca el número "+n);
          lista[i]=sc.nextInt();
          
    }
}static void mostrar (int muestro[]){
    for (int i=0; i<muestro.length; i++){
        System.out.println("El valor "+muestro[i]+" es el indice "+i);
    }
    
}
}