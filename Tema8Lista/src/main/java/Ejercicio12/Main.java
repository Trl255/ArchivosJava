/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

import java.util.Arrays;

/**
 Implementar el método no estático void insertarFinal (int nuevo) que inserta un número
entero al final de tablaEnteros[], que es un atributo no estático de la clase Main. Escribir un programa
que inicialice la tabla con los números del 1 al 10 y después la muestre por consola*/
public class Main {
    int []tablaEnteros=new int[0];
    public static void main(String []args){
        Main m=new Main();
        for(int i=1;i<10;i++){
            m.insertarFinal(i);
        }
    }
    void insertarFinal(int n){
        tablaEnteros=Arrays.copyOf(tablaEnteros, tablaEnteros.length+1);
        tablaEnteros[tablaEnteros.length-1]=n;
        
    }
    
}
