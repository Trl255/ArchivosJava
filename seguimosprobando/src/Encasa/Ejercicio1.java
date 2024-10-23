/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice y el valor al que corresponde. 
Haz dos métodos, uno para rellenar valores y otro para mostrar.*/
package Encasa;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Cuantos números desea introducir");
     int n=sc.nextInt();
     int array[]=new int [n];
     peticion(array);
     mostrar(array);
     orden(array);
                
    }static void peticion(int arr[]){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
        System.out.println("Introduzca el valor número "+(i+1));
        arr[i]=sc.nextInt();
    }       
        }
        static void mostrar(int arr[]){
            for (int i=0; i<arr.length; i++){
             System.out.println(+arr[i]+" Es el valor de " +i);   
            }
}
        static void orden(int []numeros){//Metodo de la burbuja
       for (int i=0; i<numeros.length; i++){
        for (int x=i+1; x<numeros.length ; x++){
            if (numeros[x]<numeros[i]){
                int aux=numeros[x];
                numeros[x]=numeros[i];
                numeros[i]=aux;
                 
}       
}   for ( i=0; i<numeros.length; i++){
        System.out.println(+numeros[i]);
}
            
        }
}}
    /*for (int i=0; i<numeros.length; i++){
        for (int x=i+1; x<numeros.length ; x++){
            if (numeros[x]<numeros[i]){
                int aux=numeros[x];
                numeros[x]=numeros[i];
                numeros[i]=aux;
                }
        }
        
    }
    for (int x=0; x<numeros.length ; x++){
        System.out.println(numeros[x]);*/